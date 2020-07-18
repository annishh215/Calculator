package com.example.rajnikanthcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;
    private Button b15,b16,b17,b18,b19,b20;
    private EditText et2,et1;
    private boolean a,s,m,d,p,e;
    private float n1,n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b0 = (Button)findViewById(R.id.b0);
        Button b1 = (Button)findViewById(R.id.b1);
        Button b2 = (Button)findViewById(R.id.b2);
        Button b3 = (Button)findViewById(R.id.b3);
        Button b4 = (Button)findViewById(R.id.b4);
        Button b5 = (Button)findViewById(R.id.b5);
        Button b6 = (Button)findViewById(R.id.b6);
        Button b7 = (Button)findViewById(R.id.b7);
        Button b8 = (Button)findViewById(R.id.b8);
        Button b9 = (Button)findViewById(R.id.b9);
        Button b10 = (Button)findViewById(R.id.b10);
        Button b11 = (Button)findViewById(R.id.b11);
        Button b12 = (Button)findViewById(R.id.b12);
        Button b13 = (Button)findViewById(R.id.b13);
        Button b14 = (Button)findViewById(R.id.b14);
        Button b15 = (Button)findViewById(R.id.b15);
        Button b16 = (Button)findViewById(R.id.b16);
        Button b17 = (Button)findViewById(R.id.b17);
        Button b18 = (Button)findViewById(R.id.b18);
        Button b19 = (Button)findViewById(R.id.b19);
        Button b20 = (Button)findViewById(R.id.b20);
        final EditText et2 = (EditText) findViewById(R.id.et);
        final EditText et1 = (EditText)findViewById(R.id.et1) ;

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+"9");
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+".");
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+"(");
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(et2.getText()+")");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et2==null){
                    et2.setText("");
                }else{
                    n1=Float.parseFloat(et2.getText()+"");
                    et2.setText(et2.getText()+"+");
                    a=true;
                    et1.setText(et2.getText());
                    et2.setText(null);
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et2==null){
                    et2.setText("");
                }else{
                    n1=Float.parseFloat(et2.getText()+"");
                    et2.setText(et2.getText()+"-");
                    s=true;
                    et1.setText(et2.getText());
                    et2.setText(null);
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et2==null){
                    et2.setText("");
                }else{
                    n1=Float.parseFloat(et2.getText()+"");
                    et2.setText(et2.getText()+"X");
                    m=true;
                    et1.setText(et2.getText());
                    et2.setText(null);
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et2==null){
                    et2.setText("");
                }else{
                    n1=Float.parseFloat(et2.getText()+"");
                    et2.setText(et2.getText()+"/");
                    d=true;
                    et1.setText(et2.getText());
                    et2.setText(null);
                }
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et2==null){
                    et2.setText("");
                }else{
                    n1=Float.parseFloat(et2.getText()+"");
                    et2.setText(et2.getText()+"%");
                    p=true;
                    et1.setText(et2.getText());
                    et2.setText(null);
                }
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et2==null){
                    et2.setText("");
                }else{
                    n1=Float.parseFloat(et2.getText()+"");
                    et2.setText(et2.getText()+"^");
                    e=true;
                    et1.setText(et2.getText());
                    et2.setText(null);
                }
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2=Float.parseFloat(et2.getText()+"");
                et2.setText("");
                et1.setText(null);
                if (a==true){
                    et1.setText(n1+n2+"");
                    a=false;
                }
                if (s==true){
                    et1.setText(n1-n2+"");
                    s=false;
                }
                if (m==true){
                    et1.setText(n1*n2+"");
                    m=false;
                }
                if (d==true){
                    et1.setText(n1/n2+"");
                    d=false;
                }
                if (p==true){
                    et1.setText((n1/100)*n2+"");
                    p=false;
                }
                if (e==true){
                    et1.setText(Math.pow(n1,n2)+"");
                    e=false;
                }
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText("");
                et1.setText("");
            }
        });

    }

}
