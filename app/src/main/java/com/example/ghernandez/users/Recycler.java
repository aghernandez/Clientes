package com.example.ghernandez.users;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {

    RecyclerView recyclerView;
    static ArrayList<persona> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView =(RecyclerView)findViewById(R.id.recyclerView);
        LinearLayoutManager glm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(glm);
    }

        public void fill (ArrayList<persona>usuarios){
            this.usuarios =usuarios;
            if(recyclerView.getAdapter()==null){
                adapter rva = new adapter();
                recyclerView.setAdapter(rva);
            }
        }
}
