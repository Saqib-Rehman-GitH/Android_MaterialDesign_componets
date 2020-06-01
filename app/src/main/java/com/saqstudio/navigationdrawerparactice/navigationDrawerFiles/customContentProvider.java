package com.saqstudio.navigationdrawerparactice.navigationDrawerFiles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.saqstudio.navigationdrawerparactice.MainActivity;
import com.saqstudio.navigationdrawerparactice.R;

import java.util.ArrayList;
import java.util.List;

public class customContentProvider extends AppCompatActivity {
    ArrayList contactList;
    //ArrayAdapter adapter ;
    ListView listViews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_content_provider);
        listViews = findViewById ( R.id.LvIdMainContactsView ) ;
        getContactsFromPhone();
    }

    public void getContactsFromPhone() {
        //PSUEDOCODE
        //(01)-> Check if permission is being Granted .
        //(2)-> if Not Then ask for permission from user .
        //(3) -> then first establish a connection in between the content Provider.
        //(4)->after that just extract out required data
        //(5)-> use ArrayAdapter to show data to the UI.

        if(ContextCompat.checkSelfPermission( customContentProvider.this , Manifest.permission.READ_CONTACTS )!= PackageManager.PERMISSION_GRANTED ){
            ActivityCompat.requestPermissions (customContentProvider .this , new String[] {Manifest.permission.READ_CONTACTS} , 0 ); ;
        }else{
            Cursor data = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI , null , null ,null, null ) ;
            while ( data.moveToNext() ){
                String Name =   data.getString ( data.getColumnIndex ( ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME ) ) ;
                String Number = data.getString( data.getColumnIndex ( ContactsContract.CommonDataKinds.Phone.NUMBER ) ) ;
                contactList = new ArrayList() ;
                contactList.add ( Name + "\n" + Number ) ;

            }
           ArrayAdapter adapter = new ArrayAdapter (customContentProvider.this , android.R.layout.simple_list_item_1 , contactList );
            listViews.setAdapter(adapter);
        }

    }

}
//TODOS ......
//(01)--> Difference Between ArrayList & List<String> ???
//(02)--> What is PackageManager , ContextCompat , ActivityCompat ???