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
public class ReverseNoFragment extends Fragment implements View.OnClickListener {

    private Button btnreverse;
    private EditText etreverse;
    private TextView tvoutputrno;


    public ReverseNoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse_no, container, false);

        etreverse = view.findViewById(R.id.etreverse);
        btnreverse = view.findViewById(R.id.btnreverse);
        tvoutputrno = view.findViewById(R.id.tvoutputrno);

        btnreverse.setOnClickListener(this);

        return view;
    }
    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etreverse.getText())){
            etreverse.setError("Enter No");
            return;
        }

        int Reverse = Integer.parseInt(etreverse.getText().toString());
        int ReversedNo = 0, Remainder;

        while (Reverse != 0 ){
            Remainder = Reverse % 10;
            ReversedNo = ReversedNo * 10 + Remainder;
            Reverse = Reverse/10;
        }

        tvoutputrno.setText("Reverse is: ".concat(Integer.toString(ReversedNo)));
    }
}



