package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.XMLEncoder class java.beans.XMLEncoder}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link XMLEncoderClassTests}.
 * </p>
 *
 * @see java.beans.XMLEncoder class java.beans.XMLEncoder (the hereby targeted class-under-test class)
 * @see XMLEncoderClassTests XMLEncoderClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLEncoderTests<SUT extends java.beans.XMLEncoder>
extends org.j8unit.repository.java.lang.AutoCloseableTests<SUT>, EncoderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.XMLEncoder#flush() public void java.beans.XMLEncoder.flush()}.
     *
     * <p>
     * Test method for {@link java.beans.XMLEncoder#flush() public void java.beans.XMLEncoder.flush()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.XMLEncoder#flush() public void java.beans.XMLEncoder.flush() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_flush()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.XMLEncoder#writeObject(Object) public void
     * java.beans.XMLEncoder.writeObject(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.XMLEncoder#writeObject(Object) public void
     * java.beans.XMLEncoder.writeObject(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.XMLEncoder#writeObject(Object) public void java.beans.XMLEncoder.writeObject(java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeObject_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.XMLEncoder#writeExpression(java.beans.Expression) public void
     * java.beans.XMLEncoder.writeExpression(java.beans.Expression)}.
     *
     * <p>
     * Test method for {@link java.beans.XMLEncoder#writeExpression(java.beans.Expression) public void
     * java.beans.XMLEncoder.writeExpression(java.beans.Expression)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.XMLEncoder#writeExpression(java.beans.Expression) public void
     *      java.beans.XMLEncoder.writeExpression(java.beans.Expression) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeExpression_Expression()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.XMLEncoder#writeStatement(java.beans.Statement) public void
     * java.beans.XMLEncoder.writeStatement(java.beans.Statement)}.
     *
     * <p>
     * Test method for {@link java.beans.XMLEncoder#writeStatement(java.beans.Statement) public void
     * java.beans.XMLEncoder.writeStatement(java.beans.Statement)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.XMLEncoder#writeStatement(java.beans.Statement) public void
     *      java.beans.XMLEncoder.writeStatement(java.beans.Statement) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeStatement_Statement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.XMLEncoder#getOwner() public java.lang.Object java.beans.XMLEncoder.getOwner()}
     * .
     *
     * <p>
     * Test method for {@link java.beans.XMLEncoder#getOwner() public java.lang.Object java.beans.XMLEncoder.getOwner()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.XMLEncoder#getOwner() public java.lang.Object java.beans.XMLEncoder.getOwner() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOwner()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.XMLEncoder#close() public void java.beans.XMLEncoder.close()}.
     *
     * <p>
     * Test method for {@link java.beans.XMLEncoder#close() public void java.beans.XMLEncoder.close()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.XMLEncoder#close() public void java.beans.XMLEncoder.close() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.XMLEncoder#setOwner(Object) public void
     * java.beans.XMLEncoder.setOwner(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.XMLEncoder#setOwner(Object) public void
     * java.beans.XMLEncoder.setOwner(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.XMLEncoder#setOwner(Object) public void java.beans.XMLEncoder.setOwner(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setOwner_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
