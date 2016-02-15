package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.PointerInfo class java.awt.PointerInfo}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link PointerInfoClassTests}.
 * </p>
 *
 * @see java.awt.PointerInfo class java.awt.PointerInfo (the hereby targeted class-under-test class)
 * @see PointerInfoClassTests PointerInfoClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PointerInfoTests<SUT extends java.awt.PointerInfo>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.PointerInfo#getDevice() public java.awt.GraphicsDevice
     * java.awt.PointerInfo.getDevice()}.
     *
     * <p>
     * Test method for {@link java.awt.PointerInfo#getDevice() public java.awt.GraphicsDevice
     * java.awt.PointerInfo.getDevice()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.PointerInfo#getDevice() public java.awt.GraphicsDevice java.awt.PointerInfo.getDevice() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDevice()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.PointerInfo#getLocation() public java.awt.Point
     * java.awt.PointerInfo.getLocation()}.
     *
     * <p>
     * Test method for {@link java.awt.PointerInfo#getLocation() public java.awt.Point
     * java.awt.PointerInfo.getLocation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.PointerInfo#getLocation() public java.awt.Point java.awt.PointerInfo.getLocation() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
