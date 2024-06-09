package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Innerclass> {
    Context context;
    ArrayList<Mymodel>data;

    public MyAdapter(Context context,ArrayList<Mymodel> data){
        this.context=context;
        this.data = data;

    }

    @NonNull
    @Override
    public MyAdapter.Innerclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.mycardview,parent,false);
        return new Innerclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.Innerclass holder, int position) {
        holder.txt.setText(data.get(position).getName());
        holder.img.setImageResource(data.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public class Innerclass extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt;
        public Innerclass(View itemView){
            super(itemView);
            img=itemView.findViewById(R.id.my_img);
            txt=itemView.findViewById(R.id.mytxt);
        }
    }
}
