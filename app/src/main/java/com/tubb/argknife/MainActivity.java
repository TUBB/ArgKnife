package com.tubb.argknife;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.tubb.argknife.annotation.FragmentArgs;
import com.tubb.argknife.annotation.FrgmtArg;

public class MainActivity extends AppCompatActivity {

    int dd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new MyFragmentBuilder(49).build();
        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).commit();

        Fragment fragment2 = new OuterFragmentBuilder("uuuu").build();
        getSupportFragmentManager().beginTransaction().add(R.id.container2, fragment2).commit();

    }

    public static class MyFragment extends Fragment{

        @FrgmtArg
        int dis;

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            FragmentArgs.inject(this);
            Log.e("arg", "dis:"+dis+MyFragment.class.getName());
        }
    }
}
