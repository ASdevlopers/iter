package com.example.iter;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TeacherDashboard extends AppCompatActivity {
    Toolbar maintoolbar;
    EditText registration_number, password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_dashboard);
        registration_number = findViewById(R.id.editTextTextPersonName2);
        password = findViewById(R.id.editTextTextPassword2);
        submit = findViewById(R.id.button4);
        maintoolbar = findViewById(R.id.toolbar3);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboard.this, Teachers_Page.class));
            }
        });
    }
}