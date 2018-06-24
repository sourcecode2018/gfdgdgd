package com.example.ahmed.eventat.Activity;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.ahmed.eventat.Adapter.CustomFragmentPageAdapter;
import com.example.ahmed.eventat.Fragments.Ads;
import com.example.ahmed.eventat.Fragments.Favorite;
import com.example.ahmed.eventat.Fragments.MyBids;
import com.example.ahmed.eventat.Fragments.PrevioudBids;
import com.example.ahmed.eventat.R;

public class CategoryDetails extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_details);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        CustomFragmentPageAdapter fadapter = new CustomFragmentPageAdapter(this.getSupportFragmentManager());
        fadapter.fragmentadd(new PrevioudBids(), "1");
        fadapter.fragmentadd(new Ads(), "2");
        fadapter.fragmentadd(new Favorite(), "3");
        fadapter.fragmentadd(new MyBids(), "4");

        viewPager.setAdapter(fadapter);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

    }

    private void setupTabIcons() {
        View headerView = ((LayoutInflater)getApplicationContext(). getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.profile_tab_layout, null, false);

        final LinearLayout linearLayoutOne = (LinearLayout) headerView.findViewById(R.id.ssss);
        LinearLayout linearLayout2 = (LinearLayout) headerView.findViewById(R.id.ll2);
        LinearLayout linearLayout3 = (LinearLayout) headerView.findViewById(R.id.ll3);
        LinearLayout linearLayout4 = (LinearLayout) headerView.findViewById(R.id.ll4);

        tabLayout.getTabAt(0).setCustomView(linearLayoutOne);
        tabLayout.getTabAt(1).setCustomView(linearLayout2);
        tabLayout.getTabAt(2).setCustomView(linearLayout3);
        tabLayout.getTabAt(3).setCustomView(linearLayout4);


//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                int position = tabLayout.getSelectedTabPosition();
//                switch (position) {
//                    case 0:
//                        TextView imageView = (TextView) tab.getCustomView().findViewById(R.id.egtmaat);
//                        imageView.setTextColor(Color.parseColor("#FF6202"));
//                        break;
//
//                    case 1:
//                        TextView imageView2 = (TextView) tab.getCustomView().findViewById(R.id.moansabat);
//                        imageView2.setTextColor(Color.parseColor("#FF6202"));
//
//                        break;
//                }
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//                int position = tabLayout.getSelectedTabPosition();
//
//                switch (position) {
//                    case 0:
//                        TextView imageView = (TextView) tab.getCustomView().findViewById(R.id.egtmaat);
//                        imageView.setTextColor(Color.parseColor("#6A6563"));
//
//                        break;
//
//                    case 1:
//                        TextView imageView2 = (TextView) tab.getCustomView().findViewById(R.id.moansabat);
//                        imageView2.setTextColor(Color.parseColor("#6A6563"));
//
//                        break;
//
//
//                }
//
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//    }

    }

}
