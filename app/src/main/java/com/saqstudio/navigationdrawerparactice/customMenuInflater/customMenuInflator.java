package com.saqstudio.navigationdrawerparactice.customMenuInflater;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.saqstudio.navigationdrawerparactice.R;

public class customMenuInflator extends AppCompatActivity {

    public void changeActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

     public boolean onCreateOptionsMenu(@NonNull Menu menu){
        MenuInflater menuInflater  = getMenuInflater();
        menuInflater.inflate(R.menu.menu_items ,  menu ) ;
        return true ;
     }
     public boolean onOptionsItemSelected(@NonNull MenuItem menuItem){
        int id  = menuItem.getItemId() ;
        switch (id) {
            case(R.id.app_bar_switch):
                Toast.makeText(this , "bar switch is being tapped " , Toast.LENGTH_SHORT ) . show() ;
                return true;
            case(R.id.app_bar_search):
                Toast.makeText(this , "search bar is being tapped " , Toast.LENGTH_SHORT ) . show() ;
                return true ;

            case ( R.id.miIdHome):
                Toast.makeText(this , "Home  is being tapped " , Toast.LENGTH_SHORT ) . show() ;
                return true ;

            default:
                super.onOptionsItemSelected(menuItem) ;
                return true ;


        }
     }

}
