package de.zimkand.reduce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        EditText edZaehler = findViewById(R.id.zaehler);
        EditText edNenner = findViewById(R.id.nenner);

        int nominator = Integer.parseInt(edZaehler.getText().toString());
        int nenner = Integer.parseInt(edNenner.getText().toString());
        int ggt=getGGT(nominator,nenner);

        edZaehler.setText((nominator/ggt)+"");
        edNenner.setText((nenner/ggt)+"");
    }

    public int getGGT(int a, int b){
        int ggT = 1;
        int r;
        do{
            r = a%b;
            a = b;
            b = r;
        } while(b!=0);
        return a;
    }
}
