package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.ImageCapabilities class java.awt.ImageCapabilities}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ImageCapabilitiesClassTests}.
 * </p>
 *
 * @see java.awt.ImageCapabilities class java.awt.ImageCapabilities (the hereby targeted class-under-test class)
 * @see ImageCapabilitiesClassTests ImageCapabilitiesClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ImageCapabilitiesTests<SUT extends java.awt.ImageCapabilities>
extends org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.ImageCapabilities#clone() public java.lang.Object
     * java.awt.ImageCapabilities.clone()}.
     *
     * <p>
     * Test method for {@link java.awt.ImageCapabilities#clone() public java.lang.Object
     * java.awt.ImageCapabilities.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.ImageCapabilities#clone() public java.lang.Object java.awt.ImageCapabilities.clone() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.ImageCapabilities#isAccelerated() public boolean
     * java.awt.ImageCapabilities.isAccelerated()}.
     *
     * <p>
     * Test method for {@link java.awt.ImageCapabilities#isAccelerated() public boolean
     * java.awt.ImageCapabilities.isAccelerated()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.ImageCapabilities#isAccelerated() public boolean java.awt.ImageCapabilities.isAccelerated() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAccelerated()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.ImageCapabilities#isTrueVolatile() public boolean
     * java.awt.ImageCapabilities.isTrueVolatile()}.
     *
     * <p>
     * Test method for {@link java.awt.ImageCapabilities#isTrueVolatile() public boolean
     * java.awt.ImageCapabilities.isTrueVolatile()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.ImageCapabilities#isTrueVolatile() public boolean java.awt.ImageCapabilities.isTrueVolatile() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isTrueVolatile()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
