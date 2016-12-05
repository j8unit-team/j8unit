package org.j8unit.repository.java.lang;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.holdsLock;
import static java.lang.Thread.sleep;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * @since 1.0.1
 */
public class ObjectBugs {

    /**
     * According to the API description of {@link Object#wait(long, int)}, an {@link IllegalArgumentException} will be
     * thrown if the value of {@code timeout} (the number of milliseconds) is negative or the value of {@code nanos}
     * (the number of nanoseconds) is not in the range {@code 0}&ndash;{@code 999999}.
     *
     * This tests uses {@link Long#MAX_VALUE} as the number of milliseconds and {@code 1} as the number of nanoseconds.
     * Obviously, the milliseconds value is a positive number and the nanoseconds value is in the range
     * {@code 0}&ndash;{@code 999999}. But even in this valid scenario, an {@link IllegalArgumentException} will be
     * thrown.
     */
    @Test(expected = IllegalArgumentException.class /* because there is a bug! */)
    public void waitMaxMillisecondsAndOneNanosecond()
    throws Exception {
        final Object dummy = new Object();
        final Thread thisThread = currentThread();
        final Runnable wakeMeUp = () -> {
            try {
                sleep(100);
            } catch (final InterruptedException any) {}
            thisThread.interrupt();
        };
        assert !holdsLock(dummy);
        synchronized (dummy) {
            assert holdsLock(dummy);
            new Thread(wakeMeUp).start();
            try {
                dummy.wait(Long.MAX_VALUE, 1);
            } catch (final InterruptedException interrupted) {
                // would be interrupted after 100ms -- if there wheren't a bug that causes an abort previously
            }
            fail("Bug has been removed, if this position is reached.");
        }
    }

}
