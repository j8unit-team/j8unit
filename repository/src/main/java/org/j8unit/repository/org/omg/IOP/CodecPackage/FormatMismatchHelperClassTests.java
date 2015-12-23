package org.j8unit.repository.org.omg.IOP.CodecPackage;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.IOP.CodecPackage.FormatMismatchHelper class
 * org.omg.IOP.CodecPackage.FormatMismatchHelper}, containing all class relevant test methods (at least the test methods
 * of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.IOP.CodecPackage.FormatMismatchHelperTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.IOP.CodecPackage.FormatMismatchHelperTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.IOP.CodecPackage.FormatMismatchHelper
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormatMismatchHelperClassTests<SUT extends org.omg.IOP.CodecPackage.FormatMismatchHelper>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.IOP.CodecPackage.FormatMismatchHelper#FormatMismatchHelper() public
     * org.omg.IOP.CodecPackage.FormatMismatchHelper()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.IOP.CodecPackage.FormatMismatchHelper#FormatMismatchHelper()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FormatMismatchHelper()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.IOP.CodecPackage.FormatMismatchHelper sut = null; // = new FormatMismatchHelper();
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.CodecPackage.FormatMismatchHelper#extract(org.omg.CORBA.Any) public static
     * org.omg.IOP.CodecPackage.FormatMismatch org.omg.IOP.CodecPackage.FormatMismatchHelper.extract(org.omg.CORBA.Any)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.IOP.CodecPackage.FormatMismatchHelper#extract(org.omg.CORBA.Any)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_extract_Any()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.CodecPackage.FormatMismatchHelper#id() public static java.lang.String
     * org.omg.IOP.CodecPackage.FormatMismatchHelper.id()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.IOP.CodecPackage.FormatMismatchHelper#id()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_id()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.IOP.CodecPackage.FormatMismatchHelper#insert(org.omg.CORBA.Any, org.omg.IOP.CodecPackage.FormatMismatch)
     * public static void
     * org.omg.IOP.CodecPackage.FormatMismatchHelper.insert(org.omg.CORBA.Any,org.omg.IOP.CodecPackage.FormatMismatch)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.IOP.CodecPackage.FormatMismatchHelper#insert(org.omg.CORBA.Any,
     *             org.omg.IOP.CodecPackage.FormatMismatch)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insert_Any_FormatMismatch()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.CodecPackage.FormatMismatchHelper#read(org.omg.CORBA.portable.InputStream)
     * public static org.omg.IOP.CodecPackage.FormatMismatch
     * org.omg.IOP.CodecPackage.FormatMismatchHelper.read(org.omg.CORBA.portable.InputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.IOP.CodecPackage.FormatMismatchHelper#read(org.omg.CORBA.portable.InputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.CodecPackage.FormatMismatchHelper#type() public static synchronized
     * org.omg.CORBA.TypeCode org.omg.IOP.CodecPackage.FormatMismatchHelper.type()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.IOP.CodecPackage.FormatMismatchHelper#type()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_type()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.IOP.CodecPackage.FormatMismatchHelper#write(org.omg.CORBA.portable.OutputStream, org.omg.IOP.CodecPackage.FormatMismatch)
     * public static void
     * org.omg.IOP.CodecPackage.FormatMismatchHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.IOP.CodecPackage.FormatMismatch)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.IOP.CodecPackage.FormatMismatchHelper#write(org.omg.CORBA.portable.OutputStream,
     *             org.omg.IOP.CodecPackage.FormatMismatch)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_OutputStream_FormatMismatch()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim org.omg.IOP.CodecPackage.FormatMismatchHelper#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.IOP.CodecPackage.FormatMismatchHelper.class.isAssignableFrom(sut));
    }

}
