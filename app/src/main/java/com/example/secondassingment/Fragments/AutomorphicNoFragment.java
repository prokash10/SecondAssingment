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
public class AutomorphicNoFragment extends Fragment implements View.OnClickListener {
    EditText etnumber;
    private Button btncheck;
    private TextView tvoutput;


    public AutomorphicNoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_automorphic_no, container, false);
        etnumber = view.findViewById(R.id.etautomorphic);
        btncheck = view.findViewById(R.id.btncheck);
        tvoutput = view.findViewById(R.id.tvoutput);

        btncheck.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etnumber.getText())){
            etnumber.setError("Enter a Number");
            return;
        }

        int N = Integer.parseInt(etnumber.getText().toString());
        int d=1; int i;
        for(i=N;i>0;i=i/10)
        {
            d=d*10;
        }
        if((N*N)%d==N)
        {
            tvoutput.setText(Integer.toString(N).concat(" is a Automorphic Number"));
        }
        else
        {
            tvoutput.setText(Integer.toString(N).concat(" is not a Automorphic Number"));
        }
    }
}


