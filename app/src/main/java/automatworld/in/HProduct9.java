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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by developer on 14-Jun-16.
 */
public class HProduct9 extends Activity{
    ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hproduct9);
        ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img1_1,img2_4,img2_10;
        img1=(ImageView)findViewById(R.id.img1);
        //img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
        img5=(ImageView)findViewById(R.id.img5);
        img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);
        img8=(ImageView)findViewById(R.id.img8);
        img9=(ImageView)findViewById(R.id.img9);
        img10=(ImageView)findViewById(R.id.img10);
        img1_1=(ImageView)findViewById(R.id.img1_1);
        img2_4=(ImageView)findViewById(R.id.img2_4);
        img2_10=(ImageView)findViewById(R.id.img2_10);
        back=(ImageView)findViewById(R.id.back);
        home=(ImageView)findViewById(R.id.home);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),Hindi_Allproducts.class);
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

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Pressure-Gauge1.pdf");
                try
                {
                    in = assetManager.open("Pressure-Gauge1.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Pressure-Gauge1.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });
//        img2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AssetManager assetManager = getAssets();
//                InputStream in = null;
//                OutputStream out = null;
//                File file = new File(getFilesDir(), "Irrigation_Accessories-min.pdf");
//                try
//                {
//                    in = assetManager.open("Irrigation_Accessories-min.pdf");
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
//                        Uri.parse("file://" + getFilesDir() + "/Irrigation_Accessories-min.pdf"),
//                        "application/pdf");
//
//                startActivity(intent);
//            }
//        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Irrigation-Accessories.pdf");
                try
                {
                    in = assetManager.open("Irrigation-Accessories.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Irrigation-Accessories.pdf"),
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
                File file = new File(getFilesDir(), "HT-Plastic-ARV-Continuous-ARV3.pdf");
                try
                {
                    in = assetManager.open("HT-Plastic-ARV-Continuous-ARV3.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/HT-Plastic-ARV-Continuous-ARV3.pdf"),
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
                File file = new File(getFilesDir(), "Pressure-Relief-Valves.pdf");
                try {
                    in = assetManager.open("Pressure-Relief-Valves.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Pressure-Relief-Valves.pdf"),
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
                File file = new File(getFilesDir(), "HT-Slip-on-flange-others.pdf");
                try
                {
                    in = assetManager.open("HT-Slip-on-flange-others.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/HT-Slip-on-flange-others.pdf"),
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
                File file = new File(getFilesDir(), "HT-Slip-on-flange-others.pdf");
                try
                {
                    in = assetManager.open("HT-Slip-on-flange-others.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/HT-Slip-on-flange-others.pdf"),
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
                File file = new File(getFilesDir(), "HT-Slip-on-flange-others.pdf");
                try
                {
                    in = assetManager.open("HT-Slip-on-flange-others.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/HT-Slip-on-flange-others.pdf"),
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
                File file = new File(getFilesDir(), "HT-Slip-on-flange-others.pdf");
                try
                {
                    in = assetManager.open("HT-Slip-on-flange-others.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/HT-Slip-on-flange-others.pdf"),
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
                File file = new File(getFilesDir(), "HT-Slip-on-flange-others.pdf");
                try
                {
                    in = assetManager.open("HT-Slip-on-flange-others.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/HT-Slip-on-flange-others.pdf"),
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
