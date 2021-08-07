package com.ismadev.objetos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ismadev.testcustomads.R;

public class CustomAds {

    private Activity activity;
    private View view;

    private Button botonCerrar, botonAbrir;
    private TextView descripcion;
    private ImageView imagenAnuncio;
    private RelativeLayout totalAnuncio;

    private String url;

    public CustomAds(Activity activity) {
        this.activity = activity;

        //Con esto se añade la view al root:
        this.view = activity.findViewById(android.R.id.content).getRootView();
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0);
        view.inflate(activity, R.layout.capa_anuncio, viewGroup);

        botonCerrar = view.findViewById(R.id.botonCerrar);
        botonCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hide();
            }
        });
        botonAbrir = view.findViewById(R.id.botonAbrir);
        botonAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });
        imagenAnuncio = view.findViewById(R.id.imagenAnuncio);
        totalAnuncio = view.findViewById(R.id.totalAnuncio);
        totalAnuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hide();
            }
        });
        descripcion = view.findViewById(R.id.descripcion);
    }

    public void setImage(int image) {
        imagenAnuncio.setImageDrawable(activity.getResources().getDrawable(image));
    }

    public void setDescripcion(String text) {
        descripcion.setText(text);
    }

    public void show() {
        totalAnuncio.setVisibility(View.VISIBLE);
    }

    public void hide() {
        totalAnuncio.setVisibility(View.GONE);
    }

    public void setTextButton(String text) {
        botonCerrar.setText(text);
    }

    public void setURLButton(String url) {
        this.url = url;
    }

    private void open() {
        uRL(url);
    }

    public void uRL(String url) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(browserIntent);
    }


}
