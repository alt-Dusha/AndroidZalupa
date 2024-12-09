package com.example.android4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int one, two, three;
                Random random = new Random();
                int[] A = new int[2];
                int[] B = new int[2];
                int[] C = new int[2];

                for (int i = 0; i < 3; i++){
                    switch (i){
                        case 0:
                            for (int j = 0; j < 2; j++){
                                A[i] = random.nextInt(11);
                            }
                        case 1:
                            for (int j = 0; j < 2; j++){
                                B[i] = random.nextInt(11);
                            }
                        case 2:
                            for (int j = 0; j < 2; j++){
                                C[i] = random.nextInt(11);
                            }
                    }
                }

                one = ;
                two = ;
                three = ;

                TextView odin = findViewById(R.id.firstView);
                odin.setText(String.valueOf(one));

                TextView dva = findViewById(R.id.secondView);
                dva.setText(String.valueOf(two));

                TextView tri = findViewById(R.id.thirdView);
                tri.setText(String.valueOf(three));


                TextView tp = findViewById(R.id.thirdView3);
                TextView ts = findViewById(R.id.thirdView4);
                if (one + two > three && one + three > two && two + three > one){
                    double p, s;
                    p = one + two + three;
                    s = Math.sqrt(p/2*(p/2-one)*(p/2-two)*(p/2-three));
                    tp.setText(String.valueOf(p));
                    ts.setText(String.valueOf(s));
                }
                else {
                    ts.setText("");
                    tp.setText("not exist");
                }
            }
        });
    }
}