package com.example.administrator.materialbar;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class DrawerLayouts extends AppCompatActivity {
    //侧滑菜单导航按钮
    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layouts);
        //自定义bar
        Toolbar toolbar= (Toolbar) findViewById(R.id.toobar);
        setSupportActionBar(toolbar);

        //侧滑菜单导航按钮  自动显示在标题栏的左边
        mDrawerLayout= (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            //让导航按钮显示
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            //系统给的固定 id : android.R.id.home
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;


        }

        return true;
    }
}
