package org.j8unit.repository.java.lang.ref;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.ref.SoftReference class java.lang.ref.SoftReference}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.ref.SoftReferenceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SoftReferenceTests<SUT extends java.lang.ref.SoftReference<T>, T>
extends org.j8unit.repository.java.lang.ref.ReferenceTests<SUT, T> {

    /**
     * <p>
     * Test method for {@link java.lang.ref.SoftReference#get() public java.lang.Object
     * java.lang.ref.SoftReference.get()}.
     * </p>
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
