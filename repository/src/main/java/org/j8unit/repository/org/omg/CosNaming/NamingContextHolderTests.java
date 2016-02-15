package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.NamingContextHolder class
 * org.omg.CosNaming.NamingContextHolder}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link NamingContextHolderClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.NamingContextHolder class org.omg.CosNaming.NamingContextHolder (the hereby targeted
 *      class-under-test class)
 * @see NamingContextHolderClassTests NamingContextHolderClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingContextHolderTests<SUT extends org.omg.CosNaming.NamingContextHolder>
extends org.j8unit.repository.org.omg.CORBA.portable.StreamableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextHolder#_read(org.omg.CORBA.portable.InputStream) public
     * void org.omg.CosNaming.NamingContextHolder._read(org.omg.CORBA.portable.InputStream)}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextHolder#_read(org.omg.CORBA.portable.InputStream) public
     * void org.omg.CosNaming.NamingContextHolder._read(org.omg.CORBA.portable.InputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextHolder#_read(org.omg.CORBA.portable.InputStream) public void
     *      org.omg.CosNaming.NamingContextHolder._read(org.omg.CORBA.portable.InputStream) (the hereby targeted
     *      method-under-test)
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

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextHolder#_write(org.omg.CORBA.portable.OutputStream) public
     * void org.omg.CosNaming.NamingContextHolder._write(org.omg.CORBA.portable.OutputStream)}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextHolder#_write(org.omg.CORBA.portable.OutputStream) public
     * void org.omg.CosNaming.NamingContextHolder._write(org.omg.CORBA.portable.OutputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextHolder#_write(org.omg.CORBA.portable.OutputStream) public void
     *      org.omg.CosNaming.NamingContextHolder._write(org.omg.CORBA.portable.OutputStream) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link org.omg.CosNaming.NamingContextHolder#_type() public org.omg.CORBA.TypeCode
     * org.omg.CosNaming.NamingContextHolder._type()}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextHolder#_type() public org.omg.CORBA.TypeCode
     * org.omg.CosNaming.NamingContextHolder._type()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextHolder#_type() public org.omg.CORBA.TypeCode
     *      org.omg.CosNaming.NamingContextHolder._type() (the hereby targeted method-under-test)
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

}
