package com.example.android.activitylifecycle;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);
        Log.i("GoActivity", "on create");
        Button btnSave=(Button)findViewById(R.id.save_button);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txt=(EditText) findViewById(R.id.name_edit_text);
                SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(GoActivity.this);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("UserName",txt.getText().toString());
                editor.commit();
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("GoActivity", "on start");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("GoActivity", "on stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("GoActivity", "on destroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("GoActivity", "on pause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("GoActivity", "on resume");

    }
}
