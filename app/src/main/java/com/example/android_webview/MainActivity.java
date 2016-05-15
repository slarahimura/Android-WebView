package com.example.android_webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);

        setupWebView();
        loadUrl("http://wimsonevel.blogspot.co.id/");
    }

    private void setupWebView(){
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                // when load finished
            }
        });
    }

    private void loadUrl(String url){
        webView.loadUrl(url);
    }
}
