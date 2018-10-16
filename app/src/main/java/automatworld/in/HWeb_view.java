package automatworld.in;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;

public class HWeb_view extends Activity {
    WebView webView;
    ImageView back,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hweb_view);

        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            webView = (WebView) findViewById(R.id.webview);
            webView.getSettings().setJavaScriptEnabled(true);
            Bundle extra = getIntent().getExtras();
            String url = extra.getString("key");
            webView.loadUrl(url);

        }
        else
        {
            Toast.makeText(HWeb_view.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getApplicationContext(),HProduct8.class);
            startActivity(intent);


        }


        back=(ImageView)findViewById(R.id.back);
        home=(ImageView)findViewById(R.id.home);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),HProduct8.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),Hindi_mainMenu.class);
                startActivity(intent);
            }
        });
    }
}
