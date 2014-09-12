package com.donnfelker.android.bootstrap.core.core;

import com.donnfelker.android.bootstrap.util.Ln;
import org.robolectric.Robolectric;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by josephkreiser on 9/5/14.
 */
public class TestUtils {

    public static void runUiThreadTasksAndWaitForBooleanToBeSet(
            AtomicBoolean booleanToWatch,
            boolean desiredValue,
            int timeoutMillis) {

        for (
                final long startTime = System.currentTimeMillis();
                (booleanToWatch.get() != desiredValue) && (System.currentTimeMillis() - startTime < timeoutMillis);
                /* no increments */) {

            Robolectric.runUiThreadTasksIncludingDelayedTasks();

            try {
                Thread.sleep(1); // yield the scheduler so this busy loop isn't nasty.
            } catch (InterruptedException e) {
                Ln.e(e, "Thread.sleep() failed");
            }
        }
    }
}
