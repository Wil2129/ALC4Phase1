package com.andela.alc4phase1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        findViewById(R.id.about_alc).setOnClickListener(this);
        findViewById(R.id.my_profile).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.about_alc) {
            Intent aboutALCIntent = new Intent(this, AboutALC.class);
            startActivity(aboutALCIntent);
        } else if (v.getId() == R.id.my_profile) {
            Intent myProfileIntent = new Intent(this, MyProfile.class);
            startActivity(myProfileIntent);
        } else {

        }
    }
}
