package com.sgap.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.sgap.app.fragments.FaltasFragment;
import com.sgap.app.fragments.HorarioFragment;
import com.sgap.app.fragments.TareasFragment;
import com.sgap.app.fragments.TutoriasFragment;

public class HomeActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Enlazamos las vistas con sus IDs desde el layout XML
        drawerLayout = findViewById(R.id.drawer_layout); // El contenedor del menú lateral
        navigationView = findViewById(R.id.navigation_view); // La vista del menú (el propio menú)
        toolbar = findViewById(R.id.toolbar); // La barra superior de la app (AppBar)

        // Configuramos la Toolbar para que actúe como ActionBar
        setSupportActionBar(toolbar);

        // Toggle del Drawer (menú lateral)
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        // Asociamos el toggle al DrawerLayout
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();; // Sincroniza el estado del icono "hamburguesa" con el Drawer


        // Establecemos el listener para manejar clicks en los ítems del menú
        navigationView.setNavigationItemSelectedListener(item -> {
            handleMenuClick(item);// Metodo que gestiona las acciones según el ítem pulsado
            return true;// Indica que el click fue manejado
        });

        // Fragment inicial
        loadFragment(new TareasFragment());
    }

    /**
     * Metodo para manejar los clicks en los elementos del menú de navegación.
     * Según el elemento pulsado, realiza una acción diferente.
     */
    private void handleMenuClick(MenuItem item) {
        int id = item.getItemId();
        Fragment fragment = null;

        if (id == R.id.nav_tareas) {
            fragment = new TareasFragment();
        } else if (id == R.id.nav_faltas) {
            fragment = new FaltasFragment();
        } else if (id == R.id.nav_horario) {
            fragment = new HorarioFragment();
        } else if (id == R.id.nav_tutorias) {
            fragment = new TutoriasFragment();
        } else if (id == R.id.nav_cerrar_sesion) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }

        if (fragment != null) {
            loadFragment(fragment);
        }

        drawerLayout.closeDrawers(); // Cierra el menú después de seleccionar
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
