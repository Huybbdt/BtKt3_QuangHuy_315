package com.example.gk;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Main_Login extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    TextView QuangHuy_315;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        QuangHuy_315 = (TextView) findViewById(R.id.tvlg);
        bottomNavigationView = findViewById(R.id.BNV);

        QuangHuy_315.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Login.this, Main_Login_Click.class);
                startActivity(intent);
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.item_taikhoan);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.item_tintuc:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_dathang:
                        return;
                    case R.id.item_cuahang:
                        return;
                    case R.id.item_taikhoan:
                        return;
                }
            }
        });
    }

}
