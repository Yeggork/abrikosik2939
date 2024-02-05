package com.example.abrikosik2939;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WritersAdapter extends RecyclerView.Adapter<WritersAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Writer> writers;
    private OnWriterClickListener onWriterClickListener;
    interface OnWriterClickListener{
        void OnWriterClick(Writer writer, int position);

    }
    public WritersAdapter(Context context, List<Writer> writers,OnWriterClickListener onWriterClickLestener){
        this.writers = writers;
        inflater = LayoutInflater.from(context);
        this.onWriterClickListener = onWriterClickLestener;
    }
    @NonNull
    @Override
    public WritersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_writer_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WritersAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Writer writer = writers.get(position);
        holder.FIO.setText(writer.getFIO());
        holder.birthDay.setText(writer.getBirtDay());
        holder.deathday.setText(writer.getDeathDay());
        holder.discription.setText(writer.getShortDescription());
        holder.picture.setImageResource(writer.getPicture());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onWriterClickListener.OnWriterClick(writer, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return writers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView FIO, birthDay, deathday, discription;
        ImageView picture;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            FIO = itemView.findViewById(R.id.textViewFIO);
            birthDay = itemView.findViewById(R.id.textViewBirthDay);
            deathday = itemView.findViewById(R.id.textViewDeathDay);
            discription = itemView.findViewById(R.id.textViewDescription);
            picture = itemView.findViewById(R.id.imageViewPicture);
        }
    }
}
