package com.example.secondassingment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassingment.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AreaOfCircleFragment extends Fragment implements View.OnClickListener {
    Button btnarea;
    EditText etradius;
    TextView tvreoutputarea;


    public AreaOfCircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_area_of_circle, container, false);
        etradius = view.findViewById(R.id.etradius);
        btnarea = view.findViewById(R.id.btnarea);
        tvreoutputarea = view.findViewById(R.id.tvoutputarea);

        btnarea.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etradius.getText())){
            etradius.setError("Enter Radius");
            return;
        }

        double Radius = Double.parseDouble(etradius.getText().toString());
        double Result = Math.PI * Radius * Radius;

        tvreoutputarea.setText("Area is: ".concat(Double.toString(Result)));
    }
}


