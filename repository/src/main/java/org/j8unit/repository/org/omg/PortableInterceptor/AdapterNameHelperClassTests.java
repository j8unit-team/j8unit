package org.j8unit.repository.org.omg.PortableInterceptor;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.AdapterNameHelper class
 * org.omg.PortableInterceptor.AdapterNameHelper}, containing all class relevant test methods (at least the test methods
 * of accessible constructors and of accessible {@code static} methods). The counterpart test class containing the
 * instance relevant test methods is {@link org.j8unit.repository.org.omg.PortableInterceptor.AdapterNameHelperTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.AdapterNameHelperTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AdapterNameHelperClassTests<SUT extends Class<? extends org.omg.PortableInterceptor.AdapterNameHelper>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link org.omg.PortableInterceptor.AdapterNameHelper#AdapterNameHelper() public
     * org.omg.PortableInterceptor.AdapterNameHelper()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AdapterNameHelper()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.PortableInterceptor.AdapterNameHelper sut = null; // = new AdapterNameHelper();
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.AdapterNameHelper#extract(org.omg.CORBA.Any) public static
     * java.lang.String[] org.omg.PortableInterceptor.AdapterNameHelper.extract(org.omg.CORBA.Any)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_extract_Any()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.AdapterNameHelper#id() public static java.lang.String
     * org.omg.PortableInterceptor.AdapterNameHelper.id()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_id()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.AdapterNameHelper#insert(org.omg.CORBA.Any,java.lang.String[])
     * public static void org.omg.PortableInterceptor.AdapterNameHelper.insert(org.omg.CORBA.Any,java.lang.String[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insert_Any_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.AdapterNameHelper#read(org.omg.CORBA.portable.InputStream)
     * public static java.lang.String[]
     * org.omg.PortableInterceptor.AdapterNameHelper.read(org.omg.CORBA.portable.InputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.AdapterNameHelper#type() public static synchronized
     * org.omg.CORBA.TypeCode org.omg.PortableInterceptor.AdapterNameHelper.type()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_type()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.AdapterNameHelper#write(org.omg.CORBA.portable.OutputStream,java.lang.String[])
     * public static void
     * org.omg.PortableInterceptor.AdapterNameHelper.write(org.omg.CORBA.portable.OutputStream,java.lang.String[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_OutputStream_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.PortableInterceptor.AdapterNameHelper> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.PortableInterceptor.AdapterNameHelper.class.isAssignableFrom(sut));
    }

}