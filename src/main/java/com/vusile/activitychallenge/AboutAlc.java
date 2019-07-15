package com.vusile.activitychallenge;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        setTitle(R.string.about_alc);

        WebView aboutAlcWebview = findViewById(R.id.webview_about_alc);
        aboutAlcWebview.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed(); // Ignore SSL certificate errors
            }
        });
        aboutAlcWebview.clearCache(true);
        aboutAlcWebview.getSettings().setJavaScriptEnabled(true);
        aboutAlcWebview.loadUrl(getString(R.string.url_about_alc));
    }
}
