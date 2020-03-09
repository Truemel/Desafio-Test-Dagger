package com.example.desafiotestdagger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.desafiotestdagger.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnButtonActionListener {

    ActivityMainBinding binder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binder = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binder.clean.setOnClickListener(this);
        binder.show.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == binder.clean.getId())
            onClean();
        else if(v.getId() == binder.show.getId())
            onShow();
    }

    @Override
    public void onShow() {
        AppComp comp = DaggerAppComp.create();
        binder.texto.setText(comp.getCurso().lineCurso());
    }

    @Override
    public void onClean() {
        binder.texto.setText("");
    }
}
