package com.donnfelker.android.bootstrap.core.core;

import com.donnfelker.android.bootstrap.BootstrapApplication;
import com.donnfelker.android.bootstrap.Injector;

public class TestBootstrapApplication extends BootstrapApplication {

    public static <T> void injectMocks(T object) {
        Injector.init(new TestModule(), object);
    }

    @Override
    protected Object getRootModule() {
        return new TestModule();
    }
}