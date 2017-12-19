package com.example.user.cardview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

//Main Activity Classextending AppCompatActivity
public class MainActivity extends AppCompatActivity {

    //Making objects of toolbar,ImageViews And  FloatingActionButton
    Toolbar toolbar;
    ImageView addBtn,deleteBtn;
    FloatingActionButton floatingActionButton;

    //OnCreate Method
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);           //setting ContentView as activity_main

        //setting objects with there respective Id's
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);               //setting Toolbar
        toolbar.setTitle("Android Versions");         //setting title of toolbar
        toolbar.setTitleTextColor(getResources().getColor(R.color.toolbar_title));        //setting color of toolbar
        getSupportActionBar().openOptionsMenu();                            //method to set a optionMenu in the toolbar

        addBtn = findViewById(R.id.add_icon);
        deleteBtn = findViewById(R.id.delete_icon);
        floatingActionButton = findViewById(R.id.fab_btn);

        //Toast message
        Toast.makeText(getApplicationContext(), "Click FAB to open Card list", Toast.LENGTH_LONG).show();

        //Toast on Click of addBtn
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Add Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        //Toast on click of deleteBtn
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Delete Button is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        //Click Listener for FloatingActionButton
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast message
                Toast.makeText(getApplicationContext(), "Opening Versions..", Toast.LENGTH_SHORT).show();

                //Intent to Switch Activity
                Intent intent=new Intent(MainActivity.this,VersionListActivity.class);
                startActivity(intent);

            }
        });
    }


    //overriden method for optionMenu to Create item of Option Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


         super.onCreateOptionsMenu(menu);

         //adding object to option Menu
         menu.add("Search");
         menu.add("Setting");
   return true;
    }

    //Ocverriden Method for Option Menu for Clicking the items of OptionMenu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Toast Message
        Toast.makeText(getApplicationContext(),item.getTitle()+"is Clicked",Toast.LENGTH_SHORT).show();
        return true;
    }
}
