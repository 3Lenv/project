package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvComTrua;
    ArrayList<ComTrua> arrayComTrua;
    ComTruaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        adapter = new ComTruaAdapter(this, R.layout.dong_com_trua, arrayComTrua);
        lvComTrua.setAdapter(adapter);

        lvComTrua.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent= new Intent();
                    intent.setClass(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void Anhxa(){
        lvComTrua = (ListView) findViewById(R.id.listviewComTrua);
        arrayComTrua = new ArrayList<>();

        arrayComTrua.add(new ComTrua("Món mặn","5 đang giảm giá","5 sản phẩm",R.drawable.monman,R.drawable.spoon_fork,R.drawable.coupon,R.drawable.next));
        arrayComTrua.add(new ComTrua("Món canh","10 đang giảm giá","10 sản phẩm", R.drawable.moncanh,R.drawable.spoon_fork,R.drawable.coupon,R.drawable.next));
        arrayComTrua.add(new ComTrua("Món xào","10 đang giảm giá","10 sản phẩm",R.drawable.monxao,R.drawable.spoon_fork,R.drawable.coupon,R.drawable.next));


    }
}