package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicStampedReference;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AtomicStampedReferenceClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicStampedReferenceClassTests<AtomicStampedReference> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.atomic.AtomicStampedReference]

    @Override
    public Class<AtomicStampedReference> createNewSUT() {
        return AtomicStampedReference.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.atomic.AtomicStampedReference#AtomicStampedReference(Object, int) public
     * java.util.concurrent.atomic.AtomicStampedReference(V,int)}.
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
    public void create_AtomicStampedReference_Object_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AtomicStampedReference sut = null; // = new AtomicStampedReference(Object, int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.atomic.AtomicStampedReference]

}
