package com.example.yura.myimageview;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean flag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cat);
        imageView.setScaleType(ImageView.ScaleType.FIT_START);

    }

    public void onClick(View view) {
        ImageView ivSource = (ImageView) findViewById(R.id.imageView); // 1-й компонент с какой-то картинкой
        ImageView ivTarget = (ImageView) findViewById(R.id.imageView2); // 2-й компонент без картинки
if (!flag) {
    Drawable drawable = ivSource.getDrawable(); // получим картинку у первого компонента
    ivTarget.setImageDrawable(drawable); // присвоим второму
    ivTarget.setScaleType(ImageView.ScaleType.FIT_END);

    flag=true;
} else
{
    ivTarget.setImageDrawable(getResources().getDrawable(R.drawable.ic_android_black_24dp)); // присвоим второму
    ivTarget.setScaleType(ImageView.ScaleType.FIT_CENTER);

    flag=false;
}

    }
}
