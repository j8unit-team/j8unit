package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.fail;
import javax.swing.text.FlowView;
import javax.swing.text.FlowView.FlowStrategy;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FlowView} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.FlowViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class FlowViewClassTest
implements FlowViewClassTests<FlowView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.FlowView]

    @Override
    public Class<FlowView> createNewSUT() {
        return FlowView.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.FlowView#FlowView(javax.swing.text.Element, int) public
     * javax.swing.text.FlowView(javax.swing.text.Element,int)}.
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
    public void create_FlowView_Element_int()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.FlowView]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.FlowView]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FlowStrategy} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.FlowViewClassTests.FlowStrategyClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FlowStrategyClassTest
    implements FlowStrategyClassTests<FlowStrategy> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.FlowView$FlowStrategy]

        @Override
        public Class<FlowStrategy> createNewSUT() {
            return FlowStrategy.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.FlowView.FlowStrategy#FlowStrategy() public
         * javax.swing.text.FlowView$FlowStrategy()}.
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
        public void create_FlowStrategy()
        throws Exception {
            // create new instance
            final FlowStrategy sut = new FlowStrategy();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.FlowView$FlowStrategy]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.FlowView$FlowStrategy]

    }

}
