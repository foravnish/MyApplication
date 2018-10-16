package automatworld.in;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by developer on 10-Jun-16.
 */
public class Product2 extends Activity{
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16,img17,img18,img19,img20,img21;
    ImageView img22,img23,img24,img25,img26,img27,img28,img29,img30,img31,img32,img33,img34,img1_7;
    TextView tsc1,tsc2,tsc3;
    ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("start","Test1");
        super.onCreate(savedInstanceState);
        Log.d("end","Test1");
        try {
            setContentView(R.layout.product_2);
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
            //img34=(ImageView)findViewById(R.id.img34);
            img1_7=(ImageView)findViewById(R.id.img1_7);
            back=(ImageView)findViewById(R.id.back);
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("jmd","check");
        }
        home=(ImageView)findViewById(R.id.home);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Allproducts.class);
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
        img1_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Mini Sprinklers.pdf");
                try
                {
                    in = assetManager.open("Mini Sprinklers.pdf");

                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;

                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/Mini Sprinklers.pdf"),
                        "application/pdf");

                startActivity(intent);

            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-5N23.pdf");
                try {
                    in = assetManager.open("AQ-5N23.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e) {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-5N23.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-5N23W.pdf");
                try
                {
                    in = assetManager.open("AQ-5N23W.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-5N23W.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });


        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-5N25.pdf");
                try
                {
                    in = assetManager.open("AQ-5N25.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-5N25.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-5DN-KIWI.pdf");
                try
                {
                    in = assetManager.open("AQ-5DN-KIWI.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-5DN-KIWI.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-22.pdf");
                try
                {
                    in = assetManager.open("AQ-22.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-22.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-22W.pdf");
                try
                {
                    in = assetManager.open("AQ-22W.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-22W.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-05PC.pdf");
                try
                {
                    in = assetManager.open("AQ-05PC.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-05PC.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-22PC.pdf");
                try
                {
                    in = assetManager.open("AQ-22PC.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-22PC.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-23.pdf");
                try
                {
                    in = assetManager.open("AQ-23.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-23.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-15.pdf");
                try
                {
                    in = assetManager.open("AQ-15.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-15.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-20.pdf");
                try
                {
                    in = assetManager.open("AQ-20.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-20.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-20PC.pdf");
                try
                {
                    in = assetManager.open("AQ-20PC.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-20PC.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-20AF.pdf");
                try
                {
                    in = assetManager.open("AQ-20AF.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-20AF.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-46.pdf");
                try
                {
                    in = assetManager.open("AQ-46.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-46.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-46PC.pdf");
                try
                {
                    in = assetManager.open("AQ-46PC.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-46PC.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-25.pdf");
                try
                {
                    in = assetManager.open("AQ-25.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-25.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-30.pdf");
                try
                {
                    in = assetManager.open("AQ-30.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-30.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-30B.pdf");
                try
                {
                    in = assetManager.open("AQ-30B.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-30B.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-30BPC.pdf");
                try
                {
                    in = assetManager.open("AQ-30BPC.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-30BPC.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-30m.pdf");
                try
                {
                    in = assetManager.open("AQ-30m.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-30m.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-30P.pdf");
                try
                {
                    in = assetManager.open("AQ-30P.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-30P.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-40M.pdf");
                try
                {
                    in = assetManager.open("AQ-40M.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-40M.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-40pc.pdf");
                try
                {
                    in = assetManager.open("AQ-40pc.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-40pc.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-40B.pdf");
                try
                {
                    in = assetManager.open("AQ-40B.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-40B.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-40BPC.pdf");
                try
                {
                    in = assetManager.open("AQ-40BPC.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-40BPC.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-40G.pdf");
                try
                {
                    in = assetManager.open("AQ-40G.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-40G.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-42G.pdf");
                try
                {
                    in = assetManager.open("AQ-42G.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-42G.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });




        img28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-5la.pdf");
                try
                {
                    in = assetManager.open("AQ-5la.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-5la.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });

        img29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-5N7W.pdf");
                try
                {
                    in = assetManager.open("AQ-5N7W.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-5N7W.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });
        img30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-5N15.pdf");
                try
                {
                    in = assetManager.open("AQ-5N15.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-5N15.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });
        img31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-5N-WSL.pdf");
                try
                {
                    in = assetManager.open("AQ-5N-WSL.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-5N-WSL.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });
        img32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-22LA.pdf");
                try
                {
                    in = assetManager.open("AQ-22LA.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-22LA.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });
        img33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-22LA-W.pdf");
                try
                {
                    in = assetManager.open("AQ-22LA-W.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyPdfFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-22LA-W.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });
//        img34.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AssetManager assetManager = getAssets();
//                InputStream in = null;
//                OutputStream out = null;
//                File file = new File(getFilesDir(), "HT-22U-mini-Sprinkler.pdf");
//                try
//                {
//                    in = assetManager.open("HT-22U-mini-Sprinkler.pdf");
//                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
//
//                    copyPdfFile(in, out);
//                    in.close();
//                    in = null;
//                    out.flush();
//                    out.close();
//                    out = null;
//                } catch (Exception e)
//                {
//                    Log.e("exception", e.getMessage());
//                }
//
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setDataAndType(
//                        Uri.parse("file://" + getFilesDir() + "/HT-22U-mini-Sprinkler.pdf"),
//                        "application/pdf");
//
//                startActivity(intent);
//            }
//        });




    }
    private void copyPdfFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, read);
        }
    }
}
