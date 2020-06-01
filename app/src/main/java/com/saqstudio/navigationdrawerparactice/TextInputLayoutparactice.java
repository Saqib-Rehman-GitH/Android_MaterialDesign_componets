package com.saqstudio.navigationdrawerparactice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toolbar;

import com.google.android.material.textfield.TextInputLayout;

public class TextInputLayoutparactice extends AppCompatActivity {
    TextInputLayout tilName , tilEmail , tilPassword ;
    EditText etName , etEmail , etPassword ;
    ActionBar actionBar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layoutparactice);
        widgetsInitialization();
        actionBar = getSupportActionBar();
        actionBar.setTitle( " User LogIn Page" );

    }

    public void widgetsInitialization(){
        etName = findViewById ( R.id.etIdUserName ) ;
        etEmail = findViewById ( R.id.etIdUserEmail ) ;
        etPassword = findViewById ( R.id.etIdUserPassword ) ;

        tilName = findViewById ( R.id.tilIdUserName ) ;
        tilEmail = findViewById ( R.id.tilIdUserEmail ) ;
        tilPassword = findViewById ( R.id.tilIdUserPassword ) ;

        tilPassword.setHelperText(" Password must be  char Long ");
    }
    public void checkSignUp(View v){
        if(etName .getText().toString().isEmpty()){
           tilName.setError("No Name filled" ) ;
        }else{
            tilName.setErrorEnabled( false ) ;
        }
        if(etPassword .getText() . toString().length() <=7 ){
            tilPassword.setError("Password must Be * char Long") ;
        }else{
            tilPassword.setErrorEnabled(false) ;
        }

    }
}
//TExtInputLAyout is an Additional api  that wraps editText and give them a good look and some additional featres.