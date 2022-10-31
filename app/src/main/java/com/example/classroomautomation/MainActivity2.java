package com.example.classroomautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Switch fan1;
    Switch fan2;
    Switch fan3;
    Switch fan4;
    Switch Light1;
    Switch Light2;
    Switch Light3;
    Switch Light4;
    Switch Light5;
    Switch Light6;
    Switch Light7;
    Switch Light8;



    protected void onCreate(Bundle savedInstanceState, Object view) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // initiate view's

        fan1 = findViewById(R.id.fan1);
        fan2 = findViewById(R.id.fan2);
        fan3 = findViewById(R.id.fan3);
        fan4 = findViewById(R.id.fan4);

        Light1 = findViewById(R.id.Light1);
        Light2 = findViewById(R.id.Light2);
        Light3 = findViewById(R.id.Light3);
        Light4 = findViewById(R.id.Light4);
        Light5 = findViewById(R.id.Light5);
        Light6 = findViewById(R.id.Light6);
        Light7 = findViewById(R.id.Light7);
        Light8 = findViewById(R.id.Light8);


    }
}
