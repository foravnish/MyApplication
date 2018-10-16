package automatworld.in;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by developer on 16-Jun-16.
 */
public class Hsocial extends Activity{
    ImageView back,home;
    ImageView fb,tw,yt,pt,gl,in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hsocial);
        fb = (ImageView) findViewById(R.id.facebook);
        tw = (ImageView) findViewById(R.id.twit);
        yt = (ImageView) findViewById(R.id.youtube);
        pt = (ImageView) findViewById(R.id.pint);
        gl = (ImageView) findViewById(R.id.googl);
        in = (ImageView) findViewById(R.id.ind);
        back=(ImageView)findViewById(R.id.back);
        home=(ImageView)findViewById(R.id.home);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),Hindi_mainMenu.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),Hindi_mainMenu.class);
                startActivity(intent);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri = Uri.parse("https://www.facebook.com/automatindustries#");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Hsocial.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri = Uri.parse("https://twitter.com/automat2014");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Hsocial.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }
        });
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.youtube.com/channel/UCde8cBfnE5MNYlKbKH2eI2A");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Hsocial.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }
        });
        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri = Uri.parse("https://www.pinterest.com/Automat2014/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Hsocial.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }
        });
        gl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri = Uri.parse("https://plus.google.com/u/1/b/113840251388088872563/113840251388088872563/about/p/pub?gmbpt=true&pageId=113840251388088872563");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Hsocial.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }
        });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.linkedin.com/company/automat-industries-pvt--ltd-");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Hsocial.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
