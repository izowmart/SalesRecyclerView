package com.marttech.mysalesrecyclerviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ProductAdapter mProductAdapter;

    List<Product> mProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mProductList = new ArrayList<>();

        //adding some items to our list
        mProductList.add(
                new Product(
                        1,
                        "Nokia 5",
                        "A new bra - that runs on android",
                        18000,
                        8.7,
                        R.drawable.ic_launcher_background));
        mProductList.add(
                new Product(
                        1,
                        "MacBook",
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        5.8,
                        98000,
                        R.drawable.macbook));

        mProductList.add(
                new Product(

                        1,
                        "Lenovo Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.lenovo));

        mProductList.add(
                new Product(
                        1,
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        "14 inch, Gray, 1.659 kg",
                        4.3,
                        60000,
                        R.drawable.dellinspiron));

        mProductList.add(
                new Product(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.surface));
        mProductAdapter = new ProductAdapter(this,mProductList);
        mRecyclerView.setAdapter(mProductAdapter);
    }
}
