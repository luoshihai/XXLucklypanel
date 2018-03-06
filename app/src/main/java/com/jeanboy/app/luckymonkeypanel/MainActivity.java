package com.jeanboy.app.luckymonkeypanel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lsh.xxLucklyPanel.ImageViewListener;
import com.lsh.xxLucklyPanel.LuckyPanelView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private LuckyPanelView lucky_panel;
    private Button btn_action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> data = new ArrayList<>();
        data.add("aaa");
        data.add("aaa");
        data.add("aaa");
        data.add("aaa");
        data.add("aaa");
        data.add("aaa");
        data.add("aaa");
        data.add("aaa");
//        data.add(BitmapFactory.decodeResource(this.getResources(),R.mipmap.ic_launcher));
//        data.add(BitmapFactory.decodeResource(this.getResources(),R.mipmap.ic_launcher));
//        data.add(BitmapFactory.decodeResource(this.getResources(),R.mipmap.ic_launcher));
//        data.add(BitmapFactory.decodeResource(this.getResources(),R.mipmap.ic_launcher));
//        data.add(BitmapFactory.decodeResource(this.getResources(),R.mipmap.ic_launcher));
//        data.add(BitmapFactory.decodeResource(this.getResources(),R.mipmap.ic_launcher));
//        data.add(BitmapFactory.decodeResource(this.getResources(),R.mipmap.ic_launcher));
//        data.add(BitmapFactory.decodeResource(this.getResources(),R.mipmap.ic_launcher));
        lucky_panel = (LuckyPanelView) findViewById(R.id.lucky_panel);
        btn_action = (Button) findViewById(R.id.btn_action);
//        lucky_panel.setTextContent(data);
//        lucky_panel.setImageContent(data);
        lucky_panel.setImageContent(new ImageViewListener() {
            @Override
            public void onImageView(List<ImageView> imageViews) {
                for (ImageView imageView : imageViews) {
                    Glide.with(MainActivity.this).load("http://img4.imgtn.bdimg.com/it/u=122378782,224856546&fm=27&gp=0.jpg").into(imageView);
                }
            }
        });
        btn_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!lucky_panel.isGameRunning()) {
                    lucky_panel.startGame();
                } else {
                    int stayIndex = new Random().nextInt(8);
                    lucky_panel.tryToStop(stayIndex);
                }
            }
        });
    }
}
