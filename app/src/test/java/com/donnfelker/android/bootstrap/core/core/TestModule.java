package com.donnfelker.android.bootstrap.core.core;

import com.donnfelker.android.bootstrap.RootModule;
import com.donnfelker.android.bootstrap.core.BootstrapService;
import com.donnfelker.android.bootstrap.core.core.activity.BootstrapAuthenticatorActivityTest;
import dagger.Module;
import dagger.Provides;
import org.mockito.Mockito;
import retrofit.RestAdapter;

import javax.inject.Singleton;

@Module(
        includes = RootModule.class,
        injects = {
                TestBootstrapApplication.class,
                BootstrapAuthenticatorActivityTest.class
        },
        overrides = true
)
public class TestModule {

    @Singleton
    @Provides
    BootstrapService provideBootstrapService(RestAdapter restAdapter) {
        return Mockito.mock(BootstrapService.class);
    }

}