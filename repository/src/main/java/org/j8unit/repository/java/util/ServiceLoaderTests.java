package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.ServiceLoader class java.util.ServiceLoader}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ServiceLoaderClassTests}.
 * </p>
 *
 * @see java.util.ServiceLoader class java.util.ServiceLoader (the hereby targeted class-under-test class)
 * @see ServiceLoaderClassTests ServiceLoaderClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServiceLoaderTests<SUT extends java.util.ServiceLoader<S>, S>
extends org.j8unit.repository.java.lang.IterableTests<SUT, S>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.ServiceLoader#toString() public java.lang.String
     * java.util.ServiceLoader.toString()}.
     *
     * <p>
     * Test method for {@link java.util.ServiceLoader#toString() public java.lang.String
     * java.util.ServiceLoader.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ServiceLoader#toString() public java.lang.String java.util.ServiceLoader.toString() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ServiceLoader#iterator() public java.util.Iterator
     * <S> java.util.ServiceLoader.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.ServiceLoader#iterator() public java.util.Iterator
     * java.util.ServiceLoader.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ServiceLoader#iterator() public java.util.Iterator java.util.ServiceLoader.iterator() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_iterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ServiceLoader#reload() public void java.util.ServiceLoader.reload()}.
     *
     * <p>
     * Test method for {@link java.util.ServiceLoader#reload() public void java.util.ServiceLoader.reload()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ServiceLoader#reload() public void java.util.ServiceLoader.reload() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reload()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
