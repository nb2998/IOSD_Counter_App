package com.apps.nb2998.iosd_session;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


//Contains Activity Lifecycle methods.
//Code logic in .java file and layout logic in xml file.
//Log class in android is used to print in the IDE like cout in cpp or syso in java
//To see the function definition of the funcation, bring the pointer on that funcation and press ctrl+click on it.

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView textViewCounter;

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCounter = findViewById(R.id.text_view_counter);
    }

    // onClick of button increment
    public void IncrementCounter(View view) {
        count++;
        textViewCounter.setText(String.valueOf(count));
    }

    // onClick of button decrement
    public void DecrementCounter(View view) {
        count--;
        textViewCounter.setText(String.valueOf(count));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ");
    }

    //User is using the app

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ");
        //Called when the app is partially visible for the first time
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: ");
        //Called when the app is no longer visible on the screen
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: ");
        //Called when the system decides to kill your app to free up some memory
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

