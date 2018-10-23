package com.cji.edu.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickWidget1(View view){
        Toast.makeText(view.getContext(), "Alert1", Toast.LENGTH_SHORT).show();
    }

    public void onClickWidget2(View view){
        Toast.makeText(view.getContext(), "Alert2", Toast.LENGTH_SHORT).show();
    }
}
