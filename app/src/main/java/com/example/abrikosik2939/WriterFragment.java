package com.example.abrikosik2939;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class WriterFragment extends Fragment {
    private Writer writer = null;
    public WriterFragment() {
        // Required empty public constructor
    }
    public WriterFragment(Writer writer) {
        this.writer = writer;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView FIO = view.findViewById(R.id.textViewWriterFIO_Fragment);
        ImageView picture = view.findViewById(R.id.imageWriter_Fragment);
        TextView birthday = view.findViewById(R.id.textViewWriterBirthday_Fragment);
        TextView deathday = view.findViewById(R.id.textViewWriterDeathday_Fragment);
        TextView description = view.findViewById(R.id.textViewDescription_Fragment);
        if (writer!=null) {
            picture.setImageResource(writer.getPicture());
            FIO.setText(writer.getFIO());
            birthday.setText(writer.getBirtDay());
            deathday.setText(writer.getDeathDay());
            description.setText(writer.getDescription());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_writer, container, false);
    }
}