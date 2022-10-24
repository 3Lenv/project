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

public class ComTruaAdapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private List<ComTrua> comTruaList;

    public ComTruaAdapter(Context context, int layout, List<ComTrua> comTruaList) {
        this.context = context;
        this.layout = layout;
        this.comTruaList = comTruaList;
    }


    @Override
    public int getCount() {
        return comTruaList.size();
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
        TextView txtGiamgia = (TextView) view.findViewById((R.id.txtGiamgia));
        TextView txtSanpham = (TextView) view.findViewById((R.id.txtSanpham));
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
        ImageView imgIcon1 = (ImageView)  view.findViewById(R.id.imageviewicon1);
        ImageView imgIcon2 = (ImageView)  view.findViewById(R.id.imageviewicon2);
        ImageView imgIcon3 = (ImageView)  view.findViewById(R.id.imageviewicon3);

        ComTrua comtrua = comTruaList.get(i);

        txtTen.setText(comtrua.getTen());
        txtGiamgia.setText(comtrua.getGiamGia());
        txtSanpham.setText(comtrua.getSanPham());
        imgHinh.setImageResource(comtrua.getHinh());
        imgIcon1.setImageResource(comtrua.getIcon1());
        imgIcon2.setImageResource(comtrua.getIcon2());
        imgIcon3.setImageResource(comtrua.getIcon3());

        return view;
    }
}
