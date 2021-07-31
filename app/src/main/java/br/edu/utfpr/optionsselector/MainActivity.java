package br.edu.utfpr.optionsselector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbStudent, cbMonitor, cbTeacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbStudent = findViewById(R.id.checkBoxStudent);
        cbMonitor = findViewById(R.id.checkBoxMonitor);
        cbTeacher = findViewById(R.id.checkBoxTeacher);
    }

    public void showSelected(View view) {
        String message = "";

        if (cbStudent.isChecked()) {
            message += getString(R.string.student) + "\n";
        }

        if (cbMonitor.isChecked()) {
            message += getString(R.string.monitor) + "\n";
        }

        if (cbTeacher.isChecked()) {
            message += getString(R.string.teacher) + "\n";
        }

        if (message.equals("")){
            message = getString(R.string.no_option_was_selected);
        } else {
            message = getString(R.string.selected_boxes) + " \n" + message;
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}