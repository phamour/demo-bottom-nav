package fr.yhuang.demobottomnav;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    public static final String TAG = "MAIN_GENERAL_LOG";

    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new MainAdapter(getSupportFragmentManager()));

        BottomNavigationView bar = (BottomNavigationView) findViewById(R.id.bottom_navigation_bar);
        bar.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_favorite:
                pager.setCurrentItem(MainAdapter.FAVORITE);
                break;
            case R.id.action_schedule:
                pager.setCurrentItem(MainAdapter.SCHEDULE);
                break;
            case R.id.action_music:
                pager.setCurrentItem(MainAdapter.MUSIC);
                break;
            default:
                break;
        }
        return false;
    }
}
