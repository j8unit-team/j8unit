package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.IOP.CodecOperations interface org.omg.IOP.CodecOperations},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.IOP.CodecOperationsTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.IOP.CodecOperationsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.IOP.CodecOperations
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CodecOperationsTests<SUT extends org.omg.IOP.CodecOperations>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.IOP.CodecOperations#decode(byte[]) public abstract org.omg.CORBA.Any
     * org.omg.IOP.CodecOperations.decode(byte[]) throws org.omg.IOP.CodecPackage.FormatMismatch}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.IOP.CodecOperations#decode(byte[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_decode_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.CodecOperations#decode_value(byte[], org.omg.CORBA.TypeCode) public abstract
     * org.omg.CORBA.Any org.omg.IOP.CodecOperations.decode_value(byte[],org.omg.CORBA.TypeCode) throws
     * org.omg.IOP.CodecPackage.FormatMismatch,org.omg.IOP.CodecPackage.TypeMismatch}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.IOP.CodecOperations#decode_value(byte[], org.omg.CORBA.TypeCode)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_decode_value_byteArray_TypeCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.CodecOperations#encode(org.omg.CORBA.Any) public abstract byte[]
     * org.omg.IOP.CodecOperations.encode(org.omg.CORBA.Any) throws org.omg.IOP.CodecPackage.InvalidTypeForEncoding}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.IOP.CodecOperations#encode(org.omg.CORBA.Any)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_encode_Any()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.CodecOperations#encode_value(org.omg.CORBA.Any) public abstract byte[]
     * org.omg.IOP.CodecOperations.encode_value(org.omg.CORBA.Any) throws
     * org.omg.IOP.CodecPackage.InvalidTypeForEncoding}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.IOP.CodecOperations#encode_value(org.omg.CORBA.Any)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_encode_value_Any()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
