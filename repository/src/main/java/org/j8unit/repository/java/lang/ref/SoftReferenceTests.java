package org.j8unit.repository.java.lang.ref;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.ref.SoftReference class java.lang.ref.SoftReference}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SoftReferenceClassTests}.
 * </p>
 *
 * @see java.lang.ref.SoftReference class java.lang.ref.SoftReference (the hereby targeted class-under-test class)
 * @see SoftReferenceClassTests SoftReferenceClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SoftReferenceTests<SUT extends java.lang.ref.SoftReference<T>, T>
extends ReferenceTests<SUT, T> {

    /**
     * <p>
     * Test method for {@link java.lang.ref.SoftReference#get() public T java.lang.ref.SoftReference.get()}.
     *
     * <p>
     * Test method for {@link java.lang.ref.SoftReference#get() public java.lang.Object
     * java.lang.ref.SoftReference.get()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.ref.SoftReference#get() public java.lang.Object java.lang.ref.SoftReference.get() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_get()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
