package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReference;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AtomicReferenceClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicReferenceClassTests<AtomicReference> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.atomic.AtomicReference]

    @Override
    public Class<AtomicReference> createNewSUT() {
        return AtomicReference.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.atomic.AtomicReference#AtomicReference(Object) public
     * java.util.concurrent.atomic.AtomicReference(V)}.
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
    public void create_AtomicReference_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AtomicReference sut = null; // = new AtomicReference(Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.atomic.AtomicReference#AtomicReference() public
     * java.util.concurrent.atomic.AtomicReference()}.
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
    public void create_AtomicReference()
    throws Exception {
        // create new instance
        final AtomicReference sut = new AtomicReference();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.atomic.AtomicReference]

}
