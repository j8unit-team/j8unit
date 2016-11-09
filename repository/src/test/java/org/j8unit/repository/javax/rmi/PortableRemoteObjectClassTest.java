package org.j8unit.repository.javax.rmi;

import javax.rmi.PortableRemoteObject;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PortableRemoteObject} (by simply reusing
 * the J8Unit test interface {@link PortableRemoteObjectClassTests}).
 */

@RunWith(J8Unit4.class)
public class PortableRemoteObjectClassTest
implements PortableRemoteObjectClassTests<PortableRemoteObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.PortableRemoteObject]

    @Override
    public Class<PortableRemoteObject> createNewSUT() {
        return PortableRemoteObject.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.rmi.PortableRemoteObject#connect(java.rmi.Remote, java.rmi.Remote) public static void
     * javax.rmi.PortableRemoteObject.connect(java.rmi.Remote,java.rmi.Remote) throws java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_connect_Remote_Remote()
    throws Exception {
        // write some test for {@link javax.rmi.PortableRemoteObject#connect(java.rmi.Remote, java.rmi.Remote)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.rmi.PortableRemoteObject#toStub(java.rmi.Remote) public static java.rmi.Remote
     * javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote) throws java.rmi.NoSuchObjectException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toStub_Remote()
    throws Exception {
        // write some test for {@link javax.rmi.PortableRemoteObject#toStub(java.rmi.Remote)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.rmi.PortableRemoteObject#narrow(Object, Class)
     * public static java.lang.Object javax.rmi.PortableRemoteObject.narrow(java.lang.Object,java.lang.Class) throws
     * java.lang.ClassCastException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_narrow_Object_Class()
    throws Exception {
        // write some test for {@link javax.rmi.PortableRemoteObject#narrow(Object, Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.rmi.PortableRemoteObject#exportObject(java.rmi.Remote) public static void
     * javax.rmi.PortableRemoteObject.exportObject(java.rmi.Remote) throws java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_exportObject_Remote()
    throws Exception {
        // write some test for {@link javax.rmi.PortableRemoteObject#exportObject(java.rmi.Remote)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.rmi.PortableRemoteObject#unexportObject(java.rmi.Remote) public static void
     * javax.rmi.PortableRemoteObject.unexportObject(java.rmi.Remote) throws java.rmi.NoSuchObjectException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_unexportObject_Remote()
    throws Exception {
        // write some test for {@link javax.rmi.PortableRemoteObject#unexportObject(java.rmi.Remote)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.rmi.PortableRemoteObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.PortableRemoteObject]

}
