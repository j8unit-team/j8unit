package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.portable.BoxedValueHelper interface
 * org.omg.CORBA.portable.BoxedValueHelper}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link BoxedValueHelperClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.portable.BoxedValueHelper interface org.omg.CORBA.portable.BoxedValueHelper (the hereby targeted
 *      class-under-test class)
 * @see BoxedValueHelperClassTests BoxedValueHelperClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BoxedValueHelperTests<SUT extends org.omg.CORBA.portable.BoxedValueHelper>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.BoxedValueHelper#get_id() public abstract java.lang.String
     * org.omg.CORBA.portable.BoxedValueHelper.get_id()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.portable.BoxedValueHelper#get_id() public abstract java.lang.String
     * org.omg.CORBA.portable.BoxedValueHelper.get_id()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.portable.BoxedValueHelper#get_id() public abstract java.lang.String
     *      org.omg.CORBA.portable.BoxedValueHelper.get_id() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link org.omg.CORBA.portable.BoxedValueHelper#write_value(org.omg.CORBA.portable.OutputStream, java.io.Serializable)
     * public abstract void
     * org.omg.CORBA.portable.BoxedValueHelper.write_value(org.omg.CORBA.portable.OutputStream,java.io.Serializable)}.
     *
     * <p>
     * Test method for
     * {@link org.omg.CORBA.portable.BoxedValueHelper#write_value(org.omg.CORBA.portable.OutputStream, java.io.Serializable)
     * public abstract void
     * org.omg.CORBA.portable.BoxedValueHelper.write_value(org.omg.CORBA.portable.OutputStream,java.io.Serializable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.portable.BoxedValueHelper#write_value(org.omg.CORBA.portable.OutputStream,
     *      java.io.Serializable) public abstract void
     *      org.omg.CORBA.portable.BoxedValueHelper.write_value(org.omg.CORBA.portable.OutputStream,java.io.
     *      Serializable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_value_OutputStream_Serializable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.BoxedValueHelper#read_value(org.omg.CORBA.portable.InputStream)
     * public abstract java.io.Serializable
     * org.omg.CORBA.portable.BoxedValueHelper.read_value(org.omg.CORBA.portable.InputStream)}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.portable.BoxedValueHelper#read_value(org.omg.CORBA.portable.InputStream)
     * public abstract java.io.Serializable
     * org.omg.CORBA.portable.BoxedValueHelper.read_value(org.omg.CORBA.portable.InputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.portable.BoxedValueHelper#read_value(org.omg.CORBA.portable.InputStream) public abstract
     *      java.io.Serializable org.omg.CORBA.portable.BoxedValueHelper.read_value(org.omg.CORBA.portable.InputStream)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_value_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
