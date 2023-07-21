package com.example.webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;

public class main_activity extends Activity {
  WebView mywebview;
  @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);
        mywebview=findViewById(R.id.webView);
        mywebview.loadUrl("https://www.youtube.com/watch?v=gZOcLix4PGc&ab_channel=ImprovementPill");
        mywebview.setWebViewClient(new WebViewClient());

      WebSettings webSettings = mywebview.getSettings();
      webSettings.setJavaScriptEnabled(true);
    }
}
