package com.example.lab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ThongTinAdapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<ThongTin> thongTinList;

    public ThongTinAdapter(Context context, int layout, List<ThongTin> thongTinList) {
        this.context = context;
        this.layout = layout;
        this.thongTinList = thongTinList;
    }

    @Override
    public int getCount() {
        return thongTinList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        TextView txtTen =(TextView) view.findViewById(R.id.txtTen);
        TextView txtGiamoi = (TextView) view.findViewById((R.id.txtGiamoi));
        TextView txtGiacu = (TextView) view.findViewById((R.id.txtGiacu));
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
        ImageView imgIcon = (ImageView)  view.findViewById(R.id.imageviewicon);
        ImageView imgRating = (ImageView)  view.findViewById(R.id.imageRating);

        ThongTin thongTin = thongTinList.get(i);

        txtTen.setText(thongTin.getTen());
        txtGiamoi.setText(thongTin.getGiamoi());
        txtGiacu.setText(thongTin.getGiacu());
        imgHinh.setImageResource(thongTin.getHinh());
        imgIcon.setImageResource(thongTin.getIcon());
        imgRating.setImageResource(thongTin.getRating());


        return view;
    }
}
