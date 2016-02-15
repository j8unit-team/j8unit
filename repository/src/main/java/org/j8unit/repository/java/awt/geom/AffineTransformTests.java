package org.j8unit.repository.java.awt.geom;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.geom.AffineTransform class java.awt.geom.AffineTransform}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link AffineTransformClassTests}.
 * </p>
 *
 * @see java.awt.geom.AffineTransform class java.awt.geom.AffineTransform (the hereby targeted class-under-test class)
 * @see AffineTransformClassTests AffineTransformClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AffineTransformTests<SUT extends java.awt.geom.AffineTransform>
extends org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#createInverse() public java.awt.geom.AffineTransform
     * java.awt.geom.AffineTransform.createInverse() throws java.awt.geom.NoninvertibleTransformException}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#createInverse() public java.awt.geom.AffineTransform
     * java.awt.geom.AffineTransform.createInverse() throws java.awt.geom.NoninvertibleTransformException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#createInverse() public java.awt.geom.AffineTransform
     *      java.awt.geom.AffineTransform.createInverse() throws java.awt.geom.NoninvertibleTransformException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createInverse()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#isIdentity() public boolean
     * java.awt.geom.AffineTransform.isIdentity()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#isIdentity() public boolean
     * java.awt.geom.AffineTransform.isIdentity()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#isIdentity() public boolean java.awt.geom.AffineTransform.isIdentity() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isIdentity()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#invert() public void java.awt.geom.AffineTransform.invert()
     * throws java.awt.geom.NoninvertibleTransformException}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#invert() public void java.awt.geom.AffineTransform.invert()
     * throws java.awt.geom.NoninvertibleTransformException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#invert() public void java.awt.geom.AffineTransform.invert() throws
     *      java.awt.geom.NoninvertibleTransformException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invert()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToTranslation(double, double) public void
     * java.awt.geom.AffineTransform.setToTranslation(double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToTranslation(double, double) public void
     * java.awt.geom.AffineTransform.setToTranslation(double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setToTranslation(double, double) public void
     *      java.awt.geom.AffineTransform.setToTranslation(double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setToTranslation_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getType() public int
     * java.awt.geom.AffineTransform.getType()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getType() public int
     * java.awt.geom.AffineTransform.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#getType() public int java.awt.geom.AffineTransform.getType() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getScaleY() public double
     * java.awt.geom.AffineTransform.getScaleY()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getScaleY() public double
     * java.awt.geom.AffineTransform.getScaleY()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#getScaleY() public double java.awt.geom.AffineTransform.getScaleY() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getScaleY()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getShearX() public double
     * java.awt.geom.AffineTransform.getShearX()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getShearX() public double
     * java.awt.geom.AffineTransform.getShearX()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#getShearX() public double java.awt.geom.AffineTransform.getShearX() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getShearX()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getScaleX() public double
     * java.awt.geom.AffineTransform.getScaleX()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getScaleX() public double
     * java.awt.geom.AffineTransform.getScaleX()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#getScaleX() public double java.awt.geom.AffineTransform.getScaleX() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getScaleX()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getShearY() public double
     * java.awt.geom.AffineTransform.getShearY()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getShearY() public double
     * java.awt.geom.AffineTransform.getShearY()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#getShearY() public double java.awt.geom.AffineTransform.getShearY() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getShearY()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#translate(double, double) public void
     * java.awt.geom.AffineTransform.translate(double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#translate(double, double) public void
     * java.awt.geom.AffineTransform.translate(double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#translate(double, double) public void
     *      java.awt.geom.AffineTransform.translate(double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_translate_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToQuadrantRotation(int, double, double) public void
     * java.awt.geom.AffineTransform.setToQuadrantRotation(int,double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToQuadrantRotation(int, double, double) public void
     * java.awt.geom.AffineTransform.setToQuadrantRotation(int,double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setToQuadrantRotation(int, double, double) public void
     *      java.awt.geom.AffineTransform.setToQuadrantRotation(int,double,double) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setToQuadrantRotation_int_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToQuadrantRotation(int) public void
     * java.awt.geom.AffineTransform.setToQuadrantRotation(int)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToQuadrantRotation(int) public void
     * java.awt.geom.AffineTransform.setToQuadrantRotation(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setToQuadrantRotation(int) public void
     *      java.awt.geom.AffineTransform.setToQuadrantRotation(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setToQuadrantRotation_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#preConcatenate(java.awt.geom.AffineTransform) public void
     * java.awt.geom.AffineTransform.preConcatenate(java.awt.geom.AffineTransform)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#preConcatenate(java.awt.geom.AffineTransform) public void
     * java.awt.geom.AffineTransform.preConcatenate(java.awt.geom.AffineTransform)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#preConcatenate(java.awt.geom.AffineTransform) public void
     *      java.awt.geom.AffineTransform.preConcatenate(java.awt.geom.AffineTransform) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_preConcatenate_AffineTransform()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#rotate(double, double, double, double) public void
     * java.awt.geom.AffineTransform.rotate(double,double,double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#rotate(double, double, double, double) public void
     * java.awt.geom.AffineTransform.rotate(double,double,double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#rotate(double, double, double, double) public void
     *      java.awt.geom.AffineTransform.rotate(double,double,double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rotate_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#rotate(double) public void
     * java.awt.geom.AffineTransform.rotate(double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#rotate(double) public void
     * java.awt.geom.AffineTransform.rotate(double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#rotate(double) public void java.awt.geom.AffineTransform.rotate(double) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rotate_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#rotate(double, double) public void
     * java.awt.geom.AffineTransform.rotate(double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#rotate(double, double) public void
     * java.awt.geom.AffineTransform.rotate(double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#rotate(double, double) public void
     *      java.awt.geom.AffineTransform.rotate(double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rotate_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#rotate(double, double, double) public void
     * java.awt.geom.AffineTransform.rotate(double,double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#rotate(double, double, double) public void
     * java.awt.geom.AffineTransform.rotate(double,double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#rotate(double, double, double) public void
     *      java.awt.geom.AffineTransform.rotate(double,double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rotate_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#concatenate(java.awt.geom.AffineTransform) public void
     * java.awt.geom.AffineTransform.concatenate(java.awt.geom.AffineTransform)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#concatenate(java.awt.geom.AffineTransform) public void
     * java.awt.geom.AffineTransform.concatenate(java.awt.geom.AffineTransform)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#concatenate(java.awt.geom.AffineTransform) public void
     *      java.awt.geom.AffineTransform.concatenate(java.awt.geom.AffineTransform) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_concatenate_AffineTransform()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getDeterminant() public double
     * java.awt.geom.AffineTransform.getDeterminant()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getDeterminant() public double
     * java.awt.geom.AffineTransform.getDeterminant()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#getDeterminant() public double java.awt.geom.AffineTransform.getDeterminant()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeterminant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#quadrantRotate(int, double, double) public void
     * java.awt.geom.AffineTransform.quadrantRotate(int,double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#quadrantRotate(int, double, double) public void
     * java.awt.geom.AffineTransform.quadrantRotate(int,double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#quadrantRotate(int, double, double) public void
     *      java.awt.geom.AffineTransform.quadrantRotate(int,double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_quadrantRotate_int_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#quadrantRotate(int) public void
     * java.awt.geom.AffineTransform.quadrantRotate(int)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#quadrantRotate(int) public void
     * java.awt.geom.AffineTransform.quadrantRotate(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#quadrantRotate(int) public void
     *      java.awt.geom.AffineTransform.quadrantRotate(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_quadrantRotate_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#inverseTransform(double[], int, double[], int, int) public
     * void java.awt.geom.AffineTransform.inverseTransform(double[],int,double[],int,int) throws
     * java.awt.geom.NoninvertibleTransformException}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#inverseTransform(double[], int, double[], int, int) public
     * void java.awt.geom.AffineTransform.inverseTransform(double[],int,double[],int,int) throws
     * java.awt.geom.NoninvertibleTransformException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#inverseTransform(double[], int, double[], int, int) public void
     *      java.awt.geom.AffineTransform.inverseTransform(double[],int,double[],int,int) throws
     *      java.awt.geom.NoninvertibleTransformException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_inverseTransform_doubleArray_int_doubleArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.geom.AffineTransform#inverseTransform(java.awt.geom.Point2D, java.awt.geom.Point2D) public
     * java.awt.geom.Point2D java.awt.geom.AffineTransform.inverseTransform(java.awt.geom.Point2D,java.awt.geom.Point2D)
     * throws java.awt.geom.NoninvertibleTransformException}.
     *
     * <p>
     * Test method for
     * {@link java.awt.geom.AffineTransform#inverseTransform(java.awt.geom.Point2D, java.awt.geom.Point2D) public
     * java.awt.geom.Point2D java.awt.geom.AffineTransform.inverseTransform(java.awt.geom.Point2D,java.awt.geom.Point2D)
     * throws java.awt.geom.NoninvertibleTransformException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#inverseTransform(java.awt.geom.Point2D, java.awt.geom.Point2D) public
     *      java.awt.geom.Point2D
     *      java.awt.geom.AffineTransform.inverseTransform(java.awt.geom.Point2D,java.awt.geom.Point2D) throws
     *      java.awt.geom.NoninvertibleTransformException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_inverseTransform_Point2D_Point2D()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getMatrix(double[]) public void
     * java.awt.geom.AffineTransform.getMatrix(double[])}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getMatrix(double[]) public void
     * java.awt.geom.AffineTransform.getMatrix(double[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#getMatrix(double[]) public void
     *      java.awt.geom.AffineTransform.getMatrix(double[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMatrix_doubleArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#createTransformedShape(java.awt.Shape) public java.awt.Shape
     * java.awt.geom.AffineTransform.createTransformedShape(java.awt.Shape)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#createTransformedShape(java.awt.Shape) public java.awt.Shape
     * java.awt.geom.AffineTransform.createTransformedShape(java.awt.Shape)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#createTransformedShape(java.awt.Shape) public java.awt.Shape
     *      java.awt.geom.AffineTransform.createTransformedShape(java.awt.Shape) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createTransformedShape_Shape()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#shear(double, double) public void
     * java.awt.geom.AffineTransform.shear(double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#shear(double, double) public void
     * java.awt.geom.AffineTransform.shear(double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#shear(double, double) public void
     *      java.awt.geom.AffineTransform.shear(double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_shear_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#deltaTransform(java.awt.geom.Point2D, java.awt.geom.Point2D)
     * public java.awt.geom.Point2D
     * java.awt.geom.AffineTransform.deltaTransform(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#deltaTransform(java.awt.geom.Point2D, java.awt.geom.Point2D)
     * public java.awt.geom.Point2D
     * java.awt.geom.AffineTransform.deltaTransform(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#deltaTransform(java.awt.geom.Point2D, java.awt.geom.Point2D) public
     *      java.awt.geom.Point2D
     *      java.awt.geom.AffineTransform.deltaTransform(java.awt.geom.Point2D,java.awt.geom.Point2D) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deltaTransform_Point2D_Point2D()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#deltaTransform(double[], int, double[], int, int) public
     * void java.awt.geom.AffineTransform.deltaTransform(double[],int,double[],int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#deltaTransform(double[], int, double[], int, int) public
     * void java.awt.geom.AffineTransform.deltaTransform(double[],int,double[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#deltaTransform(double[], int, double[], int, int) public void
     *      java.awt.geom.AffineTransform.deltaTransform(double[],int,double[],int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deltaTransform_doubleArray_int_doubleArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#clone() public java.lang.Object
     * java.awt.geom.AffineTransform.clone()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#clone() public java.lang.Object
     * java.awt.geom.AffineTransform.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#clone() public java.lang.Object java.awt.geom.AffineTransform.clone() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.awt.geom.AffineTransform#toString() public java.lang.String
     * java.awt.geom.AffineTransform.toString()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#toString() public java.lang.String
     * java.awt.geom.AffineTransform.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#toString() public java.lang.String java.awt.geom.AffineTransform.toString()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.awt.geom.AffineTransform#setToScale(double, double) public void
     * java.awt.geom.AffineTransform.setToScale(double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToScale(double, double) public void
     * java.awt.geom.AffineTransform.setToScale(double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setToScale(double, double) public void
     *      java.awt.geom.AffineTransform.setToScale(double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setToScale_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#equals(Object) public boolean
     * java.awt.geom.AffineTransform.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#equals(Object) public boolean
     * java.awt.geom.AffineTransform.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#equals(Object) public boolean
     *      java.awt.geom.AffineTransform.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.awt.geom.AffineTransform#scale(double, double) public void
     * java.awt.geom.AffineTransform.scale(double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#scale(double, double) public void
     * java.awt.geom.AffineTransform.scale(double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#scale(double, double) public void
     *      java.awt.geom.AffineTransform.scale(double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_scale_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToIdentity() public void
     * java.awt.geom.AffineTransform.setToIdentity()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToIdentity() public void
     * java.awt.geom.AffineTransform.setToIdentity()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setToIdentity() public void java.awt.geom.AffineTransform.setToIdentity() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setToIdentity()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getTranslateY() public double
     * java.awt.geom.AffineTransform.getTranslateY()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getTranslateY() public double
     * java.awt.geom.AffineTransform.getTranslateY()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#getTranslateY() public double java.awt.geom.AffineTransform.getTranslateY()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTranslateY()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getTranslateX() public double
     * java.awt.geom.AffineTransform.getTranslateX()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#getTranslateX() public double
     * java.awt.geom.AffineTransform.getTranslateX()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#getTranslateX() public double java.awt.geom.AffineTransform.getTranslateX()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTranslateX()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToShear(double, double) public void
     * java.awt.geom.AffineTransform.setToShear(double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToShear(double, double) public void
     * java.awt.geom.AffineTransform.setToShear(double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setToShear(double, double) public void
     *      java.awt.geom.AffineTransform.setToShear(double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setToShear_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setTransform(double, double, double, double, double, double)
     * public void java.awt.geom.AffineTransform.setTransform(double,double,double,double,double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setTransform(double, double, double, double, double, double)
     * public void java.awt.geom.AffineTransform.setTransform(double,double,double,double,double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setTransform(double, double, double, double, double, double) public void
     *      java.awt.geom.AffineTransform.setTransform(double,double,double,double,double,double) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTransform_double_double_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setTransform(java.awt.geom.AffineTransform) public void
     * java.awt.geom.AffineTransform.setTransform(java.awt.geom.AffineTransform)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setTransform(java.awt.geom.AffineTransform) public void
     * java.awt.geom.AffineTransform.setTransform(java.awt.geom.AffineTransform)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setTransform(java.awt.geom.AffineTransform) public void
     *      java.awt.geom.AffineTransform.setTransform(java.awt.geom.AffineTransform) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTransform_AffineTransform()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#hashCode() public int
     * java.awt.geom.AffineTransform.hashCode()}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#hashCode() public int
     * java.awt.geom.AffineTransform.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#hashCode() public int java.awt.geom.AffineTransform.hashCode() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.awt.geom.AffineTransform#setToRotation(double) public void
     * java.awt.geom.AffineTransform.setToRotation(double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToRotation(double) public void
     * java.awt.geom.AffineTransform.setToRotation(double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setToRotation(double) public void
     *      java.awt.geom.AffineTransform.setToRotation(double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setToRotation_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToRotation(double, double) public void
     * java.awt.geom.AffineTransform.setToRotation(double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToRotation(double, double) public void
     * java.awt.geom.AffineTransform.setToRotation(double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setToRotation(double, double) public void
     *      java.awt.geom.AffineTransform.setToRotation(double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setToRotation_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToRotation(double, double, double) public void
     * java.awt.geom.AffineTransform.setToRotation(double,double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToRotation(double, double, double) public void
     * java.awt.geom.AffineTransform.setToRotation(double,double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setToRotation(double, double, double) public void
     *      java.awt.geom.AffineTransform.setToRotation(double,double,double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setToRotation_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToRotation(double, double, double, double) public void
     * java.awt.geom.AffineTransform.setToRotation(double,double,double,double)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#setToRotation(double, double, double, double) public void
     * java.awt.geom.AffineTransform.setToRotation(double,double,double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#setToRotation(double, double, double, double) public void
     *      java.awt.geom.AffineTransform.setToRotation(double,double,double,double) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setToRotation_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#transform(double[], int, float[], int, int) public void
     * java.awt.geom.AffineTransform.transform(double[],int,float[],int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#transform(double[], int, float[], int, int) public void
     * java.awt.geom.AffineTransform.transform(double[],int,float[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#transform(double[], int, float[], int, int) public void
     *      java.awt.geom.AffineTransform.transform(double[],int,float[],int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_doubleArray_int_floatArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#transform(java.awt.geom.Point2D, java.awt.geom.Point2D)
     * public java.awt.geom.Point2D
     * java.awt.geom.AffineTransform.transform(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#transform(java.awt.geom.Point2D, java.awt.geom.Point2D)
     * public java.awt.geom.Point2D
     * java.awt.geom.AffineTransform.transform(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#transform(java.awt.geom.Point2D, java.awt.geom.Point2D) public
     *      java.awt.geom.Point2D java.awt.geom.AffineTransform.transform(java.awt.geom.Point2D,java.awt.geom.Point2D)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_Point2D_Point2D()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#transform(float[], int, double[], int, int) public void
     * java.awt.geom.AffineTransform.transform(float[],int,double[],int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#transform(float[], int, double[], int, int) public void
     * java.awt.geom.AffineTransform.transform(float[],int,double[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#transform(float[], int, double[], int, int) public void
     *      java.awt.geom.AffineTransform.transform(float[],int,double[],int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_floatArray_int_doubleArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#transform(float[], int, float[], int, int) public void
     * java.awt.geom.AffineTransform.transform(float[],int,float[],int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#transform(float[], int, float[], int, int) public void
     * java.awt.geom.AffineTransform.transform(float[],int,float[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#transform(float[], int, float[], int, int) public void
     *      java.awt.geom.AffineTransform.transform(float[],int,float[],int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_floatArray_int_floatArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.geom.AffineTransform#transform(java.awt.geom.Point2D[], int, java.awt.geom.Point2D[], int, int)
     * public void java.awt.geom.AffineTransform.transform(java.awt.geom.Point2D[],int,java.awt.geom.Point2D[],int,int)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.awt.geom.AffineTransform#transform(java.awt.geom.Point2D[], int, java.awt.geom.Point2D[], int, int)
     * public void java.awt.geom.AffineTransform.transform(java.awt.geom.Point2D[],int,java.awt.geom.Point2D[],int,int)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#transform(java.awt.geom.Point2D[], int, java.awt.geom.Point2D[], int, int)
     *      public void
     *      java.awt.geom.AffineTransform.transform(java.awt.geom.Point2D[],int,java.awt.geom.Point2D[],int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_Point2DArray_int_Point2DArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#transform(double[], int, double[], int, int) public void
     * java.awt.geom.AffineTransform.transform(double[],int,double[],int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.geom.AffineTransform#transform(double[], int, double[], int, int) public void
     * java.awt.geom.AffineTransform.transform(double[],int,double[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.geom.AffineTransform#transform(double[], int, double[], int, int) public void
     *      java.awt.geom.AffineTransform.transform(double[],int,double[],int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_doubleArray_int_doubleArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
