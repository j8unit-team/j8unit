package org.j8unit.repository.javax.swing;

import javax.swing.LayoutFocusTraversalPolicy;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LayoutFocusTraversalPolicy} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.LayoutFocusTraversalPolicyClassTests}).
 */
@RunWith(J8Unit4.class)
public class LayoutFocusTraversalPolicyClassTest
implements LayoutFocusTraversalPolicyClassTests<LayoutFocusTraversalPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.LayoutFocusTraversalPolicy]

    @Override
    public Class<LayoutFocusTraversalPolicy> createNewSUT() {
        return LayoutFocusTraversalPolicy.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.LayoutFocusTraversalPolicy#LayoutFocusTraversalPolicy() public
     * javax.swing.LayoutFocusTraversalPolicy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_LayoutFocusTraversalPolicy()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LayoutFocusTraversalPolicy sut = new LayoutFocusTraversalPolicy();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.LayoutFocusTraversalPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.LayoutFocusTraversalPolicy]

}
