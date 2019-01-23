package com.example.a1104.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class MainActivity extends AppCompatActivity  {
    Button send_request;
    TextView responseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send_request = (Button) findViewById(R.id.send_request);
        response_text = (TextView) findViewById(R.id.response_text);
        send_request.setOnClickListener(this);


    }
    @Override
    public void onClick(View v){
        if(v.getId() == R.id.send_request){
            send_requestWithHttpURLConnection();
        }
    }

    private void send_requestWithHttpURLConnection() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpURLConnection connection = null;
                BufferedReader reader = null;
                try{
                    URL url = new URL("http://www.baidu.com");
                    connection = (HttpURLConnection)url.

                }
            }
        })
    }
}
