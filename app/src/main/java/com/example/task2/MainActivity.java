package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout laptop = findViewById(R.id.tLaptop);
        TableLayout printer = findViewById(R.id.tPrinter);
        TableLayout aksesoris = findViewById(R.id.tAccessoris);

        laptop.setOnClickListener(this);
        printer.setOnClickListener(this);
        aksesoris.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tLaptop){
            Intent intent = new Intent(this, LaptopActivity.class);
            intent.putExtra(LaptopActivity.KEY_DATA,"LAPTOPS");
            startActivity(intent);
        }else if(v.getId() == R.id.tPrinter){
            Intent intent = new Intent (this, PrinterActivity.class);
            intent.putExtra(PrinterActivity.KEY_DATA,"PRINTERS");
            startActivity(intent);
        }else if(v.getId() == R.id.tAccessoris){
            Intent intent = new Intent (this, AccesorisActivity.class);
            intent.putExtra(AccesorisActivity.KEY_DATA,"ACCESORIS");
            startActivity(intent);
        }
    }
}