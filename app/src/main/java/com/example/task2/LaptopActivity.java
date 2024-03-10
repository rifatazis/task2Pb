package com.example.task2;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class LaptopActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String KEY_DATA = "key_laptop";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);

        TextView tvData = findViewById(R.id.tvData);
        TableRow laptop1 = findViewById(R.id.laptop1);
        TableRow laptop2 = findViewById(R.id.laptop2);
        TableRow laptop3 = findViewById(R.id.laptop3);
        TableRow laptop4 = findViewById(R.id.laptop4);
        TableRow laptop5 = findViewById(R.id.laptop5);

        laptop1.setOnClickListener(this);
        laptop2.setOnClickListener(this);
        laptop3.setOnClickListener(this);
        laptop4.setOnClickListener(this);
        laptop5.setOnClickListener(this);

        String name = getIntent().getStringExtra(KEY_DATA);
        tvData.setText(name);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.laptop1){

            Detail detail = new Detail();
            detail.setImage("laptop1");
            detail.setPrice("Rp  16.199.000");
            detail.setDescribe("OMEN Transcend Laptop 16-u0045TX\n" +
                    "AMD Ryzen™ 5 7640HS\n" +
                    "Windows 11 Home Single Language\n" +
                    "16 GB DDR5 RAM\n" +
                    "512 GB SSD Hard drive\n" +
                    "16.1 inch FHD IPS 144Hz Refresh Rate\n"+
                    "NVIDIA® GeForce RTX™ 4060 8 GB Graphics");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.laptop2) {
            Detail detail = new Detail();
            detail.setImage("laptop2");
            detail.setPrice("Rp  38.999.000");
            detail.setDescribe("OMEN Transcend Laptop 16-u0045TX\n" +
                    "Intel® Core™ i9-13900HX 13th Generation\n" +
                    "Windows 11 Home Single Language\n" +
                    "32 GB DDR5 RAM\n" +
                    "1 TB SSD Hard drive\n" +
                    "16.1 inch WQXGA 240Hz Refresh Rate\n"+
                    "NVIDIA® GeForce RTX™ 4070 8 GB Graphics");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }else if (v.getId() == R.id.laptop3) {
            Detail detail = new Detail();
            detail.setImage("laptop3");
            detail.setPrice("Rp  11.999.000");
            detail.setDescribe("HP Pavilion Plus Laptop 14-ey0017AU\n" +
                    "AMD Ryzen™ 5 7540U\n" +
                    "Windows 11 Home Single Language\n" +
                    "16 GB LPDDR5x RAM\n" +
                    "512 GB SSD Hard drive\n" +
                    "14 inch WUXGA IPS\n"+
                    "AMD Radeon™ 740M Graphics");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }else if (v.getId() == R.id.laptop4) {
            Detail detail = new Detail();
            detail.setImage("laptop4");
            detail.setPrice("Rp  8.399.000");
            detail.setDescribe("HP 14 inch Laptop 14s-dq4028TU\n" +
                                "Intel® Core™ i5-1155G7 11th Generation\n" +
                                "Windows 11 Home Single Language\n" +
                                "8 GB DDR4 RAM\n" +
                                "512 GB SSD Hard Drive\n" +
                                "14 inch FHD IPS\n"+
                                "Intel® Iris® Xᵉ Graphics");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }else if (v.getId() == R.id.laptop5) {
            Detail detail = new Detail();
            detail.setImage("laptop5");
            detail.setPrice("Rp  29.999.000");
            detail.setDescribe("HP Spectre 13.5 inch x360 2-in-1 Laptop 14-ef2000TU\n"+
                                "Intel® Core™ i7-1355U 13th Generation\n" +
                                "Windows 11 Home Single Language\n" +
                                "32 GB LPDDR4x RAM\n" +
                                "2 TB SSD Hard drive\n" +
                                "13.5 inch 3K2K, OLED , multitouch-enabled\n"+
                                "Intel® Iris® Xᵉ Graphics\n"+
                                "Intel® Evo™");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}