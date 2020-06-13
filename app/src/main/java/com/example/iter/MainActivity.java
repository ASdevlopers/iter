package com.example.iter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    Button studentbutton,teacherbuutton;
    ProgressBar studentprogressbar,teacherprogressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    studentbutton=findViewById(R.id.button);
    teacherbuutton=findViewById(R.id.button2);
    //studentprogressbar=findViewById(R.id.progressBar);
    //teacherprogressbar=findViewById(R.id.progressBar2);

    studentbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //studentprogressbar.setVisibility(View.VISIBLE);
            startActivity(new Intent(MainActivity.this,StudentDashboard.class));
        }
    });

    teacherbuutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //teacherprogressbar.setVisibility(View.VISIBLE);
            startActivity(new Intent(MainActivity.this,TeacherDashboard.class));
        }
    });

    }
}