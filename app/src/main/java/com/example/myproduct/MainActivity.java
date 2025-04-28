package com.example.myproduct;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvProducts;
    private ProductAdapter productAdapter;
    private List<Product> productList;
    private EditText etSearch;
    private FloatingActionButton fabAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProducts = findViewById(R.id.rvProducts);
        etSearch = findViewById(R.id.etSearch);
        fabAdd = findViewById(R.id.fabAdd);

        rvProducts.setLayoutManager(new GridLayoutManager(this, 2));

        productList = new ArrayList<>();
        productList.add(new Product("Macbook Air 2022", "Apple", R.drawable.macbook));
        productList.add(new Product("Women's Air Jordan 1", "Air Jordan", R.drawable.sneaker));
        productList.add(new Product("Fear Of God Hoodie", "Fear Of God", R.drawable.hoodie));
        productList.add(new Product("LVXN8 Backpack", "Louis Vuitton", R.drawable.backpack));

        productAdapter = new ProductAdapter(productList);
        rvProducts.setAdapter(productAdapter);

        fabAdd.setOnClickListener(view ->
                Toast.makeText(MainActivity.this, "Tambah produk baru!", Toast.LENGTH_SHORT).show()
        );
    }
}
