# UPDATE: 2014-11-18
Android Bootstrap is now API 15+ only. I will also be implementing RxJava, Material design and a few other things into this app as well.
There will be *no upgrade path* as Android Bootstrap is mean to act as a starting point for Android Applications.

# Android Bootstrap App

## Disabling Authentication

To disable authentication go to

.authenticator.ApiKeyProvider.getAuthKey()

comment out the contents, and return an empty String.


## New Activities

New Activity classes should extend BootstrapActivity or BootstrapFragmentActivity.


## Building

The build requires [Gradle](http://www.gradle.org/downloads)
v1.10+ and the [Android SDK](http://developer.android.com/sdk/index.html)
to be installed in your development environment. In addition you'll need to set
the `ANDROID_HOME` environment variable to the location of your SDK:

    export ANDROID_HOME=/path/to/your/android-sdk

After satisfying those requirements, the build is pretty simple:

* Run `gradlew` or `gradle assembleDebug` or `gradle assembleRelease` from the `app` directory to build the APK only
* Run one of the commands above from the root directory to build the app and also run
  the integration tests, this requires a connected Android device or running
  emulator.
