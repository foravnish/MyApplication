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
 * Created by developer on 13-Jun-16.
 */
public class Product3 extends Activity {
    ImageView back,home;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img2_2,img1_3,img1_9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product3);

        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
       // img5=(ImageView)findViewById(R.id.img5);
        //img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);
        img8=(ImageView)findViewById(R.id.img8);
        img8=(ImageView)findViewById(R.id.img8);
        img2_2=(ImageView)findViewById(R.id.img2_2);
        img1_3=(ImageView)findViewById(R.id.img1_3);
        img1_9=(ImageView)findViewById(R.id.img1_9);
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

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "HT-205.pdf");
                try
                {
                    in = assetManager.open("HT-205.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/HT-205.pdf"),
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
                File file = new File(getFilesDir(), "Aquatuff Excel.pdf");
                try
                {
                    in = assetManager.open("Aquatuff Excel.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Aquatuff Excel.pdf"),
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
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Aquamic Inverted.pdf");
                try
                {
                    in = assetManager.open("Aquamic Inverted.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Aquamic Inverted.pdf"),
                        "application/pdf");

                startActivity(intent);
            }
        });
//        img5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AssetManager assetManager = getAssets();
//                InputStream in = null;
//                OutputStream out = null;
//                File file = new File(getFilesDir(), "Aquafog.pdf");
//                try
//                {
//                    in = assetManager.open("Aquafog.pdf");
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
//                        Uri.parse("file://" + getFilesDir() + "/Aquafog.pdf"),
//                        "application/pdf");
//
//                startActivity(intent);
//            }
//        });
//        img6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AssetManager assetManager = getAssets();
//                InputStream in = null;
//                OutputStream out = null;
//                File file = new File(getFilesDir(), "Aquafly.pdf");
//                try
//                {
//                    in = assetManager.open("Aquafly.pdf");
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
//                        Uri.parse("file://" + getFilesDir() + "/Aquafly.pdf"),
//                        "application/pdf");
//
//                startActivity(intent);
//            }
//        });
        img7.setOnClickListener(new View.OnClickListener() {
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
        img8.setOnClickListener(new View.OnClickListener() {
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
