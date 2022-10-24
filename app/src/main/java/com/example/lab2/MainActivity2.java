package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ListView lvThongTin;
    ArrayList<ThongTin> arrayThongTin;
    ThongTinAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Anhxa();
        adapter = new ThongTinAdapter(this,R.layout.dong_thong_tin,arrayThongTin);
        lvThongTin.setAdapter(adapter);


    }

    private void Anhxa(){
        lvThongTin = (ListView) findViewById(R.id.listviewThongTin);
        arrayThongTin = new ArrayList<>();

        arrayThongTin.add(new ThongTin("Sườn nướng","12000₫","15000₫",R.drawable.suonnuong,R.drawable.rating3,R.drawable.next));
        arrayThongTin.add(new ThongTin("Gà kho","15000₫","15000₫", R.drawable.gakho,R.drawable.rating5,R.drawable.next));
        arrayThongTin.add(new ThongTin("Thịt kho trứng","12000₫","12000₫",R.drawable.thitkhotrung,R.drawable.rating4,R.drawable.next));
        arrayThongTin.add(new ThongTin("Nem nướng","15000₫","17000₫",R.drawable.nemnuong,R.drawable.rating5,R.drawable.next));


    }
}