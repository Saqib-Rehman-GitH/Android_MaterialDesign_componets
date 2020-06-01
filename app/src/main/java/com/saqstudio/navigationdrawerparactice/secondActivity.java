package com.saqstudio.navigationdrawerparactice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.saqstudio.navigationdrawerparactice.fragments.firstFragmentClass;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        FragmentManager fragManager = getSupportFragmentManager() ;
        FragmentTransaction fragTransector = fragManager.beginTransaction();
        firstFragmentClass fragment   = new firstFragmentClass();
        fragTransector.add(R.id.fLIdFragmentContainer ,  fragment) ;
        fragTransector.commit();

    }
}
