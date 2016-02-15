package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.rmi.CORBA.ValueHandlerMultiFormat interface
 * javax.rmi.CORBA.ValueHandlerMultiFormat}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ValueHandlerMultiFormatClassTests}.
 * </p>
 *
 * @see javax.rmi.CORBA.ValueHandlerMultiFormat interface javax.rmi.CORBA.ValueHandlerMultiFormat (the hereby targeted
 *      class-under-test class)
 * @see ValueHandlerMultiFormatClassTests ValueHandlerMultiFormatClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ValueHandlerMultiFormatTests<SUT extends javax.rmi.CORBA.ValueHandlerMultiFormat>
extends ValueHandlerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.rmi.CORBA.ValueHandlerMultiFormat#writeValue(org.omg.CORBA.portable.OutputStream, java.io.Serializable, byte)
     * public abstract void
     * javax.rmi.CORBA.ValueHandlerMultiFormat.writeValue(org.omg.CORBA.portable.OutputStream,java.io.Serializable,byte)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.rmi.CORBA.ValueHandlerMultiFormat#writeValue(org.omg.CORBA.portable.OutputStream, java.io.Serializable, byte)
     * public abstract void
     * javax.rmi.CORBA.ValueHandlerMultiFormat.writeValue(org.omg.CORBA.portable.OutputStream,java.io.Serializable,byte)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.CORBA.ValueHandlerMultiFormat#writeValue(org.omg.CORBA.portable.OutputStream,
     *      java.io.Serializable, byte) public abstract void
     *      javax.rmi.CORBA.ValueHandlerMultiFormat.writeValue(org.omg.CORBA.portable.OutputStream,java.io.Serializable,
     *      byte) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeValue_OutputStream_Serializable_byte()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.ValueHandlerMultiFormat#getMaximumStreamFormatVersion() public abstract
     * byte javax.rmi.CORBA.ValueHandlerMultiFormat.getMaximumStreamFormatVersion()}.
     *
     * <p>
     * Test method for {@link javax.rmi.CORBA.ValueHandlerMultiFormat#getMaximumStreamFormatVersion() public abstract
     * byte javax.rmi.CORBA.ValueHandlerMultiFormat.getMaximumStreamFormatVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.CORBA.ValueHandlerMultiFormat#getMaximumStreamFormatVersion() public abstract byte
     *      javax.rmi.CORBA.ValueHandlerMultiFormat.getMaximumStreamFormatVersion() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMaximumStreamFormatVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
