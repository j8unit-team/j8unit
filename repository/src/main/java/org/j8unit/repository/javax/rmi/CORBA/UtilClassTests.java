package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.rmi.CORBA.Util class javax.rmi.CORBA.Util},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.rmi.CORBA.UtilTests}.
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
 * @see org.j8unit.repository.javax.rmi.CORBA.UtilTests
 */
@Category(J8UnitRepository.class)
public abstract interface UtilClassTests<SUT extends Class<? extends javax.rmi.CORBA.Util>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.rmi.CORBA.Util> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.rmi.CORBA.Util.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#registerTarget(javax.rmi.CORBA.Tie,java.rmi.Remote) public static void javax.rmi.CORBA.Util.registerTarget(javax.rmi.CORBA.Tie,java.rmi.Remote)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerTarget_Tie_Remote() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#copyObjects(java.lang.Object[],org.omg.CORBA.ORB) public static java.lang.Object[] javax.rmi.CORBA.Util.copyObjects(java.lang.Object[],org.omg.CORBA.ORB) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_copyObjects_ObjectArray_ORB() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#wrapException(java.lang.Throwable) public static java.rmi.RemoteException javax.rmi.CORBA.Util.wrapException(java.lang.Throwable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_wrapException_Throwable() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#isLocal(javax.rmi.CORBA.Stub) public static boolean javax.rmi.CORBA.Util.isLocal(javax.rmi.CORBA.Stub) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isLocal_Stub() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#mapSystemException(org.omg.CORBA.SystemException) public static java.rmi.RemoteException javax.rmi.CORBA.Util.mapSystemException(org.omg.CORBA.SystemException)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mapSystemException_SystemException() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#copyObject(java.lang.Object,org.omg.CORBA.ORB) public static java.lang.Object javax.rmi.CORBA.Util.copyObject(java.lang.Object,org.omg.CORBA.ORB) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_copyObject_Object_ORB() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#writeAny(org.omg.CORBA.portable.OutputStream,java.lang.Object) public static void javax.rmi.CORBA.Util.writeAny(org.omg.CORBA.portable.OutputStream,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeAny_OutputStream_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#getCodebase(java.lang.Class) public static java.lang.String javax.rmi.CORBA.Util.getCodebase(java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCodebase_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#readAny(org.omg.CORBA.portable.InputStream) public static java.lang.Object javax.rmi.CORBA.Util.readAny(org.omg.CORBA.portable.InputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readAny_InputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#unexportObject(java.rmi.Remote) public static void javax.rmi.CORBA.Util.unexportObject(java.rmi.Remote) throws java.rmi.NoSuchObjectException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unexportObject_Remote() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#getTie(java.rmi.Remote) public static javax.rmi.CORBA.Tie javax.rmi.CORBA.Util.getTie(java.rmi.Remote)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTie_Remote() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#writeAbstractObject(org.omg.CORBA.portable.OutputStream,java.lang.Object) public static void javax.rmi.CORBA.Util.writeAbstractObject(org.omg.CORBA.portable.OutputStream,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeAbstractObject_OutputStream_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#writeRemoteObject(org.omg.CORBA.portable.OutputStream,java.lang.Object) public static void javax.rmi.CORBA.Util.writeRemoteObject(org.omg.CORBA.portable.OutputStream,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeRemoteObject_OutputStream_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#loadClass(java.lang.String,java.lang.String,java.lang.ClassLoader) public static java.lang.Class javax.rmi.CORBA.Util.loadClass(java.lang.String,java.lang.String,java.lang.ClassLoader) throws java.lang.ClassNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loadClass_String_String_ClassLoader() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Util#createValueHandler() public static javax.rmi.CORBA.ValueHandler javax.rmi.CORBA.Util.createValueHandler()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createValueHandler() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
