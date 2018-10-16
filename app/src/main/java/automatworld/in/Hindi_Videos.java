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
 * Created by developer on 13-Jun-16.
 */
public class Hindi_Videos extends Activity{
    ImageView img1,img2,img3,img4,img5,img6,img7,img1_1,img1_2,img1_3,img1_4,img1_5,img1_6;

    ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hindivideos);
        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
        img5=(ImageView)findViewById(R.id.img5);
        img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);

        img1_1=(ImageView)findViewById(R.id.img1_1);
        img1_2=(ImageView)findViewById(R.id.img1_2);
        img1_3=(ImageView)findViewById(R.id.img1_3);
        img1_4=(ImageView)findViewById(R.id.img1_4);
        img1_5=(ImageView)findViewById(R.id.img1_5);
        img1_6=(ImageView)findViewById(R.id.img1_6);
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
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=LNEqF2RrxG4");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.youtube.com/watch?time_continue=1&v=p7BV_Poy3Fc");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.youtube.com/watch?v=MOqYS0VJ-f8");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.youtube.com/watch?v=k6BGZc2C28M");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.youtube.com/watch?v=p6oBAlQBDhg");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.youtube.com/watch?v=b_6K4ZkxQCQ");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.youtube.com/watch?v=A7yEyJSvJxA");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});








        img1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=pi6KElE9KC4");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
        img1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.youtube.com/watch?v=rPknmC5sdkU");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
        img1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse(" https://www.youtube.com/watch?v=grwVDCLX_i0");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
        img1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.youtube.com/watch?v=TyqiGU4VvAM");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
        img1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.youtube.com/watch?v=VGvQlQBgqfI");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
        img1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    Uri uri=Uri.parse("https://www.youtube.com/watch?v=G0-GHhiIgF0");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Hindi_Videos.this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show();
                }
            }});
    }
}
