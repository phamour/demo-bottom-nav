package fr.yhuang.demobottomnav;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

/**
 * Created by yipeng on 2016/12/11.
 */

public class MainAdapter extends FragmentStatePagerAdapter {

    public static final int FAVORITE = 0;
    public static final int SCHEDULE = 1;
    public static final int MUSIC = 2;

    public MainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.d(MainActivity.TAG, "Invoked getItem(" + position + ")");
        switch (position) {
            case FAVORITE:
                return new FavoriteFragment();
            case SCHEDULE:
                return new ScheduleFragment();
            case MUSIC:
                return new MusicFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
