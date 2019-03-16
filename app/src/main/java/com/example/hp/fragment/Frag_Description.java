package com.example.hp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Frag_Description extends Fragment{

    private TextView textView;
    private TextView description;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag__description, container, false);
        textView = view.findViewById(R.id.description);
        description = view.findViewById(R.id.details);
        Bundle bundle = getArguments();
        if(bundle!=null){
            if(bundle.getString("selected_item")!=null){
                textView.setText(bundle.getString("selected_item"));
            }
            if(bundle.getString("selected_description")!=null){
                description.setText(bundle.getString("selected_description"));
            }
        }
        // Inflate the layout for this fragment
        return view;
    }
}