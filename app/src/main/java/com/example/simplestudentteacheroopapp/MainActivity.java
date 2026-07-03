package com.example.simplestudentteacheroopapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etName, etMarks;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etMarks = findViewById(R.id.etMarks);
        tvOutput = findViewById(R.id.tvOutput);

        findViewById(R.id.btnStudent).setOnClickListener(v -> handleStudent());
        findViewById(R.id.btnTeacher).setOnClickListener(v -> handleTeacher());
    }

    private void handleStudent() {
        String name = etName.getText().toString();
        String marksStr = etMarks.getText().toString();


        Student student = new Student(name);
        

        if (!marksStr.isEmpty()) {
            student.setMarks(Integer.parseInt(marksStr));
        }

        Person person = student;

        String result = "Name: " + person.getName() + "\n" +
                        person.showRole() + "\n" +
                        "Marks: " + student.getMarks();
        tvOutput.setText(result);
    }

    private void handleTeacher() {
        String name = etName.getText().toString();


        Person person = new Teacher(name);

        String result = "Name: " + person.getName() + "\n" +
                        person.showRole();
        tvOutput.setText(result);
    }
}
