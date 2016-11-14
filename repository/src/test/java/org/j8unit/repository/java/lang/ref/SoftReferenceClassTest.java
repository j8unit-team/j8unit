package org.j8unit.repository.java.lang.ref;

import java.lang.ref.SoftReference;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SoftReference} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.ref.SoftReferenceClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SoftReferenceClassTest
implements SoftReferenceClassTests<SoftReference> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ref.SoftReference]

    @Override
    public Class<SoftReference> createNewSUT() {
        return SoftReference.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.ref.SoftReference#SoftReference(Object) public java.lang.ref.SoftReference(T)}.
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
    public void create_SoftReference_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SoftReference sut = null; // = new SoftReference(Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.ref.SoftReference#SoftReference(Object, java.lang.ref.ReferenceQueue) public
     * java.lang.ref.SoftReference(T,java.lang.ref.ReferenceQueue<? super T>)}.
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
    public void create_SoftReference_Object_ReferenceQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SoftReference sut = null; // = new SoftReference(Object, java.lang.ref.ReferenceQueue);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.ref.SoftReference]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ref.SoftReference]

}
