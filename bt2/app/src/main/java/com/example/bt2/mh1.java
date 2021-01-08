package com.example.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mh1 extends AppCompatActivity {


        double x1, x2;
        Button btnDong;
        TextView tvNghiemPT;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mh1);
            btnDong = (Button) findViewById((R.id.btnDong));
            tvNghiemPT = (TextView) findViewById(R.id.tvNghiemPT);
            Intent callerIntent = getIntent();
            Bundle packageFormCaller = callerIntent.getBundleExtra("bt2");
            float a = packageFormCaller.getFloat("soa");
            float b = packageFormCaller.getFloat("sob");
            float c = packageFormCaller.getFloat("soc");
            tvNghiemPT.setText(GiaiPTBat2(a,b,c));
            btnDong.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
        private String GiaiPTBat2(float a, float b, float c)
        {
            float Denta = b*b - 4*a*c;
            double x1, x2;
            String kq;
            if(Denta<0)
            {
                kq = "Phuong trinh vo nghiem";
            }
            else if(Denta == 0)
            {
                x1 = (-b)/2/a;
                kq = "PT co nghiem kep x1 = x2 = "+x1;
            }
            else
            {
                x1 = (-b + Math.sqrt(Denta))/2/a;
                x2 = (-b - Math.sqrt(Denta))/2/a;
                kq = "PT co 2 nghiem phan biet: x1= "+x1 +"\n va x2= "+x2;
            }
            return kq;
        }
    }
