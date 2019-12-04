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
public class ReverseStringFragment extends Fragment implements View.OnClickListener {

    private EditText etrstring;
    private Button btnrstring;
    private TextView tvsoutput;


    public ReverseStringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse_string, container, false);

        etrstring = view.findViewById(R.id.etrstring);
        btnrstring = view.findViewById(R.id.btnreverse);
        tvsoutput = view.findViewById(R.id.tvsoutput);

        btnrstring.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etrstring.getText())){
            etrstring.setError("Enter a String");
            return;
        }

        String S = String.valueOf(etrstring.getText());
        StringBuilder stringBuilder = new StringBuilder(S);
        String Result = String.valueOf(stringBuilder.reverse());

        tvsoutput.setText("Reversed String is: ".concat(Result));
    }

}
