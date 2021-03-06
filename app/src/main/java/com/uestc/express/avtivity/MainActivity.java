package com.uestc.express.avtivity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.uestc.express.R;
import com.uestc.express.avtivity.customer.CustomerHomeActivity;
import com.uestc.express.avtivity.express.ExpressHomeActivity;

public class MainActivity extends BaseActivity {

    static void startActivity(Activity activity) {
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);
    }

    LinearLayout customer;
    LinearLayout express;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);

        initView();

    }

    private void initView() {
        customer = (LinearLayout) findViewById(R.id.customer);
        express = (LinearLayout) findViewById(R.id.express);

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomerHomeActivity.startActivity(MainActivity.this);
            }
        });

        express.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExpressHomeActivity.startActivity(MainActivity.this);
            }
        });

    }

}
