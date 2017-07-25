package lb.mayday.ui.concert;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

import lb.mayday.R;
import lb.mayday.adapter.ConcertDisTabAdapter;
import lb.mayday.ui.BaseActivity;

/**
 * 演唱会详细页
 * Created by LB on 2017/7/22.
 */

public class ConcertDetailActivity extends BaseActivity {
    private TabLayout mTbTab;
    private ViewPager mVpDiscuss;
    private ConcertDisTabAdapter adapter;
    private ConcertDiscussFragment mFgDiscuss; //讨论
    private ConcertDiscussFragment mFgHot;     //热门
    private List<Fragment> fragmentList;
    private String[] titleList;             //Tab标题

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concertdetail);
        initControls();
        fragmentList = new ArrayList<>();
        fragmentList.add(mFgDiscuss);
        fragmentList.add(mFgHot);
        FragmentManager fm = getSupportFragmentManager();
        mVpDiscuss.setAdapter(new ConcertDisTabAdapter(fm, fragmentList, titleList));
        mTbTab.setupWithViewPager(mVpDiscuss);
    }

    @Override
    protected void initControls() {
        mTbTab = (TabLayout) findViewById(R.id.tb_tab);
        titleList = getResources().getStringArray(R.array.tab_concert_discuss);
        for (int i = 0; i < titleList.length; i++) {
            mTbTab.addTab(mTbTab.newTab().setText(titleList[i]));
        }

        mVpDiscuss = (ViewPager) findViewById(R.id.vp_cdiscuss);
        mFgDiscuss = new ConcertDiscussFragment();
        mFgHot = new ConcertDiscussFragment();
    }

}
