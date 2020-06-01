package com.saqstudio.navigationdrawerparactice.customMenuInflater;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.saqstudio.navigationdrawerparactice.R;

public class customLogInMenuInflater extends AppCompatActivity {
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate( R.menu.login_menu , menu ) ;

        return true ;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId() ;
        switch (id){
            case(R.id.miIdLogin):
                Toast.makeText( this , " Login Being Clicked " , Toast.LENGTH_SHORT ).show ();
                return true ;
            case (R.id.miIdLogout ):
                Toast.makeText( this , " Logout Being Clicked " , Toast.LENGTH_SHORT ).show ();
                return true ;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
