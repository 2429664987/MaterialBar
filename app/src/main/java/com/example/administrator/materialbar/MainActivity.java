package com.example.administrator.materialbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //自定义bar
        Toolbar toolbar= (Toolbar) findViewById(R.id.toobar);
        setSupportActionBar(toolbar);
        //加载控价
        init();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //上面的Bar已经被顶替
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.backup:
                Toast.makeText(this, "返回", Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                Toast.makeText(this, "删除成功", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(this, "设置", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    public void init(){
        but1= (Button) findViewById(R.id.but1);

        but1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.but1:
                Intent intent=new Intent(MainActivity.this,DrawerLayouts.class);
                startActivity(intent);
                break;

        }
    }
}
