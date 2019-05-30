package com.example.snackbarmad311;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_click = findViewById(R.id.btn_click);


        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Snackbar snb = Snackbar.make(findViewById(R.id.myview),"Done !",Snackbar.LENGTH_LONG);
                snb.show();*/


                Snackbar snb = Snackbar.make(findViewById(R.id.myview),"Action Snackbar!",Snackbar.LENGTH_INDEFINITE).setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Snackbar Toast",Toast.LENGTH_LONG).show();
                    }
                });


                snb.show();
            }
        });

    }
}
