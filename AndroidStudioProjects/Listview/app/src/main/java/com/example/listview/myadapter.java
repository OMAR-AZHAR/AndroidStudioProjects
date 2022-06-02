package com.example.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class myadapter extends ArrayAdapter {
    Activity context;
    String [] vals;
    int[] imgs;
    public myadapter(Activity c,String[] s,int[] i){

       super(c.getApplicationContext(),R.layout.mylist,s);
        context=c;
        vals=s;
        imgs=i;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflat=context.getLayoutInflater();
        View v=inflat.inflate(R.layout.mylist,null);
        ImageView img1=(ImageView)v.findViewById(R.id.img1);
        TextView tv=(TextView)v.findViewById(R.id.tv1);
        img1.setImageResource(imgs[position]);
        tv.setText(vals[position]);
        return v;
    }


}
