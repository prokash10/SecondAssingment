package com.example.secondassingment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondassingment.Fragments.AreaOfCircleFragment;
import com.example.secondassingment.Fragments.AutomorphicNoFragment;
import com.example.secondassingment.Fragments.PalindromeFragment;
import com.example.secondassingment.Fragments.ReverseNoFragment;
import com.example.secondassingment.Fragments.ReverseStringFragment;
import com.example.secondassingment.Fragments.SumFragment;
import com.example.secondassingment.R;

public class MainActivity extends AppCompatActivity {
    private Button btnSum,btnArea,btnReverseN,btnPalindrome,btnAutomorphic,btnReverseS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArea = findViewById(R.id.btnA);
        btnSum = findViewById(R.id.btnS);
        btnReverseN = findViewById(R.id.btnRN);
        btnPalindrome = findViewById(R.id.btnP);
        btnAutomorphic = findViewById(R.id.btnAuto);
        btnReverseS = findViewById(R.id.btnRS);

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                AreaOfCircleFragment areaOfCircleFragment = new AreaOfCircleFragment();
                fragmentTransaction.replace(R.id.fragmentC,areaOfCircleFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                SumFragment sumFragment = new SumFragment();
                fragmentTransaction.replace(R.id.fragmentC,sumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btnReverseN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                ReverseNoFragment reverseNoFragment = new ReverseNoFragment();
                fragmentTransaction.replace(R.id.fragmentC,reverseNoFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentC,palindromeFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                AutomorphicNoFragment automorphicNoFragment = new AutomorphicNoFragment();
                fragmentTransaction.replace(R.id.fragmentC,automorphicNoFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btnReverseS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                ReverseStringFragment reverseStringFragment = new ReverseStringFragment();
                fragmentTransaction.replace(R.id.fragmentC,reverseStringFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

    }
}
