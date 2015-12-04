package org.j8unit.repository.org.omg.PortableServer;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.ServantActivatorHelper class
 * org.omg.PortableServer.ServantActivatorHelper}, containing all class relevant test methods (at least the test methods
 * of accessible constructors and of accessible {@code static} methods). The counterpart test class containing the
 * instance relevant test methods is {@link org.j8unit.repository.org.omg.PortableServer.ServantActivatorHelperTests}.
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
 * @see org.j8unit.repository.org.omg.PortableServer.ServantActivatorHelperTests
 */
@Category(J8UnitRepository.class)
public abstract interface ServantActivatorHelperClassTests<SUT extends Class<? extends org.omg.PortableServer.ServantActivatorHelper>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link org.omg.PortableServer.ServantActivatorHelper#ServantActivatorHelper() public
     * org.omg.PortableServer.ServantActivatorHelper()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServantActivatorHelper()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.PortableServer.ServantActivatorHelper sut = null; // = new ServantActivatorHelper();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.PortableServer.ServantActivatorHelper> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.PortableServer.ServantActivatorHelper.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.ServantActivatorHelper#read(org.omg.CORBA.portable.InputStream)
     * public static org.omg.PortableServer.ServantActivator
     * org.omg.PortableServer.ServantActivatorHelper.read(org.omg.CORBA.portable.InputStream)}.
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
     * Test method for {@link org.omg.PortableServer.ServantActivatorHelper#extract(org.omg.CORBA.Any) public static
     * org.omg.PortableServer.ServantActivator org.omg.PortableServer.ServantActivatorHelper.extract(org.omg.CORBA.Any)}
     * .
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
     * Test method for {@link org.omg.PortableServer.ServantActivatorHelper#unchecked_narrow(org.omg.CORBA.Object)
     * public static org.omg.PortableServer.ServantActivator
     * org.omg.PortableServer.ServantActivatorHelper.unchecked_narrow(org.omg.CORBA.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unchecked_narrow_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.ServantActivatorHelper#type() public static synchronized
     * org.omg.CORBA.TypeCode org.omg.PortableServer.ServantActivatorHelper.type()}.
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
     * {@link org.omg.PortableServer.ServantActivatorHelper#write(org.omg.CORBA.portable.OutputStream,org.omg.PortableServer.ServantActivator)
     * public static void
     * org.omg.PortableServer.ServantActivatorHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.PortableServer.ServantActivator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_OutputStream_ServantActivator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.ServantActivatorHelper#narrow(org.omg.CORBA.Object) public static
     * org.omg.PortableServer.ServantActivator
     * org.omg.PortableServer.ServantActivatorHelper.narrow(org.omg.CORBA.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_narrow_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.ServantActivatorHelper#id() public static java.lang.String
     * org.omg.PortableServer.ServantActivatorHelper.id()}.
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
     * Test method for
     * {@link org.omg.PortableServer.ServantActivatorHelper#insert(org.omg.CORBA.Any,org.omg.PortableServer.ServantActivator)
     * public static void
     * org.omg.PortableServer.ServantActivatorHelper.insert(org.omg.CORBA.Any,org.omg.PortableServer.ServantActivator)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insert_Any_ServantActivator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
