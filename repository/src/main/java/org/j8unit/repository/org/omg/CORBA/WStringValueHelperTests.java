package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.WStringValueHelper class
 * org.omg.CORBA.WStringValueHelper}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.WStringValueHelperTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.WStringValueHelperClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.WStringValueHelper
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WStringValueHelperTests<SUT extends org.omg.CORBA.WStringValueHelper>
extends org.j8unit.repository.org.omg.CORBA.portable.BoxedValueHelperTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.WStringValueHelper#get_id() public java.lang.String
     * org.omg.CORBA.WStringValueHelper.get_id()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.WStringValueHelper#get_id()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_get_id()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.WStringValueHelper#read_value(org.omg.CORBA.portable.InputStream) public
     * java.io.Serializable org.omg.CORBA.WStringValueHelper.read_value(org.omg.CORBA.portable.InputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.WStringValueHelper#read_value(org.omg.CORBA.portable.InputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_value_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.CORBA.WStringValueHelper#write_value(org.omg.CORBA.portable.OutputStream, java.io.Serializable)
     * public void
     * org.omg.CORBA.WStringValueHelper.write_value(org.omg.CORBA.portable.OutputStream,java.io.Serializable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.WStringValueHelper#write_value(org.omg.CORBA.portable.OutputStream,
     *             java.io.Serializable)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_write_value_OutputStream_Serializable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
