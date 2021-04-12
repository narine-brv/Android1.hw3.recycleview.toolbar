package com.narine.android1hw3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView tv_name;

    public MainViewHolder(@NonNull View itemView) {

        super(itemView);
        tv_name = itemView.findViewById(R.id.tv_student_name);

    }

    public void onBind (ItemModel data) { //в этот метод мы передаем данные листа

        tv_name.setText(data.name);

    }
}
