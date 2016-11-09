package org.j8unit.repository.java.awt;

import java.awt.DefaultFocusTraversalPolicy;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultFocusTraversalPolicy} (by simply
 * reusing the J8Unit test interface {@link DefaultFocusTraversalPolicyClassTests}).
 */

@RunWith(J8Unit4.class)
public class DefaultFocusTraversalPolicyClassTest
implements DefaultFocusTraversalPolicyClassTests<DefaultFocusTraversalPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.DefaultFocusTraversalPolicy]

    @Override
    public Class<DefaultFocusTraversalPolicy> createNewSUT() {
        return DefaultFocusTraversalPolicy.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.DefaultFocusTraversalPolicy#DefaultFocusTraversalPolicy() public
     * java.awt.DefaultFocusTraversalPolicy()}.
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
    public void create_DefaultFocusTraversalPolicy()
    throws Exception {
        // create new instance
        final DefaultFocusTraversalPolicy sut = new DefaultFocusTraversalPolicy();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.DefaultFocusTraversalPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.DefaultFocusTraversalPolicy]

}
