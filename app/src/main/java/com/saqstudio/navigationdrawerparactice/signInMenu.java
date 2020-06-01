package com.saqstudio.navigationdrawerparactice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.saqstudio.navigationdrawerparactice.customMenuInflater.customLogInMenuInflater;

public class signInMenu extends customLogInMenuInflater {
    Switch lswitch ;
    TextView ltvDisplay ;
    boolean boolLogedIn = false ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_menu);
        lswitch = findViewById( R.id.sIdLogInBool ) ;
        ltvDisplay = findViewById( R.id.tvIdMainDisplay ) ;

        lswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged( CompoundButton button , boolean isChecked ){
                        Toast.makeText(signInMenu.this , " checked Button toast == "+String.valueOf(isChecked) , Toast.LENGTH_SHORT ) .show() ;
                        boolLogedIn = !boolLogedIn  ;
                        updateUi();
                        invalidateOptionsMenu();
            }
        } )  ;

        invalidateOptionsMenu();

    }


    public void updateUi(){
        String headline = boolLogedIn ? "LoggedIn " : "Not Logged In " ;
        ltvDisplay.setText( headline ) ;
    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        menu.removeItem( boolLogedIn ?  R.id.miIdLogin : R.id.miIdLogout );

        return super.onPrepareOptionsMenu(menu);
    }
}
