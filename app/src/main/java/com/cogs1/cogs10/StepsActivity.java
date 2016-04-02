package com.cogs1.cogs10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StepsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);


        final Button nobrains = (Button) findViewById(R.id.btbrains); 
        final Button bResearch = (Button) findViewById(R.id.btResearch);
        final Button bPresent = (Button) findViewById(R.id.btPresentation);

        nobrains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent brainIntent = new Intent(StepsActivity.this, brainActivity.class);
                StepsActivity.this.startActivity(brainIntent);
            }

        });

        bResearch.setOnClickListener(new View.onClickListener(){

        }
    }
}