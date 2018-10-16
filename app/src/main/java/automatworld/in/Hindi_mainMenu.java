package automatworld.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by developer on 13-Jun-16.
 */
public class Hindi_mainMenu extends Activity implements View.OnClickListener {
    Button hproducts,hdownload,haboutus,hcontactus,hvideos,hsocial;
    ImageView back,home;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hindimainmenu);
        hproducts=(Button)findViewById(R.id.hproduct);
        hdownload=(Button)findViewById(R.id.hdownload);
        haboutus=(Button)findViewById(R.id.haboutus);
        hcontactus=(Button)findViewById(R.id.hcontactus);
        hvideos=(Button)findViewById(R.id.hvideos);
        hsocial=(Button)findViewById(R.id.hsocial);
        back=(ImageView)findViewById(R.id.back);
        //home=(ImageView)findViewById(R.id.home);
        hproducts.setOnClickListener(this);
        hdownload.setOnClickListener(this);
        haboutus.setOnClickListener(this);
        hcontactus.setOnClickListener(this);
        hvideos.setOnClickListener(this);
        hsocial.setOnClickListener(this);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),LanguageActivity.class);
                startActivity(intent);
            }
        });
       /* home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),Hindi_mainMenu.class);
                startActivity(intent);
            }
        });*/
    }


    public void onClick(View v) {
        if(v.getId()==R.id.hproduct) {
            startActivity(new Intent(getApplicationContext(), Hindi_Allproducts.class));
        }
        else if(v.getId()==R.id.hdownload)
        {
            startActivity(new Intent(getApplicationContext(),Hindi_Downloads.class));
        }
        else if (v.getId()==R.id.haboutus)
        {
            startActivity(new Intent(getApplicationContext(),Hindi_aboutus.class));
        }
        else if(v.getId()==R.id.hcontactus)
        {
            startActivity(new Intent(getApplicationContext(),Hindi_contactus.class));
        }
        else if(v.getId()==R.id.hvideos)

        {
            startActivity(new Intent(getApplicationContext(),Hindi_Videos.class));
        }
        else if(v.getId()==R.id.hsocial)
        {
            startActivity(new Intent(getApplicationContext(),Hsocial.class));
        }

    }
}
