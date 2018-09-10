package com.example.raj.introproject_helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().
                        getColor(R.color.colorPrimary));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().
                        getColor(R.color.teal));
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab text user inputted
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
                //put text into textview when change text button is pressed
                if ( TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Raj!");
                }
                else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset textcolor to black
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().
                        getColor(R.color.black));
                //reset background color to colorAccent
                findViewById(R.id.rootView).setBackgroundColor(getResources().
                        getColor(R.color.colorAccent));
                //reset the text back to "Hello from Raj!"
                ((TextView) findViewById(R.id.textView)).setText("Hello from Raj!");
                }
        });
    }
}