package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Explicitintent;
    Button ImplicitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Explicitintent = (Button)findViewById(R.id.explicitintent);
        Explicitintent.setOnClickListener(this);
        ImplicitIntent = (Button)findViewById(R.id.implicitintent);
        ImplicitIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.explicitintent:
            Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
            startActivity(explicit);
            break;

            case R.id.implicitintent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://w3school.com"));
                startActivity(implicit);
                break;

            default:
                break;
        }
    }
}
