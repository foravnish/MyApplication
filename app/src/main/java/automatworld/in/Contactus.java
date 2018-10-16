package automatworld.in;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by developer on 09-Jun-16.
 */
public class Contactus extends Activity {

    ImageView back,home;
    private GoogleMap mMap;
    private Context context;
    EditText name,com,ph,email,mess;
    Button btn_send,btn_enq;
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);
     context=this;


        back=(ImageView)findViewById(R.id.back);
        home=(ImageView)findViewById(R.id.home);

        //name=(EditText)findViewById(R.id.name);
        //com=(EditText)findViewById(R.id.company);
        //ph= (EditText)findViewById(R.id.phone);
        //email=(EditText)findViewById(R.id.email);
        //btn_send=(Button)findViewById(R.id.send);
        btn_enq=(Button)findViewById(R.id.sendenquiry);
        btn_enq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enquiry();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainMenu.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainMenu.class);
                startActivity(intent);
            }
        });

    }

    private boolean isValidMail(String email2)
    {
        boolean check;
        Pattern p;
        Matcher m;

        String EMAIL_STRING = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        p = Pattern.compile(EMAIL_STRING);

        m = p.matcher(email2);
        check = m.matches();

        if(!check)
        {
            Toast.makeText(Contactus.this, "Not Valid Email", Toast.LENGTH_SHORT).show();
        }
        return check;
    }
    private boolean isValidMobile(String phone)
    {
        if (phone.length()!=10) {
            return false;
        } else {
            return android.util.Patterns.PHONE.matcher(phone).matches();
        }
    }

        public void enquiry()
        {


                AlertDialog.Builder dialog=new AlertDialog.Builder(context);
            dialog.setTitle("Send Enquiry");
            LayoutInflater layoutInflater=LayoutInflater.from(context);
           final View view=layoutInflater.inflate(R.layout.enquiry, null);

            final  EditText name= (EditText) view.findViewById(R.id.name);
            final EditText com= (EditText) view.findViewById(R.id.company);
            final EditText phone= (EditText) view.findViewById(R.id.phone);
            final EditText email= (EditText) view.findViewById(R.id.email);
            final EditText mess= (EditText) view.findViewById(R.id.message);

            final Button can=(Button)view.findViewById(R.id.cancle);
            can.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent =new Intent(getApplicationContext(),Hindi_contactus.class);
                    startActivity(intent);
                }
            });
            final Button btn=(Button)view.findViewById(R.id.send);
            btn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    String user_name=name.getText().toString();
                    String company=com.getText().toString();
                    String  ph=phone.getText().toString();
                    String email_id=email.getText().toString();
                    String message=mess.getText().toString();

                    if(user_name.isEmpty())
                    {
                        Toast.makeText(Contactus.this, "Required Your Name", Toast.LENGTH_SHORT).show();
                    }
                    else if(!user_name.isEmpty() && company.isEmpty())
                    {
                        Toast.makeText(Contactus.this, "Required Your Company name", Toast.LENGTH_SHORT).show();
                    }
                    else if(!user_name.isEmpty() && !company.isEmpty()&& ph.isEmpty())
                    {
                        Toast.makeText(Contactus.this, "Required  Phone number", Toast.LENGTH_SHORT).show();

                    }else if(!user_name.isEmpty() && !company.isEmpty()&& !ph.isEmpty() && !isValidMobile(ph))
                    {
                        Toast.makeText(Contactus.this, "Enter valid phone number", Toast.LENGTH_SHORT).show();

                    }

                    else if(!user_name.isEmpty()&&!company.isEmpty()&&!ph.isEmpty()&& isValidMobile(ph) && email_id.isEmpty())
                    {
                        Toast.makeText(Contactus.this, "Required Your Email", Toast.LENGTH_SHORT).show();

                    }
                    else if(!user_name.isEmpty() && !company.isEmpty()&& !ph.isEmpty() && isValidMobile(ph) && !isValidMail(email_id))
                    {
                        Toast.makeText(Contactus.this, "Enter valid email id number", Toast.LENGTH_SHORT).show();

                    }
                    else if(!user_name.isEmpty()&&!company.isEmpty()&&!ph.isEmpty()&&!email_id.isEmpty() && isValidMail(email_id) &&message.isEmpty())
                    {
                        Toast.makeText(Contactus.this, "Required Message", Toast.LENGTH_SHORT).show();

                    }
                    else {


                        Intent gmail = new Intent(Intent.ACTION_VIEW);
                        gmail.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
                        gmail.putExtra(Intent.EXTRA_EMAIL, new String[]{"marketing@automatworld.com"});
                        gmail.setData(Uri.parse("marketing@automatworld.com"));
                        gmail.putExtra(Intent.EXTRA_SUBJECT, "Mobile App Automat");
                        gmail.setType("plain/text");
                        gmail.putExtra(Intent.EXTRA_TEXT, "Name:" + "\n" + user_name + "\n" + "\n" + "Company name" + "\n"
                                + company + "\n" + "\n" + "Phone Number" + "\n" + ph + "\n" + "\n"
                                + "Email Address" + "\n" + email_id + "\n" + "\n \n" + "Message" + "\n" + message);
                        startActivity(gmail);
                        alertDialog.dismiss();
                    }

                }
            });

            dialog.setView(view);

            alertDialog=dialog.create();
            alertDialog.show();

        }

}
