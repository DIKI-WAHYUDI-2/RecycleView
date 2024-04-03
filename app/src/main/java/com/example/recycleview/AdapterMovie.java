package com.example.recycleview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMovie extends RecyclerView.Adapter<AdapterMovie.ViewHolder> {

    private ArrayList<Movie> movie;

    public AdapterMovie(ArrayList<Movie> movie) {
        this.movie = movie;
    }

    @NonNull
    @Override
    public AdapterMovie.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMovie.ViewHolder holder, int position) {
        Movie movie1 = movie.get(position);
        holder.nama.setText(movie.get(position).getNama());
        holder.sutradara.setText(movie.get(position).getSutradara());
        holder.tahun.setText(movie.get(position).getTanggal());
        holder.gambar.setImageResource(movie.get(position).getGambar());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), Detail.class);
            intent.putExtra("movie_name", movie1.getNama());
            intent.putExtra("movie_synopsis", movie1.getSinopsis());
            intent.putExtra("movie_date", movie1.getTanggal());
            intent.putExtra("movie_director", movie1.getSutradara());
            intent.putExtra("movie_image", movie1.getGambar());
            view.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return movie.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nama,sutradara,tahun;
        ImageView gambar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.teks);
            sutradara = itemView.findViewById(R.id.teks2);
            tahun = itemView.findViewById(R.id.teks3);
            gambar = itemView.findViewById(R.id.gambar_film);
        }
    }
}
