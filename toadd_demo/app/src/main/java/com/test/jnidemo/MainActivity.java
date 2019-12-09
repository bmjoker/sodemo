package com.test.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText t1;
    private EditText t2;
    // Used to load the 'native-lib' library on application startup.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.btn1);
        t2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int m = Integer.parseInt(t1.getText().toString());
                int n = Integer.parseInt(t2.getText().toString());
                Toast.makeText(getApplicationContext(), "result：" + new toadd().add(m, n), Toast.LENGTH_LONG).show();
            }
        });
    }
}




