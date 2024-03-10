package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

public class PrinterActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String KEY_DATA = "key_printer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printer);


        TextView tvdata = findViewById(R.id.tvData);
        TableRow printer1 = findViewById(R.id.printer1);
        TableRow printer2 = findViewById(R.id.printer2);
        TableRow printer3 = findViewById(R.id.printer3);
        TableRow printer4 = findViewById(R.id.printer4);
        TableRow printer5 = findViewById(R.id.printer5);

        printer1.setOnClickListener(this);
        printer2.setOnClickListener(this);
        printer3.setOnClickListener(this);
        printer4.setOnClickListener(this);
        printer5.setOnClickListener(this);

        String name = getIntent().getStringExtra(KEY_DATA);
        tvdata.setText(name);
    }

    @Override
    public void onClick(View v) {


        if (v.getId() == R.id.printer1){

            Detail detail = new Detail();
            detail.setImage("printer1");
            detail.setPrice("RP 1.800.000");
            detail.setDescribe("HP Ink Tank 315 All-in-One Printer\n" +
                    "A4 Color Inkjet Printer, Perfect for Home\n" +
                    "Print, Scan and Copy\n" +
                    "Print speed up to 8 ppm (black) and 5 ppm (color)\n" +
                    "Extremely low cost-per-page at just IDR 11 (color) & IDR 21 (black)\n" +
                    "1 Hi-Speed USB 2.0\n"+
                    "NVIDIA® GeForce RTX™ 4060 8 GB Graphics");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.printer2) {
            Detail detail = new Detail();
            detail.setImage("printer2");
            detail.setPrice("Rp  2.500.000");
            detail.setDescribe("HP Smart Tank 585 Wi Fi All-in-One Printer\n" +
                    "Low Cost - high volume, color printing\n" +
                    "A4 Colour Smart Tank All-In-One Printer, Perfect for Home\n" +
                    "Print, copy, scan \n" +
                    "Print speed up to 12 ppm (black) and 5 ppm (color) \n" +
                    "Up tp 16.000 pages in the box and extremely low \n" +
                    "cost-per-page at just Rp 11 (color) and Rp 21 (black)\n"+
                    "Hi-Speed USB 2.0, Wi-Fi");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }else if (v.getId() == R.id.printer3) {
            Detail detail = new Detail();
            detail.setImage("printer3");
            detail.setPrice("Rp  1.695.000 ");
            detail.setDescribe("HP Laser 107a Printer\n" +
                    "A4 Color Laser Printer, Perfect for Business\n" +
                    "Print only\n" +
                    "Print speed up to 21 ppm(black)\n" +
                    "USB\n");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }else if (v.getId() == R.id.printer4) {
            Detail detail = new Detail();
            detail.setImage("printer4");
            detail.setPrice("RP  8.984.000");
            detail.setDescribe("HP Color Laser 150nw Printer\n" +
                    "A4 Color Laser Printer, Perfect for Business\n" +
                    "Print only\n" +
                    "Print speed up to 19 ppm (black) and 4 ppm (color)\n" +
                    "USB, Ethernet, Wi-Fi\n");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }else if (v.getId() == R.id.printer5) {
            Detail detail = new Detail();
            detail.setImage("printer5");
            detail.setPrice("RP 4.150.000");
            detail.setDescribe("HP Smart Tank 720 Wi Fi All-in-One Printer\n"+
                    "A4 Color Inkjet Printer, Perfect for Home\n" +
                    "Print, Scan, Copy and Auto Duplex Printing( 2 sided printing)\n" +
                    "Print speed up to 15 ppm (black) and 9 ppm (color)\n" +
                    "Extremely low cost-per-page at just IDR 11 (color) & IDR 21 (black)\n" +
                    "Hi-Speed USB 2.0, Wi-Fi\n"+
                    "Duplex Printing\n");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }

    }
}