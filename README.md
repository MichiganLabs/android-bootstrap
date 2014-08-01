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
