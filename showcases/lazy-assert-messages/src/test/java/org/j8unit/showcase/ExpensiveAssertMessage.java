package org.j8unit.showcase;
import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;
import static org.j8unit.Assert.assertNotNull;
import org.junit.Test;

public class ExpensiveAssertMessage {

    /**
     * This is an example method simulating an expensive failure message calculation.
     *
     * Examples are:
     * <ol>
     * <li>calculate string representation of long array,</li>
     * <li>calculate string representation of deeply nested object,</li>
     * <li>query message from remote database,</li>
     * <li>...</li>
     * </ul>
     */
    private static String someExpensiveFailureMessageCreation() {
        System.err.println("This message proofs the execution of the expensive failure message creation.");
        try {
            // Here, the expense is simulated by {@link Thread#sleep(long)}
            sleep(3000);
        } catch (final InterruptedException e) {}
        return "The is the failure message";
    }

    @Test
    public void someTestWithUnnecessaryFailureMessageCreation()
    throws Exception {
        System.out.println("This example test will use a failure message that takes some time to be created.");

        final Object actual = new Object();
        final long begin = currentTimeMillis();
        assertNotNull(someExpensiveFailureMessageCreation(), actual);
        final long end = currentTimeMillis();

        System.out.format("In summary, the test took %d milliseconds, even though the expensive failure message creation was unneccesary!%n", end - begin);
    }

    @Test
    public void someTestWithoutUnnecessaryFailureMessageCreation()
    throws Exception {
        System.out.println("This example test will use a failure message that is computed on-demand only.");

        final Object actual = new Object();
        final long begin = currentTimeMillis();
        assertNotNull(() -> someExpensiveFailureMessageCreation(), actual);
        final long end = currentTimeMillis();

        System.out.format("In summary, the test took %d milliseconds only!%n", end - begin);
    }

}
