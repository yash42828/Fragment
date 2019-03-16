package com.example.hp.fragment;


import android.app.Activity;
import android.content.Context;
import android.location.OnNmeaMessageListener;
import android.net.Uri;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Frag_list extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag_list, container, false);
        ListView listView = view.findViewById(R.id.list);
        final ArrayList<String> branch = new ArrayList<String>();
        branch.add("Civil");
        branch.add("Computer");
        branch.add("Electrical");
        branch.add("Electronics");
        branch.add("IT");
        branch.add("Mechanical");
        branch.add("Automobile");

        final ArrayList<String> description = new ArrayList<String>();
        description.add("Civil engineering is used for analysis of any infrastructure and derivating the solution of the problems faced during building that infrastructure.");
        description.add("Computer engineering is one of the most best field in recent times, computer engineering is related to hardware motstly");
        description.add("Electrical engineering mostly includes playing with all electric and electronic devices, and is used for studying power distribution.");
        description.add("Electronic engineering is the branch containing the design and development of electronic systems");
        description.add("Information and Technology is derived from computer engineering, it includes machine learning, c, c++, python, web development etc.");
        description.add("Mechanical engineering is the pioneer of all engineering, it includes making of machines, materials of our daily life, automobiles, etc.");
        description.add("Automobile engineering contains the perfect study regarding automobile systems and vehicles");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,branch);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected_item = branch.get(position);
                int index = branch.indexOf(selected_item);
                String selected_description = description.get(index);
//                Toast.makeText(getActivity(),"Clicked:"+selected_item,Toast.LENGTH_SHORT).show();
                Frag_Description frag_description = new Frag_Description();
                Bundle bundle = new Bundle();
                bundle.putString("selected_item",selected_item);
                bundle.putString("selected_description",selected_description);
                frag_description.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.description_frag,frag_description).commit();
            }
        });
        return view;
    }
}