package com.purvik.app.viewtransition;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView ivProfile;
    //TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivProfile = (ImageView) findViewById(R.id.ivProfile);
        ivProfile.setImageResource(R.mipmap.ic_launcher);
        //tvTitle = (TextView) findViewById(R.id.textView);

        ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                //intent.putExtra("tvTitle", tvTitle.getText().toString());

                /*Pair<View, String> p1 = Pair.create((View)ivProfile, "profile");
                Pair<View, String> p2 = Pair.create((View)tvTitle, "title");

                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this,p1,p2 );*/

                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this,ivProfile,"profile");
                startActivity(intent, optionsCompat.toBundle());

            }
        });
    }
}
