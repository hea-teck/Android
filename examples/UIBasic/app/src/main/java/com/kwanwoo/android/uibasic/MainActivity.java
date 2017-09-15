package com.kwanwoo.android.uibasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), R.string.button_clicked_msg,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
   /* public void OnClickB1(View v) {
        Toast.makeText(getApplicationContext(), R.string.button_clicked_msg,
                Toast.LENGTH_SHORT).show();
    }
    */
}
