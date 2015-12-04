package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.POAPackage.AdapterNonExistentHelper class org.omg.PortableServer.POAPackage.AdapterNonExistentHelper},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.org.omg.PortableServer.POAPackage.AdapterNonExistentHelperTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.POAPackage.AdapterNonExistentHelperTests
 */
@Category(J8UnitRepository.class)
public abstract interface AdapterNonExistentHelperClassTests<SUT extends Class<? extends org.omg.PortableServer.POAPackage.AdapterNonExistentHelper>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link org.omg.PortableServer.POAPackage.AdapterNonExistentHelper#AdapterNonExistentHelper() public org.omg.PortableServer.POAPackage.AdapterNonExistentHelper()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AdapterNonExistentHelper() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.omg.PortableServer.POAPackage.AdapterNonExistentHelper sut = null; // = new AdapterNonExistentHelper();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends org.omg.PortableServer.POAPackage.AdapterNonExistentHelper> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.PortableServer.POAPackage.AdapterNonExistentHelper.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAPackage.AdapterNonExistentHelper#read(org.omg.CORBA.portable.InputStream) public static org.omg.PortableServer.POAPackage.AdapterNonExistent org.omg.PortableServer.POAPackage.AdapterNonExistentHelper.read(org.omg.CORBA.portable.InputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_InputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAPackage.AdapterNonExistentHelper#extract(org.omg.CORBA.Any) public static org.omg.PortableServer.POAPackage.AdapterNonExistent org.omg.PortableServer.POAPackage.AdapterNonExistentHelper.extract(org.omg.CORBA.Any)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_extract_Any() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAPackage.AdapterNonExistentHelper#insert(org.omg.CORBA.Any,org.omg.PortableServer.POAPackage.AdapterNonExistent) public static void org.omg.PortableServer.POAPackage.AdapterNonExistentHelper.insert(org.omg.CORBA.Any,org.omg.PortableServer.POAPackage.AdapterNonExistent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insert_Any_AdapterNonExistent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAPackage.AdapterNonExistentHelper#id() public static java.lang.String org.omg.PortableServer.POAPackage.AdapterNonExistentHelper.id()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_id() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAPackage.AdapterNonExistentHelper#type() public static synchronized org.omg.CORBA.TypeCode org.omg.PortableServer.POAPackage.AdapterNonExistentHelper.type()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_type() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAPackage.AdapterNonExistentHelper#write(org.omg.CORBA.portable.OutputStream,org.omg.PortableServer.POAPackage.AdapterNonExistent) public static void org.omg.PortableServer.POAPackage.AdapterNonExistentHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.PortableServer.POAPackage.AdapterNonExistent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_OutputStream_AdapterNonExistent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
