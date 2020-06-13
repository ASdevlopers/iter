package com.example.iter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentDashboard extends AppCompatActivity
{
    EditText registration_number,password;
    Toolbar maintoolbar;
    Button studentsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);
        registration_number=findViewById(R.id.editTextTextPersonName);
        password=findViewById(R.id.editTextTextPassword);
        studentsubmit=findViewById(R.id.button3);
        maintoolbar=findViewById(R.id.toolbar);
        studentsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentDashboard.this,Students_page.class));
            }
        });
    }
}