package com.example.fragementwithreclerview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout)findViewById(R.id.tablayout_id);
        viewPager=(ViewPager)findViewById(R.id.viewpager_id);
        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());


        viewPagerAdapter.AddFragemt(new Fragement_shoping(),"Shoping");
        viewPagerAdapter.AddFragemt(new Fragement_Women(),"Women");
        viewPagerAdapter.AddFragemt(new Fragement_movee(),"Recharge");
        viewPagerAdapter.AddFragemt(new Fragement_Recharge(),"Movie");
        viewPagerAdapter.AddFragemt(new Fragement_Recharge(),"Baby and Kids");
        viewPagerAdapter.AddFragemt(new Fragement_Recharge(),"Travel");
        viewPagerAdapter.AddFragemt(new Fragement_food(),"Food");




        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_contacts_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favorite_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_contacts_black_24dp);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_contacts_black_24dp);
        tabLayout.getTabAt(5).setIcon(R.drawable.ic_contacts_black_24dp);
        tabLayout.getTabAt(6).setIcon(R.drawable.ic_contacts_black_24dp);




    }
}
