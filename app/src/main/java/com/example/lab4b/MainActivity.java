package com.example.lab4b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gvProduct=(GridView) findViewById(R.id.gridView);
        ArrayList<Product> products=new ArrayList<>();
        products.add(new Product(R.drawable.giacchuyen, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        products.add(new Product(R.drawable.daynguon, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        products.add(new Product(R.drawable.dauchuyendoiii, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        products.add(new Product(R.drawable.dauchuyendoi, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        products.add(new Product(R.drawable.carbusbtops, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        products.add(new Product(R.drawable.daucam, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        ProductAdapter productAdapter=new ProductAdapter(this, products, R.layout.item);
        gvProduct.setAdapter(productAdapter);
    }
}