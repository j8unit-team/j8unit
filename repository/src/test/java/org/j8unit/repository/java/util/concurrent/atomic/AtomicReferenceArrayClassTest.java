package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AtomicReferenceArray} (by simply reusing
 * the J8Unit test interface {@link AtomicReferenceArrayClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AtomicReferenceArrayClassTest
implements AtomicReferenceArrayClassTests<AtomicReferenceArray> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.atomic.AtomicReferenceArray]

    @Override
    public Class<AtomicReferenceArray> createNewSUT() {
        return AtomicReferenceArray.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.atomic.AtomicReferenceArray#AtomicReferenceArray(Object[]) public
     * java.util.concurrent.atomic.AtomicReferenceArray(E[])}.
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
    public void create_AtomicReferenceArray_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AtomicReferenceArray sut = null; // = new AtomicReferenceArray(Object[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.atomic.AtomicReferenceArray#AtomicReferenceArray(int) public
     * java.util.concurrent.atomic.AtomicReferenceArray(int)}.
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
    public void create_AtomicReferenceArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AtomicReferenceArray sut = null; // = new AtomicReferenceArray(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.atomic.AtomicReferenceArray]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.atomic.AtomicReferenceArray]

}
