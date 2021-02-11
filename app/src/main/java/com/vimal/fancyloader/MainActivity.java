package com.vimal.fancyloader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;

import com.agrawalsuneet.dotsloader.loaders.AllianceLoader;
import com.agrawalsuneet.dotsloader.loaders.BounceLoader;
import com.agrawalsuneet.dotsloader.loaders.LightsLoader;
import com.agrawalsuneet.dotsloader.loaders.PullInLoader;
import com.agrawalsuneet.dotsloader.loaders.RotatingCircularDotsLoader;
import com.agrawalsuneet.dotsloader.loaders.SlidingLoader;
import com.agrawalsuneet.dotsloader.loaders.TashieLoader;
import com.agrawalsuneet.dotsloader.loaders.TrailingCircularDotsLoader;
import com.agrawalsuneet.dotsloader.loaders.ZeeLoader;

public class MainActivity extends AppCompatActivity {

    LinearLayout containerLL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        containerLL = findViewById(R.id.container);

        TashieLoader tashie = new TashieLoader(
                this, 5,
                30, 10,
                ContextCompat.getColor(this, R.color.green));

        tashie.setAnimDuration(500);
        tashie.setAnimDelay(100);
        tashie.setInterpolator(new LinearInterpolator());
        containerLL.addView(tashie);

        //sliding loader
        SlidingLoader sliding = new SlidingLoader(this, 40, 10,
                ContextCompat.getColor(this, R.color.red),
                ContextCompat.getColor(this, R.color.yellow),
                ContextCompat.getColor(this, R.color.green));
        sliding.setAnimDuration(1000);
        sliding.setDistanceToMove(12);
        containerLL.addView(sliding);

        //RotatingCircularDotsLoader
        RotatingCircularDotsLoader loader = new RotatingCircularDotsLoader(this,
                20, 60, ContextCompat.getColor(this, R.color.red));
        loader.setAnimDuration(3000);
        containerLL.addView(loader);


        //trailingCircularDotsLoader
        TrailingCircularDotsLoader trailingCircularDotsLoader = new TrailingCircularDotsLoader(
                this,
                24,
                ContextCompat.getColor(this, android.R.color.holo_green_light),
                100,
                5);
        trailingCircularDotsLoader.setAnimDuration(1200);
        trailingCircularDotsLoader.setAnimDelay(200);
        containerLL.addView(trailingCircularDotsLoader);


        //zeeloader
        ZeeLoader zeeLoader = new ZeeLoader(
                this,
                60,
                4,
                ContextCompat.getColor(this, R.color.red),
                ContextCompat.getColor(this, R.color.red));

        zeeLoader.setAnimDuration(200);
        containerLL.addView(zeeLoader);

        AllianceLoader allianceLoader = new AllianceLoader(
                this,
                40,
                6,
                true,
                10,
                ContextCompat.getColor(this, R.color.red),
                ContextCompat.getColor(this, R.color.amber),
                ContextCompat.getColor(this, R.color.green));

        allianceLoader.setAnimDuration(500);
        containerLL.addView(allianceLoader);

        LightsLoader lightsLoader = new LightsLoader(
                this, 5,
                30, 10,
                ContextCompat.getColor(this, R.color.red));
        containerLL.addView(lightsLoader);

        PullInLoader pullInLoader = new PullInLoader(this,
                20, 100, ContextCompat.getColor(this, R.color.red));
        pullInLoader.setAnimDuration(2000);
        containerLL.addView(pullInLoader);

        PullInLoader pullInLoader2 = new PullInLoader(this,
                30, 160, getResources().getIntArray(R.array.vibgyorg));
        pullInLoader.setAnimDuration(2000);
        containerLL.addView(pullInLoader2);

        BounceLoader bounceLoader = new BounceLoader(this,
                60,
                ContextCompat.getColor(this, R.color.red),
                true,
                ContextCompat.getColor(this, R.color.black));

        bounceLoader.setAnimDuration(1000);
        containerLL.addView(bounceLoader);
    }
}