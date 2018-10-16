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
public class HProduct4 extends Activity {
    ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hproduct4);
        ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16,img17,img18,img19,img2_6,img20;
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
        img2_6=(ImageView)findViewById(R.id.img2_6);
        img20=(ImageView)findViewById(R.id.img20);
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

        img20.setOnClickListener(new View.OnClickListener() {
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

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "Aqua Filtration & Fertigation Catalogue 2017.6-7.pdf");
                try
                {
                    in = assetManager.open("Aqua Filtration & Fertigation Catalogue 2017.6-7.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Aqua Filtration & Fertigation Catalogue 2017.6-7.pdf"),
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
                File file = new File(getFilesDir(), "AQ-123YF-123Y.pdf");
                try
                {
                    in = assetManager.open("AQ-123YF-123Y.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/AQ-123YF-123Y.pdf"),
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
                File file = new File(getFilesDir(), "Aqua Filtration & Fertigation Catalogue 2017.10-11.pdf");
                try
                {
                    in = assetManager.open("Aqua Filtration & Fertigation Catalogue 2017.10-11.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Aqua Filtration & Fertigation Catalogue 2017.10-11.pdf"),
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
                File file = new File(getFilesDir(), "AQ-124THC-124T.pdf");
                try
                {
                    in = assetManager.open("AQ-124THC-124T.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/AQ-124THC-124T.pdf"),
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
                File file = new File(getFilesDir(), "Aqua Filtration & Fertigation Catalogue 2017.22-23.pdf");
                try
                {
                    in = assetManager.open("Aqua Filtration & Fertigation Catalogue 2017.22-23.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Aqua Filtration & Fertigation Catalogue 2017.22-23.pdf"),
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
                File file = new File(getFilesDir(), "Aqua Filtration & Fertigation Catalogue 2017.24-25.pdf");
                try
                {
                    in = assetManager.open("Aqua Filtration & Fertigation Catalogue 2017.24-25.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Aqua Filtration & Fertigation Catalogue 2017.24-25.pdf"),
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
                File file = new File(getFilesDir(), "AQ-125TLHC-125TL.pdf");
                try
                {
                    in = assetManager.open("AQ-125TLHC-125TL.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/AQ-125TLHC-125TL.pdf"),
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
                File file = new File(getFilesDir(), "AQ-126THC-126T.pdf");
                try
                {
                    in = assetManager.open("AQ-126THC-126T.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/AQ-126THC-126T.pdf"),
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
                File file = new File(getFilesDir(), "Aqua Filtration & Fertigation Catalogue 2017.32-33.pdf");
                try
                {
                    in = assetManager.open("Aqua Filtration & Fertigation Catalogue 2017.32-33.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Aqua Filtration & Fertigation Catalogue 2017.32-33.pdf"),
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
                File file = new File(getFilesDir(), "Aqua Filtration & Fertigation Catalogue 2017.34-35.pdf");
                try
                {
                    in = assetManager.open("Aqua Filtration & Fertigation Catalogue 2017.34-35.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Aqua Filtration & Fertigation Catalogue 2017.34-35.pdf"),
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
                File file = new File(getFilesDir(), "AQ-135THC-135T.pdf");
                try
                {
                    in = assetManager.open("AQ-135THC-135T.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/AQ-135THC-135T.pdf"),
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
                File file = new File(getFilesDir(), "Aqua Filtration & Fertigation Catalogue 2017.38-39.pdf");
                try
                {
                    in = assetManager.open("Aqua Filtration & Fertigation Catalogue 2017.38-39.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Aqua Filtration & Fertigation Catalogue 2017.38-39.pdf"),
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
                File file = new File(getFilesDir(), "Aqua Filtration & Fertigation Catalogue 2017.40-41.pdf");
                try
                {
                    in = assetManager.open("Aqua Filtration & Fertigation Catalogue 2017.40-41.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Aqua Filtration & Fertigation Catalogue 2017.40-41.pdf"),
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
                File file = new File(getFilesDir(), "Aqua Filtration & Fertigation Catalogue 2017.42-43.pdf");
                try
                {
                    in = assetManager.open("Aqua Filtration & Fertigation Catalogue 2017.42-43.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/Aqua Filtration & Fertigation Catalogue 2017.42-43.pdf"),
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
                File file = new File(getFilesDir(), "AQ-134THC-134T-SASF.pdf");
                try
                {
                    in = assetManager.open("AQ-134THC-134T-SASF.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/AQ-134THC-134T-SASF.pdf"),
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
                File file = new File(getFilesDir(), "AQ-144_Hydro.pdf");
                try
                {
                    in = assetManager.open("AQ-144_Hydro.pdf");
                    out = openFileOutput(file.getName(),Context.MODE_WORLD_READABLE);
                } catch (Exception e)
                {
                    Log.e("exception", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + getFilesDir() + "/AQ-144_Hydro.pdf"),
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
                File file = new File(getFilesDir(), "AQ-146_Hydro.pdf");
                try
                {
                    in = assetManager.open("AQ-146_Hydro.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/AQ-146_Hydro.pdf"),
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

        img19.setOnClickListener(new View.OnClickListener() {
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
