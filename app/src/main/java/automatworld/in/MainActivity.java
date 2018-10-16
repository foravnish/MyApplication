package automatworld.in;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import automatworld.in.service.Myapplication;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        setContentView(R.layout.activity_main);
        Thread th = new Thread(){
            public void run(){

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(getApplicationContext(),LanguageActivity.class));
                }finish();
            }
        };th.start();

    }
}
