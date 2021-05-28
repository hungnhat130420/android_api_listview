package com.example.a18036971_nguyentrannhathung_ktthuongki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.Dialog;
import android.os.Bundle;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RequestQueue requestQueue;
    private SwipeRefreshLayout refresh;
    private ArrayList<User> user = new ArrayList<>();
    private JsonArrayRequest arrayRequest;
    private RecyclerView recyclerView;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refresh = (SwipeRefreshLayout) findViewById(R.id.swipedown);
        recyclerView = (RecyclerView)findViewById(R.id.recyc);
        dialog = new Dialog(this);
//        refresh.setOnRefreshListener(this);
//        refresh.post(new Runnable() {
//            @Override
//            public void run() {
//                user.clear();
//                getData();
//            }
//        });

    }
}