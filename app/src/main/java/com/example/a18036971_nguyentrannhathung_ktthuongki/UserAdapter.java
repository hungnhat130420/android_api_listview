package com.example.a18036971_nguyentrannhathung_ktthuongki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<User> users;
    private String url="";

    public UserAdapter(Context context, ArrayList<User> users, String url) {
        this.context = context;
        this.users = users;
        this.url = url;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.item_list,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvId.setText(String.valueOf(users.get(position).getId()));
        holder.tvName.setText(users.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return users.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvId,tvName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId = (TextView) itemView.findViewById(R.id.tvID);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
        }
    }
}
