package lb.mayday.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 演唱会讨论Vp Fragment Adapter
 * Created by Administrator on 2017/7/25/025.
 */

public class ConcertDisTabAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;
    private String[] titleList;

    public ConcertDisTabAdapter(FragmentManager fm, List<Fragment> fragmentList, String[] titleList) {
        super(fm);
        this.fragmentList = fragmentList;
        this.titleList = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList[position];
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
