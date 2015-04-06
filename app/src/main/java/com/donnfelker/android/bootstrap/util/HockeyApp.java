package com.donnfelker.android.bootstrap.util;

import android.app.Activity;
import android.content.Context;

import com.donnfelker.android.bootstrap.core.Constants;

import net.hockeyapp.android.CrashManager;
import net.hockeyapp.android.CrashManagerListener;

public class HockeyApp {

    public static void initialize(final Context context) {
        CrashManager.initialize(context, Constants.HOCKEYAPP_ID, new CrashManagerListener() {
            @Override
            public boolean shouldAutoUploadCrashes() {
                return HockeyApp.shouldAutoUploadCrashes(context);
            }
        });
    }

    public static void checkForCrashes(final Activity activity) {
        CrashManager.execute(activity, new CrashManagerListener() {
            public boolean shouldAutoUploadCrashes() {
                return HockeyApp.shouldAutoUploadCrashes(activity);
            }
        });
    }

    public static boolean shouldAutoUploadCrashes(Context context) {
        // if currently debugging, then don't auto-upload crashes.  prompt the developer.
        if (Utils.isDebuggable(context)) {
            return false;
        }

        // otherwise, this is a user.  auto-upload, and don't prompt them.
        return true;
    }
}
