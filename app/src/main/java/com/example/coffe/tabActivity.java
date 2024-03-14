package com.example.coffe;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.example.coffe.ui.main.SectionsPagerAdapter;
import com.example.coffe.databinding.ActivityTabBinding;

public class tabActivity extends MainActivity{

    private ActivityTabBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTabBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        tabs.getSelectedTabPosition();
        tabs.getTabAt(0).setIcon(R.drawable.officonic1);
        tabs.getTabAt(1).setIcon(R.drawable.officonic2);
        tabs.getTabAt(2).setIcon(R.drawable.officonic3);
        tabs.getTabAt(3).setIcon(R.drawable.officonic4);
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    tab.setIcon(R.drawable.oniconic1);
                } else if(tab.getPosition() == 1){
                    tab.setIcon(R.drawable.oniconic2);
                }else if(tab.getPosition() == 2){
                    tab.setIcon(R.drawable.oniconic3);
                }else if(tab.getPosition() == 3){
                    tab.setIcon(R.drawable.oniconic4);
                }
            }
            public void onTabUnselected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    tab.setIcon(R.drawable.officonic1);
                } else if(tab.getPosition() == 1){
                    tab.setIcon(R.drawable.officonic2);
                }else if(tab.getPosition() == 1){
                    tab.setIcon(R.drawable.officonic3);
                }else if(tab.getPosition() == 1){
                    tab.setIcon(R.drawable.officonic4);
                }
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    tab.setIcon(R.drawable.oniconic1);
                } else if(tab.getPosition() == 1){
                    tab.setIcon(R.drawable.oniconic2);
                }else if(tab.getPosition() == 2){
                    tab.setIcon(R.drawable.oniconic3);
                }else if(tab.getPosition() == 3){
                    tab.setIcon(R.drawable.oniconic4);
                }
            }
        });
    }
}