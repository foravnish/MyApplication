package automatworld.in;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by developer on 13-Jun-16.
 */
public class Hindi_Allproducts extends Activity{
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
    ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hindiallprodcts);
        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);
        bt6 = (Button)findViewById(R.id.bt6);
        bt7 = (Button)findViewById(R.id.bt7);
        bt8 = (Button)findViewById(R.id.bt8);
        bt9 = (Button)findViewById(R.id.bt9);
        bt10 = (Button)findViewById(R.id.bt10);
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

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setBackgroundResource(R.drawable.btn_hover);
                bt1.setTextColor(Color.WHITE);

                bt2.setBackgroundResource(R.drawable.btn);
                bt3.setBackgroundResource(R.drawable.btn);
                bt4.setBackgroundResource(R.drawable.btn);
                bt5.setBackgroundResource(R.drawable.btn);
                bt6.setBackgroundResource(R.drawable.btn);
                bt7.setBackgroundResource(R.drawable.btn);
                bt8.setBackgroundResource(R.drawable.btn);
                bt9.setBackgroundResource(R.drawable.btn);
                bt10.setBackgroundResource(R.drawable.btn);

                bt2.setTextColor(Color.BLACK);
                bt3.setTextColor(Color.BLACK);
                bt4.setTextColor(Color.BLACK);
                bt5.setTextColor(Color.BLACK);
                bt6.setTextColor(Color.BLACK);
                bt7.setTextColor(Color.BLACK);
                bt8.setTextColor(Color.BLACK);
                bt9.setTextColor(Color.BLACK);
                bt10.setTextColor(Color.BLACK);
                Intent intent =new Intent(getApplicationContext(),HNew_product.class);
                intent.putExtra("d0", "नए उत्पादों / बस शुरू");
                intent.putExtra("d1", "तितली-माइक्रो छिड़काव");
                intent.putExtra("d2","वाल्व जांचें");
                intent.putExtra("d3","डॉल्फिन गेंद वाल्व");

                startActivity(intent);



            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt2.setBackgroundResource(R.drawable.btn_hover);
                bt2.setTextColor(Color.WHITE);

                bt1.setBackgroundResource(R.drawable.btn);
                bt3.setBackgroundResource(R.drawable.btn);
                bt4.setBackgroundResource(R.drawable.btn);
                bt5.setBackgroundResource(R.drawable.btn);
                bt6.setBackgroundResource(R.drawable.btn);
                bt7.setBackgroundResource(R.drawable.btn);
                bt8.setBackgroundResource(R.drawable.btn);
                bt9.setBackgroundResource(R.drawable.btn);
                bt10.setBackgroundResource(R.drawable.btn);

                bt1.setTextColor(Color.BLACK);
                bt3.setTextColor(Color.BLACK);
                bt4.setTextColor(Color.BLACK);
                bt5.setTextColor(Color.BLACK);
                bt6.setTextColor(Color.BLACK);
                bt7.setTextColor(Color.BLACK);
                bt8.setTextColor(Color.BLACK);
                bt9.setTextColor(Color.BLACK);
                bt10.setTextColor(Color.BLACK);

                Intent intent =new Intent(getApplicationContext(),HProduct2.class);

                /*intent.putExtra("sc1", "सिर बुझानेवाले कार्यभार");
                intent.putExtra("sc2", "पानी बंदूकों");
                intent.putExtra("sc3", "UNDERTREE बुझानेवाले");*/

                startActivity(intent);

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt3.setBackgroundResource(R.drawable.btn_hover);
                bt3.setTextColor(Color.WHITE);

                bt2.setBackgroundResource(R.drawable.btn);
                bt1.setBackgroundResource(R.drawable.btn);
                bt4.setBackgroundResource(R.drawable.btn);
                bt5.setBackgroundResource(R.drawable.btn);
                bt6.setBackgroundResource(R.drawable.btn);
                bt7.setBackgroundResource(R.drawable.btn);
                bt8.setBackgroundResource(R.drawable.btn);
                bt9.setBackgroundResource(R.drawable.btn);
                bt10.setBackgroundResource(R.drawable.btn);

                bt2.setTextColor(Color.BLACK);
                bt1.setTextColor(Color.BLACK);
                bt4.setTextColor(Color.BLACK);
                bt5.setTextColor(Color.BLACK);
                bt6.setTextColor(Color.BLACK);
                bt7.setTextColor(Color.BLACK);
                bt8.setTextColor(Color.BLACK);
                bt9.setTextColor(Color.BLACK);
                bt10.setTextColor(Color.BLACK);
                Intent intent=new Intent(getApplication(),HProduct3.class);


                startActivity(intent);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt4.setBackgroundResource(R.drawable.btn_hover);
                bt4.setTextColor(Color.WHITE);

                bt2.setBackgroundResource(R.drawable.btn);
                bt3.setBackgroundResource(R.drawable.btn);
                bt1.setBackgroundResource(R.drawable.btn);
                bt5.setBackgroundResource(R.drawable.btn);
                bt6.setBackgroundResource(R.drawable.btn);
                bt7.setBackgroundResource(R.drawable.btn);
                bt8.setBackgroundResource(R.drawable.btn);
                bt9.setBackgroundResource(R.drawable.btn);
                bt10.setBackgroundResource(R.drawable.btn);

                bt2.setTextColor(Color.BLACK);
                bt3.setTextColor(Color.BLACK);
                bt1.setTextColor(Color.BLACK);
                bt5.setTextColor(Color.BLACK);
                bt6.setTextColor(Color.BLACK);
                bt7.setTextColor(Color.BLACK);
                bt8.setTextColor(Color.BLACK);
                bt9.setTextColor(Color.BLACK);
                bt10.setTextColor(Color.BLACK);
                Intent intent=new Intent(getApplication(),HProduct4.class);


                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt5.setBackgroundResource(R.drawable.btn_hover);
                bt5.setTextColor(Color.WHITE);

                bt2.setBackgroundResource(R.drawable.btn);
                bt3.setBackgroundResource(R.drawable.btn);
                bt4.setBackgroundResource(R.drawable.btn);
                bt1.setBackgroundResource(R.drawable.btn);
                bt6.setBackgroundResource(R.drawable.btn);
                bt7.setBackgroundResource(R.drawable.btn);
                bt8.setBackgroundResource(R.drawable.btn);
                bt9.setBackgroundResource(R.drawable.btn);
                bt10.setBackgroundResource(R.drawable.btn);

                bt2.setTextColor(Color.BLACK);
                bt3.setTextColor(Color.BLACK);
                bt4.setTextColor(Color.BLACK);
                bt1.setTextColor(Color.BLACK);
                bt6.setTextColor(Color.BLACK);
                bt7.setTextColor(Color.BLACK);
                bt8.setTextColor(Color.BLACK);
                bt9.setTextColor(Color.BLACK);
                bt10.setTextColor(Color.BLACK);
                Intent intent=new Intent(getApplication(),HProduct5.class);


                startActivity(intent);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt6.setBackgroundResource(R.drawable.btn_hover);
                bt6.setTextColor(Color.WHITE);

                bt2.setBackgroundResource(R.drawable.btn);
                bt3.setBackgroundResource(R.drawable.btn);
                bt4.setBackgroundResource(R.drawable.btn);
                bt5.setBackgroundResource(R.drawable.btn);
                bt1.setBackgroundResource(R.drawable.btn);
                bt7.setBackgroundResource(R.drawable.btn);
                bt8.setBackgroundResource(R.drawable.btn);
                bt9.setBackgroundResource(R.drawable.btn);
                bt10.setBackgroundResource(R.drawable.btn);

                bt2.setTextColor(Color.BLACK);
                bt3.setTextColor(Color.BLACK);
                bt4.setTextColor(Color.BLACK);
                bt5.setTextColor(Color.BLACK);
                bt1.setTextColor(Color.BLACK);
                bt7.setTextColor(Color.BLACK);
                bt8.setTextColor(Color.BLACK);
                bt9.setTextColor(Color.BLACK);
                bt10.setTextColor(Color.BLACK);
                Intent intent=new Intent(getApplication(),HProduct6.class);


                startActivity(intent);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt7.setBackgroundResource(R.drawable.btn_hover);
                bt7.setTextColor(Color.WHITE);

                bt2.setBackgroundResource(R.drawable.btn);
                bt3.setBackgroundResource(R.drawable.btn);
                bt4.setBackgroundResource(R.drawable.btn);
                bt5.setBackgroundResource(R.drawable.btn);
                bt6.setBackgroundResource(R.drawable.btn);
                bt1.setBackgroundResource(R.drawable.btn);
                bt8.setBackgroundResource(R.drawable.btn);
                bt9.setBackgroundResource(R.drawable.btn);
                bt10.setBackgroundResource(R.drawable.btn);

                bt2.setTextColor(Color.BLACK);
                bt3.setTextColor(Color.BLACK);
                bt4.setTextColor(Color.BLACK);
                bt5.setTextColor(Color.BLACK);
                bt6.setTextColor(Color.BLACK);
                bt1.setTextColor(Color.BLACK);
                bt8.setTextColor(Color.BLACK);
                bt9.setTextColor(Color.BLACK);
                bt10.setTextColor(Color.BLACK);
                Intent intent=new Intent(getApplication(),HProduct7.class);


                startActivity(intent);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Hindi_Allproducts.this, "Make Sure 'Connect to the Internet' in this Section", Toast.LENGTH_LONG).show();
                bt8.setBackgroundResource(R.drawable.btn_hover);
                bt8.setTextColor(Color.WHITE);
                bt2.setBackgroundResource(R.drawable.btn);
                bt3.setBackgroundResource(R.drawable.btn);
                bt4.setBackgroundResource(R.drawable.btn);
                bt5.setBackgroundResource(R.drawable.btn);
                bt6.setBackgroundResource(R.drawable.btn);
                bt7.setBackgroundResource(R.drawable.btn);
                bt1.setBackgroundResource(R.drawable.btn);
                bt9.setBackgroundResource(R.drawable.btn);
                bt10.setBackgroundResource(R.drawable.btn);

                bt2.setTextColor(Color.BLACK);
                bt3.setTextColor(Color.BLACK);
                bt4.setTextColor(Color.BLACK);
                bt5.setTextColor(Color.BLACK);
                bt6.setTextColor(Color.BLACK);
                bt7.setTextColor(Color.BLACK);
                bt1.setTextColor(Color.BLACK);
                bt9.setTextColor(Color.BLACK);
                bt10.setTextColor(Color.BLACK);
                Intent intent=new Intent(getApplication(),HProduct8.class);


                startActivity(intent);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt9.setBackgroundResource(R.drawable.btn_hover);
                bt9.setTextColor(Color.WHITE);
                bt2.setBackgroundResource(R.drawable.btn);
                bt3.setBackgroundResource(R.drawable.btn);
                bt4.setBackgroundResource(R.drawable.btn);
                bt5.setBackgroundResource(R.drawable.btn);
                bt6.setBackgroundResource(R.drawable.btn);
                bt7.setBackgroundResource(R.drawable.btn);
                bt8.setBackgroundResource(R.drawable.btn);
                bt1.setBackgroundResource(R.drawable.btn);
                bt10.setBackgroundResource(R.drawable.btn);

                bt2.setTextColor(Color.BLACK);
                bt3.setTextColor(Color.BLACK);
                bt4.setTextColor(Color.BLACK);
                bt5.setTextColor(Color.BLACK);
                bt6.setTextColor(Color.BLACK);
                bt7.setTextColor(Color.BLACK);
                bt8.setTextColor(Color.BLACK);
                bt1.setTextColor(Color.BLACK);
                bt10.setTextColor(Color.BLACK);
                Intent intent=new Intent(getApplication(),HProduct9.class);


                startActivity(intent);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt10.setBackgroundResource(R.drawable.btn_hover);
                bt10.setTextColor(Color.WHITE);
                bt2.setBackgroundResource(R.drawable.btn);
                bt3.setBackgroundResource(R.drawable.btn);
                bt4.setBackgroundResource(R.drawable.btn);
                bt5.setBackgroundResource(R.drawable.btn);
                bt6.setBackgroundResource(R.drawable.btn);
                bt7.setBackgroundResource(R.drawable.btn);
                bt8.setBackgroundResource(R.drawable.btn);
                bt9.setBackgroundResource(R.drawable.btn);
                bt1.setBackgroundResource(R.drawable.btn);

                bt2.setTextColor(Color.BLACK);
                bt3.setTextColor(Color.BLACK);
                bt4.setTextColor(Color.BLACK);
                bt5.setTextColor(Color.BLACK);
                bt6.setTextColor(Color.BLACK);
                bt7.setTextColor(Color.BLACK);
                bt8.setTextColor(Color.BLACK);
                bt9.setTextColor(Color.BLACK);
                bt1.setTextColor(Color.BLACK);
                Intent intent=new Intent(getApplication(),HProduct10.class);


                startActivity(intent);
            }
        });
    }
}
