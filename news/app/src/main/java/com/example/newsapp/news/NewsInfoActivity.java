package com.example.newsapp.news;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewsInfoActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    TextView txtContent, txtTitle;
    Bundle bundle;
    private int IdNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_info);
        initialize();
        setData();
    }

    private void setData() {
        Cursor res = databaseHelper.getNewsData(IdNews);
        while (res.moveToNext()) {
            txtContent.setText(res.getString(2));
            txtTitle.setText(res.getString(1));
        }
    }

    private void initialize() {
        bundle = getIntent().getExtras();
        txtContent = findViewById(R.id.txtContent);
        txtTitle = findViewById(R.id.txtTitle);
        databaseHelper = new DatabaseHelper(this);
        IdNews = bundle.getInt("IdNews");
    }

    public void exitClick(View view) {
        finish();
    }
}