package com.sgap.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        // Toggle para abrir/cerrar menú
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Acciones al pulsar elementos del menú
        navigationView.setNavigationItemSelectedListener(item -> {
            handleMenuClick(item);
            return true;
        });
    }

    private void handleMenuClick(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_tareas) {
            Toast.makeText(this, "Ir a Tareas", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_faltas) {
            Toast.makeText(this, "Ir a Faltas", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_horario) {
            Toast.makeText(this, "Ir a Horario", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_tutorias) {
            Toast.makeText(this, "Ir a Tutorías", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_cerrar_sesion) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        }

        drawerLayout.closeDrawers();
    }
}
