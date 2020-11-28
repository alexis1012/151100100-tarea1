package com.alexis.alexisweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ingresar =(Button)findViewById(R.id.ingresar_web);
        EditText nombre = (EditText)findViewById(R.id.Liga_de_internet);
        WebView url = (WebView)findViewById(R.id.web);

        url.setWebViewClient(new mostrando( ));
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre2 = nombre.getText().toString();
                url.getSettings().setLoadsImagesAutomatically(true);
                url.getSettings().setJavaScriptEnabled(true);
                url.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                url.loadUrl(nombre2);
            }
        });
    }
    private class mostrando extends WebViewClient {
        public boolean url1(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }
}
