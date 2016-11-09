package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleRelationSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleRelationSet} (by simply reusing
 * the J8Unit test interface {@link AccessibleRelationSetClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleRelationSetClassTest
implements AccessibleRelationSetClassTests<AccessibleRelationSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleRelationSet]

    @Override
    public Class<AccessibleRelationSet> createNewSUT() {
        return AccessibleRelationSet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.accessibility.AccessibleRelationSet#AccessibleRelationSet() public
     * javax.accessibility.AccessibleRelationSet()}.
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
    public void create_AccessibleRelationSet()
    throws Exception {
        // create new instance
        final AccessibleRelationSet sut = new AccessibleRelationSet();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.accessibility.AccessibleRelationSet#AccessibleRelationSet(javax.accessibility.AccessibleRelation[])
     * public javax.accessibility.AccessibleRelationSet(javax.accessibility.AccessibleRelation[])}.
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
    public void create_AccessibleRelationSet_AccessibleRelationArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessibleRelationSet sut = null; // = new
                                                // AccessibleRelationSet(javax.accessibility.AccessibleRelation[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleRelationSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleRelationSet]

}
