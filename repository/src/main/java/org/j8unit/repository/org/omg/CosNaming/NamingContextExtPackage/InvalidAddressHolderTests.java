package org.j8unit.repository.org.omg.CosNaming.NamingContextExtPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder class
 * org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder}. The complementary j8unit test interface containing
 * the class relevant aspects is {@link InvalidAddressHolderClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder class
 *      org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder (the hereby targeted class-under-test class)
 * @see InvalidAddressHolderClassTests InvalidAddressHolderClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidAddressHolderTests<SUT extends org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder>
extends org.j8unit.repository.org.omg.CORBA.portable.StreamableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder#_write(org.omg.CORBA.portable.OutputStream)
     * public void
     * org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder._write(org.omg.CORBA.portable.OutputStream)}.
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder#_write(org.omg.CORBA.portable.OutputStream)
     * public void
     * org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder._write(org.omg.CORBA.portable.OutputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder#_write(org.omg.CORBA.portable.OutputStream)
     *      public void
     *      org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder._write(org.omg.CORBA.portable.OutputStream)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__write_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder#_type() public
     * org.omg.CORBA.TypeCode org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder._type()}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder#_type() public
     * org.omg.CORBA.TypeCode org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder._type()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder#_type() public org.omg.CORBA.TypeCode
     *      org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder._type() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__type()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder#_read(org.omg.CORBA.portable.InputStream)
     * public void
     * org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder._read(org.omg.CORBA.portable.InputStream)}.
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder#_read(org.omg.CORBA.portable.InputStream)
     * public void
     * org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder._read(org.omg.CORBA.portable.InputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder#_read(org.omg.CORBA.portable.InputStream)
     *      public void
     *      org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder._read(org.omg.CORBA.portable.InputStream)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__read_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
