package lehuukhanh.com.foody.activity;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;


import lehuukhanh.com.foody.R;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigation);
        Toolbar toolbar = findViewById(R.id.toolBar);
        NavigationView navigationView = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawerLayout);

        setSupportActionBar(toolbar);
        //Cho phép hiển thị nút back trên thanh công cụ
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Setup DrawerToggle (dùng để thay đổi hình ảnh của nút toggle trên thanh toolbar
        //khi người dùng mở và đóng thanh điều hướng (navigation drawer)
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(
                MainActivity.this,
                drawerLayout,
                toolbar,
                R.string.open,
                R.string.close);
        drawerToggle.setDrawerIndicatorEnabled(true);
        //đồng bộ trạng thái của DrawerToggle với trạng thái của DrawerLayout
        drawerToggle.syncState();
        //gắn kết DrawerToggle với DrawerLayout
        drawerLayout.addDrawerListener(drawerToggle);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_navigation);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.mSignout){
                    Toast.makeText(MainActivity.this, "Sign_out success", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.mProfile) {
                    toolbar.setTitle("Profile");
                    Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                }else if (item.getItemId() == R.id.mOrders) {
                    toolbar.setTitle("Orders");
                    Toast.makeText(MainActivity.this, "Orders", Toast.LENGTH_SHORT).show();
                }else if (item.getItemId() == R.id.mOffer) {
                    toolbar.setTitle("Offer");
                    Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                }else if (item.getItemId() == R.id.mPrivacy) {
                    toolbar.setTitle("Profile");
                    Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                }else if (item.getItemId() == R.id.mSecurity) {
                    toolbar.setTitle("Profile");
                    Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.action_home){
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.action_favorite) {
                    Toast.makeText(MainActivity.this, "Favorite", Toast.LENGTH_SHORT).show();
                }else if(id == R.id.action_profile){
                    Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                }else if(id == R.id.action_history){
                    Toast.makeText(MainActivity.this, "History", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START);
        }
        return super.onOptionsItemSelected(item);
    }
}