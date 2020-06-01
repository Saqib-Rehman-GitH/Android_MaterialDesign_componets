package com.saqstudio.navigationdrawerparactice.navigationDrawerFiles;

import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.saqstudio.navigationdrawerparactice.R;
import com.saqstudio.navigationdrawerparactice.customMenuInflater.customMenuInflator;

public class customNavigationView extends customMenuInflator {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

            public  void createNavigationDrawer(){

                drawerLayout = findViewById ( R.id.DlIdmainDrawerLayout ) ;
                navigationView = findViewById ( R.id.NvIdMainNavigationView ) ;
                toggle = new ActionBarDrawerToggle(this , drawerLayout , R.string.Open, R.string.Close )  ;
                drawerLayout.addDrawerListener( toggle );
                toggle.syncState();

                getSupportActionBar().setDisplayHomeAsUpEnabled ( true ) ;

            }

}
