package com.example.dd.fragmentexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pineappleFragment, fantoFragment,limofragment,chapatifragment,chickenFragment,chipsFragment,pastoFragment,riceFragment,appleFragment,pananaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chapatifragment= (TextView) findViewById(R.id.chapatifragment);
        fantoFragment= (TextView) findViewById(R.id.fantoFragment);
       limofragment= (TextView) findViewById(R.id.limoFragment);
        riceFragment= (TextView) findViewById(R.id.riceFragment);
        pastoFragment= (TextView) findViewById(R.id.pastoFragment);
        chipsFragment= (TextView) findViewById(R.id.chipsFragment);
        chickenFragment= (TextView) findViewById(R.id.chickenFragment);
        appleFragment= (TextView) findViewById(R.id.appleFragment);
        pananaFragment= (TextView) findViewById(R.id.pananaFragment);
        pineappleFragment= (TextView) findViewById(R.id.pineappleFragment);
        pananaFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new pananaFragment());
            }
        });
        pineappleFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new pineappleFragment());
            }
        });
        chapatifragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new chapatiFragment());
            }
        });
        appleFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new appleFragment());
            }
        });

        fantoFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new fantoFragment());
            }
        });
        limofragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new limoFragment());
            }
        });
        pastoFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new pastoFragment());
            }
        });
        riceFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new riceFragment());
            }
        });
        chickenFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new chickenFragment());
            }
        });
        chipsFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new chipsFragment());
            }
        });
    }
    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}