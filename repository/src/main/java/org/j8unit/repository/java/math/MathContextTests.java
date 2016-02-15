package org.j8unit.repository.java.math;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.math.MathContext class java.math.MathContext}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link MathContextClassTests}.
 * </p>
 *
 * @see java.math.MathContext class java.math.MathContext (the hereby targeted class-under-test class)
 * @see MathContextClassTests MathContextClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MathContextTests<SUT extends java.math.MathContext>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.math.MathContext#hashCode() public int java.math.MathContext.hashCode()}.
     *
     * <p>
     * Test method for {@link java.math.MathContext#hashCode() public int java.math.MathContext.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.math.MathContext#hashCode() public int java.math.MathContext.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.math.MathContext#equals(Object) public boolean
     * java.math.MathContext.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.math.MathContext#equals(Object) public boolean
     * java.math.MathContext.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.math.MathContext#equals(Object) public boolean java.math.MathContext.equals(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.math.MathContext#getRoundingMode() public java.math.RoundingMode
     * java.math.MathContext.getRoundingMode()}.
     *
     * <p>
     * Test method for {@link java.math.MathContext#getRoundingMode() public java.math.RoundingMode
     * java.math.MathContext.getRoundingMode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.math.MathContext#getRoundingMode() public java.math.RoundingMode
     *      java.math.MathContext.getRoundingMode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRoundingMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.math.MathContext#getPrecision() public int java.math.MathContext.getPrecision()}.
     *
     * <p>
     * Test method for {@link java.math.MathContext#getPrecision() public int java.math.MathContext.getPrecision()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.math.MathContext#getPrecision() public int java.math.MathContext.getPrecision() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrecision()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.math.MathContext#toString() public java.lang.String java.math.MathContext.toString()}
     * .
     *
     * <p>
     * Test method for {@link java.math.MathContext#toString() public java.lang.String java.math.MathContext.toString()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.math.MathContext#toString() public java.lang.String java.math.MathContext.toString() (the hereby
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

}
