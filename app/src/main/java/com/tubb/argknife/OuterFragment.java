package com.tubb.argknife;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.tubb.argknife.annotation.FragmentArgs;
import com.tubb.argknife.annotation.FrgmtArg;

/**
 * Created by tubingbing on 16/5/6.
 */
public class OuterFragment extends BaseFragment{

    @FrgmtArg
    String name;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentArgs.inject(this);
        Log.e("arg", "name:"+name);
    }
}
