package org.j8unit.repository.java.net;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.net.DatagramSocket class java.net.DatagramSocket}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.net.DatagramSocketTests}.
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
 * @see org.j8unit.repository.java.net.DatagramSocketTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.net.DatagramSocket
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DatagramSocketClassTests<SUT extends java.net.DatagramSocket>
extends org.j8unit.repository.java.io.CloseableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#DatagramSocket() public java.net.DatagramSocket() throws
     * java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.DatagramSocket#DatagramSocket()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DatagramSocket()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.DatagramSocket sut = null; // = new DatagramSocket();
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#DatagramSocket(int) public java.net.DatagramSocket(int) throws
     * java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.DatagramSocket#DatagramSocket(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DatagramSocket_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.DatagramSocket sut = null; // = new DatagramSocket(int);
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#DatagramSocket(int, java.net.InetAddress) public
     * java.net.DatagramSocket(int,java.net.InetAddress) throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.DatagramSocket#DatagramSocket(int, java.net.InetAddress)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DatagramSocket_int_InetAddress()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.DatagramSocket sut = null; // = new DatagramSocket(int, java.net.InetAddress);
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#DatagramSocket(java.net.SocketAddress) public
     * java.net.DatagramSocket(java.net.SocketAddress) throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.DatagramSocket#DatagramSocket(java.net.SocketAddress)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DatagramSocket_SocketAddress()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.DatagramSocket sut = null; // = new DatagramSocket(java.net.SocketAddress);
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#setDatagramSocketImplFactory(java.net.DatagramSocketImplFactory)
     * public static synchronized void
     * java.net.DatagramSocket.setDatagramSocketImplFactory(java.net.DatagramSocketImplFactory) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.DatagramSocket#setDatagramSocketImplFactory(java.net.DatagramSocketImplFactory)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDatagramSocketImplFactory_DatagramSocketImplFactory()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.net.DatagramSocket#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.net.DatagramSocket.class.isAssignableFrom(sut));
    }

}
