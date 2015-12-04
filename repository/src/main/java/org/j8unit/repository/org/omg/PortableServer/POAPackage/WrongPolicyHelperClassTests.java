package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.POAPackage.WrongPolicyHelper class
 * org.omg.PortableServer.POAPackage.WrongPolicyHelper}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class containing
 * the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongPolicyHelperTests}.
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
 * @see org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongPolicyHelperTests
 */
@Category(J8UnitRepository.class)
public abstract interface WrongPolicyHelperClassTests<SUT extends Class<? extends org.omg.PortableServer.POAPackage.WrongPolicyHelper>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link org.omg.PortableServer.POAPackage.WrongPolicyHelper#WrongPolicyHelper() public
     * org.omg.PortableServer.POAPackage.WrongPolicyHelper()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_WrongPolicyHelper()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.PortableServer.POAPackage.WrongPolicyHelper sut = null; // = new WrongPolicyHelper();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.PortableServer.POAPackage.WrongPolicyHelper> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.PortableServer.POAPackage.WrongPolicyHelper.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAPackage.WrongPolicyHelper#read(org.omg.CORBA.portable.InputStream) public static
     * org.omg.PortableServer.POAPackage.WrongPolicy
     * org.omg.PortableServer.POAPackage.WrongPolicyHelper.read(org.omg.CORBA.portable.InputStream)}.
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
     * Test method for {@link org.omg.PortableServer.POAPackage.WrongPolicyHelper#extract(org.omg.CORBA.Any) public
     * static org.omg.PortableServer.POAPackage.WrongPolicy
     * org.omg.PortableServer.POAPackage.WrongPolicyHelper.extract(org.omg.CORBA.Any)}.
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
     * Test method for
     * {@link org.omg.PortableServer.POAPackage.WrongPolicyHelper#write(org.omg.CORBA.portable.OutputStream,org.omg.PortableServer.POAPackage.WrongPolicy)
     * public static void
     * org.omg.PortableServer.POAPackage.WrongPolicyHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.PortableServer.POAPackage.WrongPolicy)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_OutputStream_WrongPolicy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAPackage.WrongPolicyHelper#type() public static synchronized
     * org.omg.CORBA.TypeCode org.omg.PortableServer.POAPackage.WrongPolicyHelper.type()}.
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
     * Test method for {@link org.omg.PortableServer.POAPackage.WrongPolicyHelper#id() public static java.lang.String
     * org.omg.PortableServer.POAPackage.WrongPolicyHelper.id()}.
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
     * {@link org.omg.PortableServer.POAPackage.WrongPolicyHelper#insert(org.omg.CORBA.Any,org.omg.PortableServer.POAPackage.WrongPolicy)
     * public static void
     * org.omg.PortableServer.POAPackage.WrongPolicyHelper.insert(org.omg.CORBA.Any,org.omg.PortableServer.POAPackage.WrongPolicy)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insert_Any_WrongPolicy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
