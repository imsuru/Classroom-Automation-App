package com.example.classroomautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button DBMS, button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBMS = (Button) findViewById(R.id.button);
        DBMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main2);
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, button);

                // Inflating popup menu from popup_menu.xml file
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        // Toast message on menu item clicked
                        Toast.makeText(MainActivity.this, "You Clicked " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;


                       // setContentView(R.layout.activity_main2);



                    }


                });
                // Showing the popup menu
                popupMenu.show();
            }


        });
    }
}
