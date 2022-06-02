package com.example.sp18_bse_043_recview;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recvw extends RecyclerView.Adapter<recvw.myViewHolder> {
    int [] pics = new int[]{R.drawable.c1,R.drawable.s2,R.drawable.serpent,R.drawable.a2};
    String [] names = new String[]{"Abbottabad","Islamabad","Lahore","Multan"};
    String [] description = new String[]{"Abbottabad is beautiful city","Islamabad is pakistan's capital","Lahore has a rich history","Multan is the city of saints"};
    @NonNull
    @Override
    public recvw.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recview,parent,false);
        myViewHolder mv=new myViewHolder(v);
        return mv;

    }

    @Override
    public void onBindViewHolder(@NonNull recvw.myViewHolder holder, int position) {
        holder.img1.setImageResource(pics[position]);
        holder.tv1.setText(names[position]);
        holder.tv2.setText(description[position]);

    }

    @Override
    public int getItemCount() {
        return pics.length;
    }


      class myViewHolder extends RecyclerView.ViewHolder {
        ImageView img1;
        TextView tv1,tv2;
        Spinner sp;
       LinearLayout ll;

    public myViewHolder(@NonNull final View itemView) {
        super(itemView);
img1=(ImageView)itemView.findViewById(R.id.img1);
tv1=(TextView)itemView.findViewById(R.id.tv1);
        tv2=(TextView)itemView.findViewById(R.id.tv2);
        sp=(Spinner)itemView.findViewById(R.id.spinner1);

sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(sp.getSelectedItemPosition()==1){
            itemView.setBackgroundColor(Color.BLUE);
        }
        if(sp.getSelectedItemPosition()==2){
            itemView.setBackgroundColor(Color.YELLOW);
        }
        if(sp.getSelectedItemPosition()==3){
            itemView.setBackgroundColor(Color.GREEN);
        }
        if(sp.getSelectedItemPosition()==4){
            itemView.setBackgroundColor(Color.MAGENTA);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});


    }
}
}

