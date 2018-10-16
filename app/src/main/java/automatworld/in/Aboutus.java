package automatworld.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by developer on 09-Jun-16.
 */
public class Aboutus extends Activity {
    TextView text_about;
    ImageView back,home;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        text_about=(TextView)findViewById(R.id.text_about);
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
        text_about.setText("Founded by Mr. P.K.Jain in 1972, Automat Industries is an organization with global presence headquartered in New Delhi. The group employs more than 1200 people and has its manufacturing operations at multiple locations in India.\n" +
                "\n" +
                "Automat is one of the largest manufacturer of Irrigation Sprinklers, filteration and fertigation equipment & other irrigation accessories which form a key input of any Irrigation system.\n" +
                "\n" +
                "With more than 350 Irrigation Products in its portfolio and presence in more than 80 countries, Automat has catapulted to become an important player in the International market. It caters to the needs of various buyers across price points, product portfolio across the world.\n" +
                "\n" +
                "In a globalized economy where quality & reliability are the prerequisites for a successful organization, Automat has proved its credentials and has emerged as a leader not only in manufacturing but in constantly conceiving new products as well.\n" +
                "\n" +
                "Our continuous endeavor is to incorporate innovation in design, development, manufacture and delivery of products in varied volumes.\n" +
                "\n" +
                "The biggest strength of Automat lies in its ability to integrate knowledge, skills & resources from different fields of engineering to develop reliable products and come up with cost competitive solutions");
    }
}
