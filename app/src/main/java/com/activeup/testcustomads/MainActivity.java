package com.activeup.testcustomads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.activeup.objetos.CustomAds;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAds customAds = new CustomAds(this);
        customAds.setDescripcion("Courstube, cursos gratis de todo tipo. Descarga la APP gratis");
        customAds.setImage(R.drawable.ic_launcher_background);
        customAds.setURLButton("https://play.google.com/store/apps/details?id=com.courstube");
        customAds.show();

    }


}