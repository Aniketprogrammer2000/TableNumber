package com.example.tablenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText editText;
private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editTextTextPersonName);
        textView2=findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "HELLO", Toast.LENGTH_SHORT).show();
                StringBuilder s=new StringBuilder();
                Integer num=Integer.parseInt(editText.getText().toString());


                for (int i=1;i<=10;i++)
                {
                    if (num>50000000) {
                        s.append("not valid");
                        break;
                    }
                    s.append(num+" X "+i+" = "+num*i+"\n");

            } textView2.setText(s);

            }
        });

    }
}