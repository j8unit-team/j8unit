package org.j8unit.repository.java.net;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.net.Socket class java.net.Socket}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.net.SocketTests}.
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
 * @see org.j8unit.repository.java.net.SocketTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.net.Socket
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SocketClassTests<SUT extends java.net.Socket>
extends org.j8unit.repository.java.io.CloseableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.Socket#Socket() public java.net.Socket()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.Socket#Socket()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Socket()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.Socket sut = null; // = new Socket();
    }

    /**
     * <p>
     * Test method for {@link java.net.Socket#Socket(java.net.InetAddress, int) public
     * java.net.Socket(java.net.InetAddress,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.Socket#Socket(java.net.InetAddress, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Socket_InetAddress_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.Socket sut = null; // = new Socket(java.net.InetAddress, int);
    }

    /**
     * <p>
     * Test method for {@link java.net.Socket#Socket(java.net.InetAddress, int, boolean) public
     * java.net.Socket(java.net.InetAddress,int,boolean) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.Socket#Socket(java.net.InetAddress, int, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Socket_InetAddress_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.Socket sut = null; // = new Socket(java.net.InetAddress, int, boolean);
    }

    /**
     * <p>
     * Test method for {@link java.net.Socket#Socket(java.net.InetAddress, int, java.net.InetAddress, int) public
     * java.net.Socket(java.net.InetAddress,int,java.net.InetAddress,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.Socket#Socket(java.net.InetAddress, int, java.net.InetAddress, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Socket_InetAddress_int_InetAddress_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.Socket sut = null; // = new Socket(java.net.InetAddress, int, java.net.InetAddress, int);
    }

    /**
     * <p>
     * Test method for {@link java.net.Socket#Socket(java.net.Proxy) public java.net.Socket(java.net.Proxy)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.Socket#Socket(java.net.Proxy)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Socket_Proxy()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.Socket sut = null; // = new Socket(java.net.Proxy);
    }

    /**
     * <p>
     * Test method for {@link java.net.Socket#Socket(java.lang.String, int) public java.net.Socket(java.lang.String,int)
     * throws java.net.UnknownHostException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.Socket#Socket(java.lang.String, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Socket_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.Socket sut = null; // = new Socket(java.lang.String, int);
    }

    /**
     * <p>
     * Test method for {@link java.net.Socket#Socket(java.lang.String, int, boolean) public
     * java.net.Socket(java.lang.String,int,boolean) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.Socket#Socket(java.lang.String, int, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Socket_String_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.Socket sut = null; // = new Socket(java.lang.String, int, boolean);
    }

    /**
     * <p>
     * Test method for {@link java.net.Socket#Socket(java.lang.String, int, java.net.InetAddress, int) public
     * java.net.Socket(java.lang.String,int,java.net.InetAddress,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.Socket#Socket(java.lang.String, int, java.net.InetAddress, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Socket_String_int_InetAddress_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.Socket sut = null; // = new Socket(java.lang.String, int, java.net.InetAddress, int);
    }

    /**
     * <p>
     * Test method for {@link java.net.Socket#setSocketImplFactory(java.net.SocketImplFactory) public static
     * synchronized void java.net.Socket.setSocketImplFactory(java.net.SocketImplFactory) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.Socket#setSocketImplFactory(java.net.SocketImplFactory)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSocketImplFactory_SocketImplFactory()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.net.Socket#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.net.Socket.class.isAssignableFrom(sut));
    }

}
