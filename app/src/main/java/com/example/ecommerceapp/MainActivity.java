package com.example.ecommerceapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    ArrayList<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        productList = new ArrayList<>();

        addProducts();

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        adapter = new ProductAdapter(productList);

        recyclerView.setAdapter(adapter);
    }

    private void addProducts() {

        productList.add(new Product(
                "Bitzwolf B-CC1 Camera",
                "1080P HD Webcame",
                48.89,
                R.drawable.bitzwolf_camera
        ));

        productList.add(new Product(
                "Bitzwolf Printer",
                "Wireless HD Printer",
                55.89,
                R.drawable.wirelessprinter
        ));

        productList.add(new Product(
                "Bitzwolf Security Camera",
                "Smart Home Camera",
                78.89,
                R.drawable.smarthomecamera
        ));

        productList.add(new Product(
                "Bitzwolf Digital Camera",
                "1080P HD Webcame",
                88.55,
                R.drawable.webcame
        ));

        productList.add(new Product(
                "Wireless Webcam",
                "Full HD Camera",
                23.67,
                R.drawable.fullcamera
        ));

        productList.add(new Product(
                "Bitzwolf B-CC1 Camera",
                "1080P HD Webcame",
                44.89,
                R.drawable.webcame
        ));

        productList.add(new Product(
                "Smart Camera",
                "Home Security Camera",
                35.99,
                R.drawable.smarthomecamera
        ));

        productList.add(new Product(
                "Wireless Printer",
                "Compact Printer",
                65.50,
                R.drawable.wirelessprinter
        ));
    }
}
