package com.example.dummy_kotlin_project;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_show_toast).setOnClickListener(v ->
                Toast.makeText(this, "Some text", Toast.LENGTH_LONG).show()
        );
    }
}