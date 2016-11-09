package org.j8unit.repository.javax.swing;

import javax.swing.SortingFocusTraversalPolicy;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SortingFocusTraversalPolicy} (by simply
 * reusing the J8Unit test interface {@link SortingFocusTraversalPolicyClassTests}).
 */

@RunWith(J8Unit4.class)
public class SortingFocusTraversalPolicyClassTest
implements SortingFocusTraversalPolicyClassTests<SortingFocusTraversalPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.SortingFocusTraversalPolicy]

    @Override
    public Class<SortingFocusTraversalPolicy> createNewSUT() {
        return SortingFocusTraversalPolicy.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.SortingFocusTraversalPolicy#SortingFocusTraversalPolicy(java.util.Comparator) public
     * javax.swing.SortingFocusTraversalPolicy(java.util.Comparator<? super java.awt.Component>)}.
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
    public void create_SortingFocusTraversalPolicy_Comparator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SortingFocusTraversalPolicy sut = null; // = new SortingFocusTraversalPolicy(java.util.Comparator);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.SortingFocusTraversalPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.SortingFocusTraversalPolicy]

}
