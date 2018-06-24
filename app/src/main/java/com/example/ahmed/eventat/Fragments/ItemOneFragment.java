package com.example.ahmed.eventat.Fragments;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.support.v4.app.Fragment;

import com.example.ahmed.eventat.R;

import java.util.ArrayList;

public class ItemOneFragment extends Fragment implements NavigationView.OnNavigationItemSelectedListener{

    private static ViewPager mPager;
    DrawerLayout drawer;

    private static int currentPage = 0;
    private static final Integer[] XMEN= {R.drawable.slideone,R.drawable.slidetwo,R.drawable.slidethree};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();
    public static ItemOneFragment newInstance() {
        ItemOneFragment fragment = new ItemOneFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.category, container, false);
       ;

        drawer = (DrawerLayout) view.findViewById(R.id.drawer_layout);

        // drawer navigation

        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) view.findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                getActivity(), drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) view.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        // arabic


        ViewCompat.setLayoutDirection(view.findViewById(R.id.drawer_layout),ViewCompat.LAYOUT_DIRECTION_RTL);
        ViewCompat.setLayoutDirection(view.findViewById(R.id.toolbar),ViewCompat.LAYOUT_DIRECTION_RTL);


        return view;


    }



    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.activity_main_drawer, menu);
        super.onCreateOptionsMenu(menu,inflater);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage3) {

        } else if (id == R.id.nav_manage2) {

        } else if (id == R.id.nav_manage4) {

        } else if (id == R.id.nav_manage5) {

        }




        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    }
