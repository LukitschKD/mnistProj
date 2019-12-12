package com.example.mnistkdl;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//import java.awt.Image;
//import java.awt.image.BufferedImage;
//import javax.imageio.imageIO;
import java.io.File;
import java.io.IOException;

public class MainActivity extends Activity {

    private customCanvas cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cc = (customCanvas) findViewById(R.id.signature_canvas);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void buttonPressed(View view ){
        cc.saveDrawing();
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText( "TEST" );
        cc.saveDrawing();
        cc.clearCanvas();

        /*BufferedImage img = null;
        try {
            img = ImageIO.read(new File("drawing.png"));
        } catch (IOException e) {
        }
        Image newImage = img.getScaledInstance(28, 28, Image.SCALE_DEFAULT);*/
    }
}
