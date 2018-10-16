package automatworld.in;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by developer on 08-Jun-16.
 */
public class Allproducts extends Activity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
    ImageView back,home;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allproduct);

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
                Intent intent=new Intent(getApplication(),MainMenu.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),MainMenu.class);
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
                Intent intent =new Intent(Allproducts.this,New_product.class);
                /*intent.putExtra("d0","New Products/Just Launched");
                intent.putExtra("d1","Butterfly-Micro-Sprinkler");
                intent.putExtra("d2","Check-valve");
                intent.putExtra("d3","Dolphin-Ball-Valve");*/
                startActivity(intent);


            }
        });
bt2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        try {
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

            Intent intent =new Intent(Allproducts.this,Product2.class);

        /*intent.putExtra("sc1", "OVER HEAD SPRINKLERS");
        intent.putExtra("sc2", "WATER GUNS");
        intent.putExtra("sc3", "UNDERTREE SPRINKLERS");*/


            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"Error 404",Toast.LENGTH_LONG).show();
        }

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
                Intent intent=new Intent(Allproducts.this,Product3.class);


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
                Intent intent=new Intent(Allproducts.this,Product4.class);


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
                Intent intent=new Intent(Allproducts.this,Product5.class);


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
                Intent intent=new Intent(Allproducts.this,Product6.class);


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
                Intent intent=new Intent(Allproducts.this,Product7.class);


                startActivity(intent);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Allproducts.this, "Make Sure 'Connect to the Internet' in this Section", Toast.LENGTH_LONG).show();
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
                Intent intent=new Intent(Allproducts.this,Product8.class);


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
               Intent intent=new Intent(Allproducts.this,Product9.class);


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
                Intent intent=new Intent(Allproducts.this,Product10.class);


                startActivity(intent);
            }
        });
    }
}
