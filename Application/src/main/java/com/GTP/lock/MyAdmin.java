package com.GTP.lock;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;

public class MyAdmin extends DeviceAdminReceiver {

    @Override
    public void onEnabled(Context contect, Intent intent) {super.onEnabled(contect,intent);}
}
