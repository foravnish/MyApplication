package automatworld.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by developer on 14-Jun-16.
 */
public class Product8 extends Activity{
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10;
    ImageView img11,img12,img13,img14,img15,img16,img17,img18,img19,img20;
    ImageView img21,img22,img23,img24,img25,img26,img27,img28,img29,img30;
    ImageView img31,img32,img33,img34,img35,img36,img37,img38,img39;
    ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product8);


        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
        img5=(ImageView)findViewById(R.id.img5);
        img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);
        img8=(ImageView)findViewById(R.id.img8);
        img9=(ImageView)findViewById(R.id.img9);
        img10=(ImageView)findViewById(R.id.img10);
        img11=(ImageView)findViewById(R.id.img11);
        img12=(ImageView)findViewById(R.id.img12);
        img13=(ImageView)findViewById(R.id.img13);
        img14=(ImageView)findViewById(R.id.img14);
        img15=(ImageView)findViewById(R.id.img15);
        img16=(ImageView)findViewById(R.id.img16);
        img17=(ImageView)findViewById(R.id.img17);
        img18=(ImageView)findViewById(R.id.img18);
        img19=(ImageView)findViewById(R.id.img19);
        img20=(ImageView)findViewById(R.id.img20);
        img21=(ImageView)findViewById(R.id.img21);
        img22=(ImageView)findViewById(R.id.img22);
        img23=(ImageView)findViewById(R.id.img23);
        img24=(ImageView)findViewById(R.id.img24);
        img25=(ImageView)findViewById(R.id.img25);
        img26=(ImageView)findViewById(R.id.img26);
        img27=(ImageView)findViewById(R.id.img27);
        img28=(ImageView)findViewById(R.id.img28);
        img29=(ImageView)findViewById(R.id.img29);
        img30=(ImageView)findViewById(R.id.img30);
        img31=(ImageView)findViewById(R.id.img31);
        img32=(ImageView)findViewById(R.id.img32);
        img33=(ImageView)findViewById(R.id.img33);
        img34=(ImageView)findViewById(R.id.img34);
        img35=(ImageView)findViewById(R.id.img35);
        img36=(ImageView)findViewById(R.id.img36);
        img37=(ImageView)findViewById(R.id.img37);
        img38=(ImageView)findViewById(R.id.img38);
        img39=(ImageView)findViewById(R.id.img39);
        back=(ImageView)findViewById(R.id.back);
        home=(ImageView)findViewById(R.id.home);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),Allproducts.class);
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
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-9KMPR-MINIPRO.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2015/02/RPS-50.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);

            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-9KRPS75-RPS-75.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-9KRPSS-RPS-SELECT-GEAR-DRIVEN-ROTORS.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);

            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-9KPRP-PROPLUS.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);

            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-9KSPR-SUPERPRO.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);

            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-KPRS-PROSPORT.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);

            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/RPS-SPRAYS.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);

            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-9KPROS-PRO-S-SPRAY.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);

            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/ADJUSTABLE-ARC-NOZZLE-FOR-SPRAY-POP-UPS.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/RN-SERIES-ROTARY-NOZZLES.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/900T-SERIES-POP-UP-SPRINKLER.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);



            }
        });
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/ALUMINUM-ADJUSTABLE-RISER-16-30.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/BUBBLER.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-9PGP-PLAY-GROUND-POP-UP.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/AQ-40G.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/AQ-42G.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-43G-SKIPPER.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);

            }
        });
        img19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-45G-DUPLEX.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);

            }
        });
        img20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-47G-MARINER.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/TRAVELER-IRRIGATION-SYSTEM.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/REGULAR-DRIPLINES.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/DRIPNET-PC.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/RAIN-EVO.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/RAIN-IDEA-RAIN-IDEA1-RIAN-IDEA2.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/PRS-469-CONTROLLER.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/RPS-1224-CONTROLLER.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/PRO-EX-MODULAR-CONTROLLER.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/PRO-TWO-2-WIRE-CONTROLLER.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/LOGICE-PLUS-2-WIRE-DECODER-BASED-TECHNOLOGY-CONTROLLER.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/HT-AIC-10-AUTOMATIC-IRRIGATION-CONTROLLER.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/PRO-SERIES-150-VALVES.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/RN160-PLUS-Rn-180-VALVES.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/RAIN-ADJUSTABLE-PRESSURE-REGULATOR.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);

                }
        });
        img35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/RAIN-SENSOR.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/WATER-LEVEL-CONTOLLER.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/Coupling-Valve.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/Lateral-Valves-Swing-Joints.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });
        img39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPdfUrl = "https://www.automatworld.in/wp-content/uploads/2013/09/Lateral-Valves-Swing-Joints.pdf";
                String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
                Intent intent=new Intent(getApplicationContext(),Web_View.class);
                intent.putExtra("key",url);
                startActivity(intent);


            }
        });


    }
}
