package com.geek.recycler;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Data> list = new ArrayList<>();
    private TextView textView;

    //получаем данные из вне
    public void addItems(ArrayList<Data> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }


    //указываем как должен выглядеть ViewHolder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_rv, parent, false);
        return new ViewHolder(view);
    }


    //отправляем данные ViewHolder по позициям
    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
        if (position % 2 == 0) {
            holder.constraintLayout.setBackgroundColor(Color.parseColor("#F44336"));
        } else {
            holder.constraintLayout.setBackgroundColor(Color.parseColor("#3F51B5"));
        }
    }

    //указываем количеству отображаемых элементов
    @Override
    public int getItemCount() {
        return list.size();
    }

    //работа с данными (за set им данные)
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, description, date, id;
        private ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_label);
            date = itemView.findViewById(R.id.tv_date);
            description = itemView.findViewById(R.id.tv_description);
            id = itemView.findViewById(R.id.id_items);
            constraintLayout = itemView.findViewById(R.id.background_cnst);
        }


        //приходят данные по позициям (set им во View шки)
        public void onBind(Data s) {
            title.setText(s.getTitle());
//            date.setText((String.valueOf(s.getDate())));
            date.setText(converter(s.getDate()));
            description.setText(s.getDescription());
            id.setText(String.valueOf(getAdapterPosition() + 1));
        }
    }

    public String converter(long currentTime) {
        DateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        return date.format(System.currentTimeMillis());
    }
}
