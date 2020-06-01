package com.saqstudio.navigationdrawerparactice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.saqstudio.navigationdrawerparactice.navigationDrawerFiles.customNavigationView;

public class MainActivity extends customNavigationView {
     DrawerLayout drawerLayout;
     ActionBarDrawerToggle toggle;
     ConstraintLayout constraintLayout ;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                constraintLayout = findViewById( R.id.clIdMainConstraintLayout ) ;
                //getSupportActionBar().
                createNavigationDrawer() ;
                changeActionBarTitle("App");


            }
            public void getActionBar(View v){
                getSupportActionBar().setDisplayHomeAsUpEnabled ( true ) ;
            }
            public void disableHomeAsUp(View v){
                getSupportActionBar().setDisplayHomeAsUpEnabled ( false );
            }
            public void goToNextActivity(View v){
                Intent i =  new Intent( MainActivity.this , secondActivity.class ) ;
                startActivity(i);

            }
            public void goToContactList(View v){
                Intent i = new Intent(MainActivity.this , customNavigationView.class ) ;
                startActivity( i ) ;
            }
            public void itemSelected(@NonNull MenuItem item ){
                Toast.makeText(MainActivity.this , " Item 1 is being selected " , Toast.LENGTH_SHORT ) .show();
                Snackbar.make(this.constraintLayout , " item1 being Selected " , Snackbar.LENGTH_LONG ) .show();
            }
            public void  goToTextInputLayoutParactice(View v){
                Intent i = new Intent(MainActivity.this , TextInputLayoutparactice.class ) ;
                startActivity( i ) ;
            }
            public void goToLoginMenu(View v){
                startActivity( new Intent (MainActivity.this , signInMenu.class ) ) ;
            }
}
