package com.app.william.listmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView helloWorld = (TextView) findViewById(R.id.helloWorld);
        Button whatUp = (Button) findViewById(R.id.whatupbutton);
        whatUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloWorld.setText("Not what");
            }
        });
    }
}
