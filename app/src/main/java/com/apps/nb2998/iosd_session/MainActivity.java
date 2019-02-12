package com.apps.nb2998.iosd_session;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView textViewCounter;

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
}
