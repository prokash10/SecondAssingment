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
public class SumFragment extends Fragment implements View.OnClickListener  {

private Button btncalcuate;
private EditText etfirst,etsecond;
private TextView tvoutput;
    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sum, container, false);
        etfirst=view.findViewById(R.id.etfirst);
        etsecond=view.findViewById(R.id.etsecond);
        btncalcuate=view.findViewById(R.id.btnsum);
        tvoutput=view.findViewById(R.id.tvoutputsum);
        btncalcuate.setOnClickListener(this);
        return view;


    }
    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etfirst.getText())){
            etfirst.setError("Enter First No");
            return;
        }
        else if (TextUtils.isEmpty(etsecond.getText())){
            etsecond.setError("Enter Second No");
            return;
        }

        int First = Integer.parseInt(etfirst.getText().toString());
        int Second = Integer.parseInt(etsecond.getText().toString());
        int Result = First + Second;

        tvoutput.setText("Sum is: ".concat(Integer.toString(Result)));
    }

}
