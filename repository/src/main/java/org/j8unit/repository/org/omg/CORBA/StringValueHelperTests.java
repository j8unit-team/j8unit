package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.StringValueHelper class org.omg.CORBA.StringValueHelper}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link StringValueHelperClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.StringValueHelper class org.omg.CORBA.StringValueHelper (the hereby targeted class-under-test
 *      class)
 * @see StringValueHelperClassTests StringValueHelperClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StringValueHelperTests<SUT extends org.omg.CORBA.StringValueHelper>
extends org.j8unit.repository.org.omg.CORBA.portable.BoxedValueHelperTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.StringValueHelper#read_value(org.omg.CORBA.portable.InputStream) public
     * java.io.Serializable org.omg.CORBA.StringValueHelper.read_value(org.omg.CORBA.portable.InputStream)}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.StringValueHelper#read_value(org.omg.CORBA.portable.InputStream) public
     * java.io.Serializable org.omg.CORBA.StringValueHelper.read_value(org.omg.CORBA.portable.InputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.StringValueHelper#read_value(org.omg.CORBA.portable.InputStream) public java.io.Serializable
     *      org.omg.CORBA.StringValueHelper.read_value(org.omg.CORBA.portable.InputStream) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read_value_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.StringValueHelper#get_id() public java.lang.String
     * org.omg.CORBA.StringValueHelper.get_id()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.StringValueHelper#get_id() public java.lang.String
     * org.omg.CORBA.StringValueHelper.get_id()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.StringValueHelper#get_id() public java.lang.String org.omg.CORBA.StringValueHelper.get_id()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_get_id()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.CORBA.StringValueHelper#write_value(org.omg.CORBA.portable.OutputStream, java.io.Serializable)
     * public void
     * org.omg.CORBA.StringValueHelper.write_value(org.omg.CORBA.portable.OutputStream,java.io.Serializable)}.
     *
     * <p>
     * Test method for
     * {@link org.omg.CORBA.StringValueHelper#write_value(org.omg.CORBA.portable.OutputStream, java.io.Serializable)
     * public void
     * org.omg.CORBA.StringValueHelper.write_value(org.omg.CORBA.portable.OutputStream,java.io.Serializable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.StringValueHelper#write_value(org.omg.CORBA.portable.OutputStream, java.io.Serializable)
     *      public void
     *      org.omg.CORBA.StringValueHelper.write_value(org.omg.CORBA.portable.OutputStream,java.io.Serializable) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_write_value_OutputStream_Serializable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
