package com.hackteachz.pr_11_checkboxesselected;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox ch1,ch2,ch3,ch4,ch5;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1=findViewById(R.id.ch1);
        ch2=findViewById(R.id.ch2);
        ch3=findViewById(R.id.ch3);
        ch4=findViewById(R.id.ch4);
        ch5=findViewById(R.id.ch5);
        b1=findViewById(R.id.submit);
        StringBuffer sb = new StringBuffer("You Selected : ");
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (ch1.isChecked())
                    sb.append("Java");
                if (ch2.isChecked())
                    sb.append("C++");
                if (ch3.isChecked())
                    sb.append("C");
                if (ch4.isChecked())
                    sb.append("Python");
                if (ch5.isChecked())
                    sb.append("Android");
                Toast.makeText(MainActivity.this, sb, Toast.LENGTH_SHORT).show();
            }
        });
    }
}