package com.example.dateapplictaion;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    DatePicker datePicker;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button=findViewById(R.id.button2);
        textView=findViewById(R.id.textView4);
        datePicker=findViewById(R.id.datePicker);
        button.setOnClickListener(view -> {
            int year=datePicker.getYear();
            int  month=datePicker.getMonth();
            int day=datePicker.getDayOfMonth();
            textView.setText(year +"/" + month + "/" + day);
        });

    }
}
