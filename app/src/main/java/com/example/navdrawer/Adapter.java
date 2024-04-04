package com.example.navdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.HolderData> {
    List<Item> itemList;
    LayoutInflater inflater;

    public Adapter(Context context, List<Item> itemList) {
        this.itemList = itemList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_data, parent, false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        Item item = itemList.get(position);
        holder.namaTextView.setText(item.getNama());
        holder.deskripsiTextView.setText(item.getDeskripsi());
        holder.gambarImageView.setImageDrawable(item.getImage());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class HolderData extends RecyclerView.ViewHolder {
        ImageView gambarImageView;
        TextView namaTextView;
        TextView deskripsiTextView;

        public HolderData(@NonNull View itemView) {
            super(itemView);
            gambarImageView = itemView.findViewById(R.id.gambar);
            namaTextView = itemView.findViewById(R.id.nama);
            deskripsiTextView = itemView.findViewById(R.id.deskripsi);
        }
    }
}

