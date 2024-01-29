package com.example.abrikosik2939;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewWriters);
        WritersAdapter adapter = new WritersAdapter(getContext(),getWriters());
        recyclerView.setAdapter(adapter);

    }
    private List<Writer> getWriters(){
        List<Writer> writers = new ArrayList<>();
        writers.add(new Writer( "Фёдор Михайлович Достоевский", "11 ноября 1821 года", "9 февраля 1881 года"," Русский писатель, мыслитель, философ и публицист. Член-корреспондент Петербургской академии наук с 1877 года. Классик мировой литературы, по данным ЮНЕСКО, один из самых читаемых писателей в мире. Собрание сочинений Достоевского состоит из 12 романов, четырёх новелл, 16 рассказов и множества других произведений.",R.drawable.dostoyevskiy));
        writers.add(new Writer("Александр Сергеевич Пушкин", "6 июня 1799 года", "0 февраля 1837 года", "Русский поэт, драматург и прозаик, заложивший основы русского реалистического направления, литературный критик и теоретик литературы, историк, публицист, журналист.",R.drawable.pushkin));
        writers.add(new Writer("Николай Васильевич Гоголь", "20 марта 1809 года", "21 февраля 1852 года", "Русский прозаик, драматург, критик, публицист, признанный одним из классиков русской литературы.", R.drawable.gogol));
        writers.add(new Writer(" Лев Николаевич Толстой", "9 сентября 1828 года","20 ноября 1910 года", "Один из наиболее известных русских писателей и мыслителей, один из величайших в мире писателей-романистов.", R.drawable.tolstoy));
        return writers;

    }

}