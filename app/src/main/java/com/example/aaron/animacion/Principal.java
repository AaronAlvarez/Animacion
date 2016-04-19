package com.example.aaron.animacion;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Principal extends AppCompatActivity {

     private Animation girar, ampliar, trasladar, trans;
     ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        imageView = (ImageView) findViewById(R.id.iv);

        girar = AnimationUtils.loadAnimation(this, R.anim.girar);
        ampliar = AnimationUtils.loadAnimation(this, R.anim.ampliar);
        trasladar = AnimationUtils.loadAnimation(this, R.anim.trasladar);
        trans = AnimationUtils.loadAnimation(this, R.anim.trans);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAmpliar:
                imageView.startAnimation(ampliar);
                break;
            case R.id.btnGirar:
                imageView.startAnimation(girar);
                break;
            case R.id.btnTrans:
                imageView.startAnimation(trans);
                break;
            case R.id.btnTrasladar:
                imageView.startAnimation(trasladar);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
