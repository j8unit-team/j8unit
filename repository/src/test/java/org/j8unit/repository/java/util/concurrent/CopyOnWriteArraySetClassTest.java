package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CopyOnWriteArraySet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CopyOnWriteArraySet} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.CopyOnWriteArraySetClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CopyOnWriteArraySetClassTest
implements CopyOnWriteArraySetClassTests<CopyOnWriteArraySet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.CopyOnWriteArraySet]

    @Override
    public Class<CopyOnWriteArraySet> createNewSUT() {
        return CopyOnWriteArraySet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.CopyOnWriteArraySet#CopyOnWriteArraySet() public
     * java.util.concurrent.CopyOnWriteArraySet()}.
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
    public void create_CopyOnWriteArraySet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CopyOnWriteArraySet sut = new CopyOnWriteArraySet();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.CopyOnWriteArraySet#CopyOnWriteArraySet(java.util.Collection) public
     * java.util.concurrent.CopyOnWriteArraySet(java.util.Collection<? extends E>)}.
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
    public void create_CopyOnWriteArraySet_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CopyOnWriteArraySet sut = null; // = new CopyOnWriteArraySet(java.util.Collection);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.CopyOnWriteArraySet]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.CopyOnWriteArraySet]

}
