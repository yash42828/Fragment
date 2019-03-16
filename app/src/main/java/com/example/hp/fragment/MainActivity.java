package com.example.hp.fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private Frag_list Frag_list;
    private Frag_logo Frag_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Frag_list = new Frag_list();
        Frag_logo = new Frag_logo();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.list_frag, Frag_list)
                .replace(R.id.image_frag,Frag_logo)
                .commit();
    }
}
