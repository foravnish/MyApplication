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
 * Created by developer on 09-Jun-16.
 */
public class New_product extends Activity{
    ImageView img1,img2,img3,img4,img5,img6,img7,img9,img10,img11,img1_1,img2_2,img1_3,img2_4,img1_5,img2_6,img1_7,img2_8,img1_9,img2_10,img12;
    ImageView back,home;
    TextView t1,t2,t3,newpro,sc2,sc3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_product);
        //img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        //img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
        img5=(ImageView)findViewById(R.id.img5);
        img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);
        //img8=(ImageView)findViewById(R.id.img8);
        img9=(ImageView)findViewById(R.id.img9);
        img10=(ImageView)findViewById(R.id.img10);
        img11=(ImageView)findViewById(R.id.img11);
        img12=(ImageView)findViewById(R.id.img12);


        img1_1=(ImageView)findViewById(R.id.img1_1);
        img2_2=(ImageView)findViewById(R.id.img2_2);
        img1_3=(ImageView)findViewById(R.id.img1_3);
        img2_4=(ImageView)findViewById(R.id.img2_4);
        img1_5=(ImageView)findViewById(R.id.img1_5);
        img2_6=(ImageView)findViewById(R.id.img2_6);
        img1_7=(ImageView)findViewById(R.id.img1_7);
        img2_8=(ImageView)findViewById(R.id.img2_8);
        img1_9=(ImageView)findViewById(R.id.img1_9);
        img2_10=(ImageView)findViewById(R.id.img2_10);

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
//        img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//
//
//                AssetManager assetManager = getAssets();
//                InputStream in = null;
//                OutputStream out = null;
//                File file = new File(getFilesDir(), "Butterfly-Micro-Sprinkler.pdf");
//                try
//                {
//                    in = assetManager.open("Butterfly-Micro-Sprinkler.pdf");
//
//                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
//
//                    copyPdfFile(in, out);
//                    in.close();
//                    in = null;
//                    out.flush();
//                    out.close();
//                    out = null;
//
//                } catch (Exception e)
//                {
//                    Log.e("exception", e.getMessage());
//                }
//
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setDataAndType(
//                        Uri.parse("file://" + getFilesDir() + "/Butterfly-Micro-Sprinkler.pdf"),
//                        "application/pdf");
//
//                startActivity(intent);
//
//          }
//        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Check-valve.pdf");
                try
                {
                    in = assetManager.open("Check-valve.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Check-valve.pdf"),
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
                File file = new File(getFilesDir(), "Aquamic-Excel.pdf");
                try
                {
                    in = assetManager.open("Aquamic-Excel.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Aquamic-Excel.pdf"),
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
                File file = new File(getFilesDir(), "Butterfly-Valve.pdf");
                try
                {
                    in = assetManager.open("Butterfly-Valve.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Butterfly-Valve.pdf"),
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
                File file = new File(getFilesDir(), "Double Body disk filter.pdf");
                try
                {
                    in = assetManager.open("Double Body disk filter.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Double Body disk filter.pdf"),
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
                File file = new File(getFilesDir(), "Micro-Sprinkler-1.pdf");
                try
                {
                    in = assetManager.open("Micro-Sprinkler-1.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Micro-Sprinkler-1.pdf"),
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
                File file = new File(getFilesDir(), "PP-single-union-Ball-valve.pdf");
                try
                {
                    in = assetManager.open("PP-single-union-Ball-valve.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/PP-single-union-Ball-valve.pdf"),
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
                File file = new File(getFilesDir(), "Rain-Gun-Riser-Stand.pdf");
                try
                {
                    in = assetManager.open("Rain-Gun-Riser-Stand.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Rain-Gun-Riser-Stand.pdf"),
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
                File file = new File(getFilesDir(), "Y type manual disc filter-min.pdf");
                try
                {
                    in = assetManager.open("Y type manual disc filter-min.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Y type manual disc filter-min.pdf"),
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
                File file = new File(getFilesDir(), "Double Body screen Filters.pdf");
                try
                {
                    in = assetManager.open("Double Body screen Filters.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Double Body screen Filters.pdf"),
                        "application/pdf");

                startActivity(intent);

            }
        });










        img1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Irrigation_Accessories-min.pdf");
                try
                {
                    in = assetManager.open("Irrigation_Accessories-min.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Irrigation_Accessories-min.pdf"),
                        "application/pdf");

                startActivity(intent);

            }
        });


        img2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Aquafly-min.pdf");
                try
                {
                    in = assetManager.open("Aquafly-min.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Aquafly-min.pdf"),
                        "application/pdf");

                startActivity(intent);

            }
        });


        img1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Aquafog-min.pdf");
                try
                {
                    in = assetManager.open("Aquafog-min.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Aquafog-min.pdf"),
                        "application/pdf");

                startActivity(intent);

            }
        });


        img2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Irrigation_Accessories-minE.pdf");
                try
                {
                    in = assetManager.open("Irrigation_Accessories-minE.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Irrigation_Accessories-minE.pdf"),
                        "application/pdf");

                startActivity(intent);

            }
        });


        img1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "PVC_Wafer Swing Check Valve-min.pdf");
                try
                {
                    in = assetManager.open("PVC_Wafer Swing Check Valve-min.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/PVC_Wafer Swing Check Valve-min.pdf"),
                        "application/pdf");

                startActivity(intent);

            }
        });


        img2_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Eco Screen & Disc Filters-min.pdf");
                try
                {
                    in = assetManager.open("Eco Screen & Disc Filters-min.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Eco Screen & Disc Filters-min.pdf"),
                        "application/pdf");

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


        img2_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Poly Valves-min.pdf");
                try
                {
                    in = assetManager.open("Poly Valves-min.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Poly Valves-min.pdf"),
                        "application/pdf");

                startActivity(intent);

            }
        });


        img1_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Aquamic-min.pdf");
                try
                {
                    in = assetManager.open("Aquamic-min.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/Aquamic-min.pdf"),
                        "application/pdf");

                startActivity(intent);

            }
        });


        img2_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "PVC_Wafer Swing Check Valve-min.pdf");
                try
                {
                    in = assetManager.open("PVC_Wafer Swing Check Valve-min.pdf");

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
                        Uri.parse("file://" + getFilesDir() + "/PVC_Wafer Swing Check Valve-min.pdf"),
                        "application/pdf");

                startActivity(intent);

            }
        });

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
