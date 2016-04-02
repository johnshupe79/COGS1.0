package com.cogs1.cogs10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SplashPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);

        final Button bTopic = (Button) findViewById(R.id.bTopic);
        final Button bNotifications = (Button) findViewById(R.id.bNotifications);
        final Button bSteps = (Button) findViewById(R.id.bSteps);

        bTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topicIntent = new Intent(SplashPage.this, TopicActivity.class);
                SplashPage.this.startActivity(topicIntent);
            }
        });

        bNotifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent notificationIntent = new Intent(SplashPage.this, NotificationsActivity.class);
                SplashPage.this.startActivity(notificationIntent);
            }
        });

        bSteps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StepsIntent = new Intent(SplashPage.this, StepsActivity.class);
                SplashPage.this.startActivity(StepsIntent);
            }
        });
    }
}
