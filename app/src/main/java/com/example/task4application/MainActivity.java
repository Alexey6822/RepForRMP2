package com.example.task4application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tInfo;
    EditText eInput;
    Button control;
    int r;
    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tInfo = (TextView)findViewById(R.id.txt);
        eInput = (EditText)findViewById(R.id.edittxt);
        control = (Button)findViewById((R.id.but));
        r = (int)(Math.random()*100);
        flag = false;

    }

    public void onClick(View v){
        if(!flag) {
            int chek = Integer.parseInt(eInput.getText().toString());
            if (chek>r)
                tInfo.setText(getResources().getString(R.string.txtmany));
            if (chek<r)
                tInfo.setText(getResources().getString(R.string.txtsmall));
            if (chek==r) {
                tInfo.setText(getResources().getString(R.string.txtsuc));
                control.setText(getResources().getString(R.string.buttxt2));
                flag = true;
            }
        }
        else {
            r = (int)(Math.random()*100);
            control.setText(getResources().getString(R.string.buttxt1));
            tInfo.setText(getResources().getString(R.string.txtstart));
            flag = false;
        }
    }

}