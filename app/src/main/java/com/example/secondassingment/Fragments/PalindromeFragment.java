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
public class PalindromeFragment extends Fragment implements View.OnClickListener {
    private Button btncheckpno;
    private EditText etpno;
    private TextView tvoutputpno;


    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindrome, container, false);

        etpno = view.findViewById(R.id.etpalindrome);
        btncheckpno = view.findViewById(R.id.btncheckpno);
        tvoutputpno = view.findViewById(R.id.tvoutputpno);

        btncheckpno.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etpno.getText())){
            etpno.setError("Enter a Number");
            return;
        }

        int P;
        P = Integer.parseInt(etpno.getText().toString());
        int Palindrome = P;
        int remainder;
        int reserve = 0;


        while( Palindrome != 0 )
        {
            remainder = Palindrome % 10;
            reserve = reserve * 10 + remainder;
            Palindrome  /= 10;
        }

        if (reserve == P){
            tvoutputpno.setText((Integer.toString(P).concat(" is a Palindrome No")));
        } else {
            tvoutputpno.setText((Integer.toString(P).concat(" is not a Palindrome No")));
        }

    }
}
