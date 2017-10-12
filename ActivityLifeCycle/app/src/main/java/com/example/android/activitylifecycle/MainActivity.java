package com.example.android.activitylifecycle;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btnGo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, GoActivity.class);
                startActivity(i);
            }
        });
        Log.i("MainActivity", "on create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "on start");
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        String name = sp.getString("UserName", "Default String");
        TextView txt=(TextView)findViewById(R.id.welcome_text_view);
        txt.setText(name);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "on stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "on destroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "on pause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "on resume");

    }
}
