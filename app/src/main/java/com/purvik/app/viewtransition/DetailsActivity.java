package com.purvik.app.viewtransition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Purvik Rana on 07-04-2017.
 */

public class DetailsActivity extends AppCompatActivity {

    ImageView img;
    //TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("Details Activity");

        img = (ImageView) findViewById(R.id.ivProfile);
        img.setImageResource(R.mipmap.ic_launcher);

        /*title = (TextView) findViewById(R.id.title);
        title.setText(getIntent().getStringExtra("tvTitle"));*/

    }


}
