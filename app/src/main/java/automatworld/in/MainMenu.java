package automatworld.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by developer on 07-Jun-16.
 */
public class MainMenu extends Activity implements View.OnClickListener {
 Button products,download,aboutus,contactus,videos,social;
    ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.main_menu_layout);
        products=(Button)findViewById(R.id.product);
        download=(Button)findViewById(R.id.download);
        aboutus=(Button)findViewById(R.id.aboutus);
        contactus=(Button)findViewById(R.id.contactus);
        videos=(Button)findViewById(R.id.videos);
        social=(Button)findViewById(R.id.social);
        back=(ImageView)findViewById(R.id.back);
        //home=(ImageView)findViewById(R.id.home);

        products.setOnClickListener(this);
        download.setOnClickListener(this);
        aboutus.setOnClickListener(this);
        contactus.setOnClickListener(this);
        videos.setOnClickListener(this);
        social.setOnClickListener(this);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),LanguageActivity.class);
                startActivity(intent);
            }
        });
        /*home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),LanguageActivity.class);
                startActivity(intent);
            }
        });*/
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.product) {
            startActivity(new Intent(getApplicationContext(), Allproducts.class));
        }
        else if(v.getId()==R.id.download)
            {
                startActivity(new Intent(getApplicationContext(),Downloads.class));
            }
            else if (v.getId()==R.id.aboutus)
               {
                 startActivity(new Intent(getApplicationContext(),Aboutus.class));
               }
        else if(v.getId()==R.id.contactus)
        {
            startActivity(new Intent(getApplicationContext(),Contactus.class));
        }
        else if(v.getId()==R.id.videos)

        {
            startActivity(new Intent(getApplicationContext(),Videos.class));
        }
        else if(v.getId()==R.id.social)
        {
            startActivity(new Intent(getApplicationContext(),Social.class));
        }

    }
}
