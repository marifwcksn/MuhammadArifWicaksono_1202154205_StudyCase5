package com.example.arif.muhammadarifwicaksono_1202154205_studycase5;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by arif on 25/03/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.holder> {
    //deklarasi variable yang akan digunakan
    private Context cons;
    private List<AddDatabase> list;
    int colors;

    //konstruktor
    public Adapter(Context cntx, List<AddDatabase> list, int color){
        this.cons=cntx;
        this.list=list;
        this.colors=color;
    }

    //menentukan viewholder untuk recyclerview
    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //membuat view baru
        View view = LayoutInflater.from(cons).inflate(R.layout.cardviewlist, parent, false);
        holder hld = new holder(view);
        return hld;
    }

    //menyetting nilai yang didapatkan pada viewholder
    @Override
    public void onBindViewHolder(holder holder, int position) {
        AddDatabase data = list.get(position);
        holder.ToDo.setText(data.getTodo());
        holder.Description.setText(data.getDesc());
        holder.Priority.setText(data.getPrior());
        holder.cardv.setCardBackgroundColor(cons.getResources().getColor(this.colors));
    }

    //mendapatkan jumlah list
    @Override
    public int getItemCount() {
        return list.size();
    }

    //mendapatkan list dari adapter
    public AddDatabase getData(int position){
        return list.get(position);
    }

    //untuk menghapus list pada todolist
    public void deleteData(int i){
        //remove item yang terpilih
        list.remove(i);
        //memberi notifikasi item yang di remove
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, list.size());
    }

    class holder extends RecyclerView.ViewHolder{
        //deklarasi variable yang akan digunakan
        public TextView ToDo, Description, Priority;
        public CardView cardv;
        public holder(View itemView){
            super(itemView);

            //untuk akses id text view pada layout dan juga cardview
            ToDo = itemView.findViewById(R.id.headline);
            Description = itemView.findViewById(R.id.explanation);
            Priority = itemView.findViewById(R.id.number);
            cardv = itemView.findViewById(R.id.cardlist);
        }
    }
}
