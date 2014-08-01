package com.donnfelker.android.bootstrap.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

public class Utils {

    public static boolean isDebuggable(Context context) {
        boolean debuggable = false;

        PackageManager pm = context.getPackageManager();

        try {
            ApplicationInfo appinfo = pm.getApplicationInfo(context.getPackageName(), 0);
            debuggable = ((appinfo.flags &= ApplicationInfo.FLAG_DEBUGGABLE) != 0);
        } catch(PackageManager.NameNotFoundException e) {
            // do nothing
        }

        return debuggable;
    }
}
