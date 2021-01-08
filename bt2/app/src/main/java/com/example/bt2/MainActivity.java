package com.example.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText hsa, hsb, hsc;
    Button btnGiai;

    float a, b, c;
    double x1, x2;
    Button btnDong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hsa = (EditText) findViewById((R.id.txtA));
        hsb = (EditText) findViewById((R.id.txtB));
        hsc = (EditText) findViewById((R.id.txtC));

        btnGiai = (Button) findViewById((R.id.btnGiai));
        btnDong = (Button) findViewById((R.id.btnDong));

        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, mh1.class);
                Bundle bundle = new Bundle();
                a = Float.parseFloat(hsa.getText().toString());
                b = Float.parseFloat(hsb.getText().toString());
                c = Float.parseFloat(hsc.getText().toString());
                bundle.putFloat("soa", a);
                bundle.putFloat("sob", b);
                bundle.putFloat("soc", c);
                myIntent.putExtra("bt2", bundle);
                startActivity(myIntent);
            }
        });
    }
}