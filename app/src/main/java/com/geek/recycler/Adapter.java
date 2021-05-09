package com.geek.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Data> list = new ArrayList<>();

    public void addItems(ArrayList<Data> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_rv,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, description, date, id;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_label);
            date = itemView.findViewById(R.id.tv_date);
            description = itemView.findViewById(R.id.tv_description);
            id = itemView.findViewById(R.id.id_items);
        }

        public void onBind(Data s) {
            title.setText(s.getTitle());
//            date.setText((String.valueOf(s.getDate())));
            date.setText(converter(s.getDate()));
            description.setText(s.getDescription());
            id.setText(String.valueOf(getAdapterPosition()+1));
        }
    }

    public String converter(long currentTime){
        DateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        return date.format(System.currentTimeMillis());
    }
}
