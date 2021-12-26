package com.example.alrtdiologcastomwithsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewUserName, textViewPassword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewUserName = findViewById(R.id.tv_username);
        textViewPassword = findViewById(R.id.tv_password);
        button = findViewById(R.id.but_open_diolog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDiolog();
            }
        });

    }

    public void openDiolog(){
        ExampleDiolog exampleDiolog = new ExampleDiolog();
        exampleDiolog.show(getSupportFragmentManager(), "example diolog");

    }

}