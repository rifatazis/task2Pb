package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

public class AccesorisActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String KEY_DATA = "key_accesoris";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accesoris);

        TextView tvdata = findViewById(R.id.tvData);
        TableRow aksesoris1 = findViewById(R.id.aksesoris1);
        TableRow aksesoris2 = findViewById(R.id.aksesoris2);
        TableRow aksesoris3 = findViewById(R.id.aksesoris3);
        TableRow aksesoris4 = findViewById(R.id.aksesoris4);
        TableRow aksesoris5 = findViewById(R.id.aksesoris5);

        aksesoris1.setOnClickListener(this);
        aksesoris2.setOnClickListener(this);
        aksesoris3.setOnClickListener(this);
        aksesoris4.setOnClickListener(this);
        aksesoris5.setOnClickListener(this);

        String name = getIntent().getStringExtra(KEY_DATA);
        tvdata.setText(name);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.aksesoris1){

            Detail detail = new Detail();
            detail.setImage("aksesoris1");
            detail.setPrice("RP 2.141.400");
            detail.setDescribe("HyperX Cloud II Wireless-Gaming Headset\n" +
                    "2.4GHz Wireless and up to 30 hour battery[1]\n" +
                    "DTS Headphone:X[3] Spatial Audio\n" +
                    "Signature HyperX Comfort\n" +
                    "Durable, aluminum frame\n");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.aksesoris2) {
            Detail detail = new Detail();
            detail.setImage("aksesoris2");
            detail.setPrice("RP 6.105.000");
            detail.setDescribe("Poly Voyager Free 60 UC+ BT700 USB-A Adapter + Basic Charge Case\n" +
                    "With adjustable hybrid adaptive active noise cancelling (ANC)\n" +
                    "Three microphones per earbud\n\n" +
                    "WindSmart technology for clearer outdoor calls\n" +
                    "Connect up to two Bluetooth® devices at any time\n" +
                    "Easy management via Poly Lens\n");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }else if (v.getId() == R.id.aksesoris3) {
            Detail detail = new Detail();
            detail.setImage("aksesoris3");
            detail.setPrice("RP 2.090.000");
            detail.setDescribe("HP USB-C G5 Essential Dock\n" +
                    "122 x 122 x 45 mm\n" +
                    "0.68 kg\n");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }else if (v.getId() == R.id.aksesoris4) {
            Detail detail = new Detail();
            detail.setImage("aksesoris4");
            detail.setPrice("RP 106.000");
            detail.setDescribe("HP 150 Wireless Mouse\n" +
                    "Wireless. Precise. Comfortable.\n" +
                    "With a 2.4 GHz wireless connection via simple dongle\n" +
                    "Elegant ergonomic design for all-day comfort\n" +
                    "With a 1,600 DPI optical sensor\n" +
                    "Ambidextrous design\n"+
                    "Dimensions (cm) : 10.3 x 6.11 x 3.4\n" +
                    "Weight : 0.05 kg\n"+
                    "With 1 Year Limited Warranty");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }else if (v.getId() == R.id.aksesoris5) {
            Detail detail = new Detail();
            detail.setImage("aksesoris5");
            detail.setPrice("RP 350.000");
            detail.setDescribe("HP 330 Wireless Mouse + Keyboard\n"+
                    "Sleek and silent\n" +
                    "Quiet is just your type\n" +
                    "LED indicators on NUM lock\n" +
                    "Caps lock and Scroll lock\n" +
                    "12 Fn shortcuts\n" +
                    "With 2.4GHz wireless connection\n"+
                    "Dimensions : 42.6 x 14.6 x 2.7 cm\n"+
                    "Weight : 450 g\n"+
                    "With 1 Year Limited Warranty");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}