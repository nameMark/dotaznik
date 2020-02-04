package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  RadioGroup.OnCheckedChangeListener{


    RadioGroup otazka1, otazka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        otazka1 = (RadioGroup) findViewById(R.id.otazka1);
        otazka2 = (RadioGroup) findViewById(R.id.otazka2);

        otazka1.setOnCheckedChangeListener(this);
        otazka2.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.muz:
                zprava("vybral si si: Muz");
                break;
            case R.id.zena:
            zprava("vybral si si: Zena");
                break;
            case R.id.nechcemZadat:
                zprava("vybral si si: Nechcem zadat");
                break;
            case R.id.cokoladu:
            zprava("vybral si si: cokolada");
                break;
            case R.id.zmrzlinu:
            zprava("vybral si si: zmrzlina");
                break;
            case R.id.cipsy:
            zprava("vybral si si: cipsy");
                break;
        }

    }
    public void zprava (String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
