package sg.edu.rp.c346.id20015553.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1;
    TextView tvQ2;
    Button btnRevealQ1;
    Button btnRevealQ2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQ1 = findViewById(R.id.stringq1);
        tvQ2 = findViewById(R.id.stringq2);
        btnRevealQ1 = findViewById(R.id.stringReveal1);
        btnRevealQ2 = findViewById(R.id.stringReveal2);

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);
            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, AnswerActivity2.class);
                intent.putExtra("Question1", "Q2");
                startActivity(intent);
            }
        });
    }
}