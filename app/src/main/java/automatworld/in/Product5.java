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
public class Product5 extends Activity{
    ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purduct5);
        ImageView img1,img2,img3;
        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
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
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "AQ-112RS-113-RS.pdf");
                try
                {
                    in = assetManager.open("AQ-112RS-113-RS.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/AQ-112RS-113-RS.pdf"),
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
                File file = new File(getFilesDir(), "AQ-114RS.pdf");
                try
                {
                    in = assetManager.open("AQ-114RS.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/AQ-114RS.pdf"),
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
                File file = new File(getFilesDir(), "AQ-115RS.pdf");
                try
                {
                    in = assetManager.open("AQ-115RS.pdf");
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
                        Uri.parse("file://" + getFilesDir() + "/AQ-115RS.pdf"),
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
