package com.androidcodingz.sqlite;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.androidcodingz.model.UserData;
import com.androidcodingz.persistence.DBAdapter;

public class AndroidSqliteExample extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		/******************* Intialize Database *************/
		DBAdapter.init(this);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_sqlite_example);
		
		
		 // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");
        DBAdapter.addUserData(new UserData("Shubham", "9999999999"));
        DBAdapter.addUserData(new UserData("Deny", "8888888888"));
        DBAdapter.addUserData(new UserData("Shanker", "22222222222"));
        DBAdapter.addUserData(new UserData("Sam", "11111111111"));
 
        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<UserData> data = DBAdapter.getAllUserData();      
 
        for (UserData dt : data) {
            String log = "Id: "+dt.getID()+" ,Name: " + dt.getName() + " ,Phone: " + dt.getEmail();
                // Writing Contacts to log
        Log.d("Name: ", log);
        }
		//DBAdapter.getAdminNumberTop();
	}
}
