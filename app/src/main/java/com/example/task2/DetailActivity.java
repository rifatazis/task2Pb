package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String KEY_DATA ="key_detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView ivDetail = findViewById(R.id.ivDetail);
        TextView tvPrice = findViewById(R.id.tvPrice);
        TextView tvDetail = findViewById(R.id.tvDetail);
        Button btnShare = findViewById(R.id.btnShare);

        btnShare.setOnClickListener(this);
        Detail detail;
        if (Build.VERSION.SDK_INT >= 33){
            detail = getIntent().getParcelableExtra(KEY_DATA,Detail.class);
        }else {
            detail = getIntent().getParcelableExtra(KEY_DATA);
        }

        String src = detail.getImage();
        int source = getResources().getIdentifier(src,"drawable", getPackageName());
        String price = detail.getPrice();
        String describe = detail.getDescribe();

        ivDetail.setImageResource(source);
        tvPrice.setText(price);
        tvDetail.setText(describe);
    }

    @Override
    public void onClick(View v) {
        btnShare();
    }

    private void btnShare() {
        Detail detail = getIntent().getParcelableExtra(KEY_DATA);

        String price = detail.getPrice();
        String describe = detail.getDescribe();
        String src = detail.getImage();

        String message = "Check out this product:\n" +
                "Price: " + price + "\n" +
                "Description: " + describe;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/*");
        shareIntent.putExtra(Intent.EXTRA_TEXT, message);

        int imageResourceId = getResources().getIdentifier(src, "drawable", getPackageName());
        Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + imageResourceId);
        shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);

        Intent chooserIntent = Intent.createChooser(shareIntent, "Share via");
        startActivity(chooserIntent);


    }
}