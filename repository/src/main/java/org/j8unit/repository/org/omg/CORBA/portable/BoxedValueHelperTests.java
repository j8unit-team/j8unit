package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.portable.BoxedValueHelper interface
 * org.omg.CORBA.portable.BoxedValueHelper}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.portable.BoxedValueHelperTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.portable.BoxedValueHelperClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.portable.BoxedValueHelper
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.portable.BoxedValueHelper#get_id()
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
     * Test method for {@link org.omg.CORBA.portable.BoxedValueHelper#read_value(org.omg.CORBA.portable.InputStream)
     * public abstract java.io.Serializable
     * org.omg.CORBA.portable.BoxedValueHelper.read_value(org.omg.CORBA.portable.InputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.portable.BoxedValueHelper#read_value(org.omg.CORBA.portable.InputStream)
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

    /**
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
     * @j8unit.aim org.omg.CORBA.portable.BoxedValueHelper#write_value(org.omg.CORBA.portable.OutputStream,
     *             java.io.Serializable)
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

}
