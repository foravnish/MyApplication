package automatworld.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by developer on 07-Jun-16.
 */
public class LanguageActivity extends Activity implements OnClickListener {

    Button btn_hindi,btn_english;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.language_activity_layout);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"Error While loading",Toast.LENGTH_LONG).show();
        }

        btn_english = (Button)findViewById(R.id.btn_english);
        btn_english.setOnClickListener(this);
        btn_hindi = (Button)findViewById(R.id.btn_hindi);
        btn_hindi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btn_english){startActivity(new Intent(getApplicationContext(),MainMenu.class));}
        if(v.getId()==R.id.btn_hindi){startActivity(new Intent(getApplicationContext(),Hindi_mainMenu.class));}

    }
}
