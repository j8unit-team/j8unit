package org.j8unit.repository.javax.swing;

import static org.junit.Assert.fail;
import javax.swing.SwingWorker;
import javax.swing.SwingWorker.StateValue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SwingWorkerClassTest
implements org.j8unit.repository.javax.swing.SwingWorkerClassTests<SwingWorker> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.SwingWorker]

    @Override
    public Class<SwingWorker> createNewSUT() {
        return SwingWorker.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SwingWorker#SwingWorker() public
     * javax.swing.SwingWorker()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_SwingWorker()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.SwingWorker]

    @RunWith(J8Unit4.class)
    public static class StateValueClassTest
    implements org.j8unit.repository.javax.swing.SwingWorkerClassTests.StateValueClassTests<StateValue> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.SwingWorker$StateValue]

        @Override
        public Class<StateValue> createNewSUT() {
            return StateValue.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link StateValue#valueOf(String) public static
         * javax.swing.SwingWorker$StateValue javax.swing.SwingWorker$StateValue.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link StateValue#valueOf(String)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link StateValue#values() public static
         * javax.swing.SwingWorker$StateValue[] javax.swing.SwingWorker$StateValue.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_values()
        throws Exception {
            // write some test for {@link StateValue#values()}
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.SwingWorker$StateValue]

    }

}
