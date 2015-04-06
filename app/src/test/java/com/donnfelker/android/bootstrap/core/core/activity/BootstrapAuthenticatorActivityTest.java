package com.donnfelker.android.bootstrap.core.core.activity;

import android.app.Activity;
import butterknife.ButterKnife;
import com.donnfelker.android.bootstrap.authenticator.BootstrapAuthenticatorActivity;
import com.donnfelker.android.bootstrap.core.core.TestBootstrapApplication;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by josephkreiser on 8/27/14.
 */
@Config(
        emulateSdk = 18,
        qualifiers = "v10", // fixes error:  java.lang.ClassCastException: android.widget.LinearLayout$LayoutParams cannot be cast to com.android.internal.widget.ActionBarOverlayLayout$LayoutParams (https://github.com/robolectric/robolectric/issues/1016)
        manifest = "src/main/AndroidManifest.xml"
)
@RunWith(RobolectricTestRunner.class)
public class BootstrapAuthenticatorActivityTest {

    private Activity activity;

    @Before
    public void setup() {
        TestBootstrapApplication.injectMocks(this);

        activity = Robolectric.buildActivity(BootstrapAuthenticatorActivity.class).create().visible().get();

        ButterKnife.inject(this, activity);
    }

    @Test
    public void testThatActivityStartsSuccessfully() {
        Assert.assertNotNull(activity);
    }
}
