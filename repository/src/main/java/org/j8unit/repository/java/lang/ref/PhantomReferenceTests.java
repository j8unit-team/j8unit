package org.j8unit.repository.java.lang.ref;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.ref.PhantomReference class java.lang.ref.PhantomReference}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.ref.PhantomReferenceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PhantomReferenceTests<SUT extends java.lang.ref.PhantomReference<T>, T>
extends org.j8unit.repository.java.lang.ref.ReferenceTests<SUT, T> {

    /**
     * <p>
     * Test method for {@link java.lang.ref.PhantomReference#get() public java.lang.Object
     * java.lang.ref.PhantomReference.get()}.
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
