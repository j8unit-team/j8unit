package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleStateSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleStateSetClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleStateSetClassTests<AccessibleStateSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleStateSet]

    @Override
    public Class<AccessibleStateSet> createNewSUT() {
        return AccessibleStateSet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.accessibility.AccessibleStateSet#AccessibleStateSet() public
     * javax.accessibility.AccessibleStateSet()}.
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
    public void create_AccessibleStateSet()
    throws Exception {
        // create new instance
        final AccessibleStateSet sut = new AccessibleStateSet();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.accessibility.AccessibleStateSet#AccessibleStateSet(javax.accessibility.AccessibleState[]) public
     * javax.accessibility.AccessibleStateSet(javax.accessibility.AccessibleState[])}.
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
    public void create_AccessibleStateSet_AccessibleStateArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessibleStateSet sut = null; // = new AccessibleStateSet(javax.accessibility.AccessibleState[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleStateSet]

}
