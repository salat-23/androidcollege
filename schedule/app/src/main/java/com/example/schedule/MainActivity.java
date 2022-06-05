package com.example.schedule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.schedule.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Model> movies = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView=findViewById(R.id.rec);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this, movies);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initialize(){
        movies.add(new Model(
                "Понедельник",
                "",
                "Разработка программных модулей",
                "",
                "Системное программирование", "", "Физ-ра", "","","", ""));
        movies.add(new Model(
                "Четверг",
                "Иностранный язык",
                "",
                "Разработка программных модулей",
                "", "Технология разработки баз данных", "","","", "", ""));
        movies.add(new Model(
                "Пятница",
                "Системное программирование",
                "",
                "Разработка мобильных приложений",
                "",
                "Технология разработки программного обеспечения", "", "Разработка программных модулей", "","",""));
    }
}
