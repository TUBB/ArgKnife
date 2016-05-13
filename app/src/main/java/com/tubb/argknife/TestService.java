package com.tubb.argknife;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by tubingbing on 16/5/4.
 */
public class TestService extends Service{

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new TestBinder();
    }

    class TestBinder extends Binder{

    }
}
