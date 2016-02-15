package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.rmi.RMIServerImpl class
 * javax.management.remote.rmi.RMIServerImpl}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RMIServerImplClassTests}.
 * </p>
 *
 * @see javax.management.remote.rmi.RMIServerImpl class javax.management.remote.rmi.RMIServerImpl (the hereby targeted
 *      class-under-test class)
 * @see RMIServerImplClassTests RMIServerImplClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIServerImplTests<SUT extends javax.management.remote.rmi.RMIServerImpl>
extends org.j8unit.repository.java.io.CloseableTests<SUT>, RMIServerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#getDefaultClassLoader() public synchronized
     * java.lang.ClassLoader javax.management.remote.rmi.RMIServerImpl.getDefaultClassLoader()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#getDefaultClassLoader() public synchronized
     * java.lang.ClassLoader javax.management.remote.rmi.RMIServerImpl.getDefaultClassLoader()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIServerImpl#getDefaultClassLoader() public synchronized java.lang.ClassLoader
     *      javax.management.remote.rmi.RMIServerImpl.getDefaultClassLoader() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#getVersion() public java.lang.String
     * javax.management.remote.rmi.RMIServerImpl.getVersion()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#getVersion() public java.lang.String
     * javax.management.remote.rmi.RMIServerImpl.getVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIServerImpl#getVersion() public java.lang.String
     *      javax.management.remote.rmi.RMIServerImpl.getVersion() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#newClient(Object) public
     * javax.management.remote.rmi.RMIConnection javax.management.remote.rmi.RMIServerImpl.newClient(java.lang.Object)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#newClient(Object) public
     * javax.management.remote.rmi.RMIConnection javax.management.remote.rmi.RMIServerImpl.newClient(java.lang.Object)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIServerImpl#newClient(Object) public javax.management.remote.rmi.RMIConnection
     *      javax.management.remote.rmi.RMIServerImpl.newClient(java.lang.Object) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_newClient_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#getMBeanServer() public synchronized
     * javax.management.MBeanServer javax.management.remote.rmi.RMIServerImpl.getMBeanServer()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#getMBeanServer() public synchronized
     * javax.management.MBeanServer javax.management.remote.rmi.RMIServerImpl.getMBeanServer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIServerImpl#getMBeanServer() public synchronized javax.management.MBeanServer
     *      javax.management.remote.rmi.RMIServerImpl.getMBeanServer() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanServer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#setDefaultClassLoader(ClassLoader) public
     * synchronized void javax.management.remote.rmi.RMIServerImpl.setDefaultClassLoader(java.lang.ClassLoader)}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#setDefaultClassLoader(ClassLoader) public
     * synchronized void javax.management.remote.rmi.RMIServerImpl.setDefaultClassLoader(java.lang.ClassLoader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIServerImpl#setDefaultClassLoader(ClassLoader) public synchronized void
     *      javax.management.remote.rmi.RMIServerImpl.setDefaultClassLoader(java.lang.ClassLoader) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefaultClassLoader_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#toStub() public abstract java.rmi.Remote
     * javax.management.remote.rmi.RMIServerImpl.toStub() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#toStub() public abstract java.rmi.Remote
     * javax.management.remote.rmi.RMIServerImpl.toStub() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIServerImpl#toStub() public abstract java.rmi.Remote
     *      javax.management.remote.rmi.RMIServerImpl.toStub() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toStub()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#close() public synchronized void
     * javax.management.remote.rmi.RMIServerImpl.close() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#close() public synchronized void
     * javax.management.remote.rmi.RMIServerImpl.close() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIServerImpl#close() public synchronized void
     *      javax.management.remote.rmi.RMIServerImpl.close() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#setMBeanServer(javax.management.MBeanServer)
     * public synchronized void javax.management.remote.rmi.RMIServerImpl.setMBeanServer(javax.management.MBeanServer)}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl#setMBeanServer(javax.management.MBeanServer)
     * public synchronized void javax.management.remote.rmi.RMIServerImpl.setMBeanServer(javax.management.MBeanServer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIServerImpl#setMBeanServer(javax.management.MBeanServer) public synchronized
     *      void javax.management.remote.rmi.RMIServerImpl.setMBeanServer(javax.management.MBeanServer) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMBeanServer_MBeanServer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
