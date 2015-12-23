package org.j8unit.repository.java.lang.ref;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.ref.PhantomReference class java.lang.ref.PhantomReference},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.ref.PhantomReferenceTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.ref.PhantomReferenceClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.ref.PhantomReference
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PhantomReferenceTests<SUT extends java.lang.ref.PhantomReference<T>, T>
extends org.j8unit.repository.java.lang.ref.ReferenceTests<SUT, T> {

    /**
     * <p>
     * Test method for {@link java.lang.ref.PhantomReference#get() public java.lang.Object
     * java.lang.ref.PhantomReference.get()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.ref.PhantomReference#get()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_get()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
