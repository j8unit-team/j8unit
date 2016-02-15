package org.j8unit.repository.javax.management.loading;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.loading.MLet class javax.management.loading.MLet}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MLetClassTests}.
 * </p>
 *
 * @see javax.management.loading.MLet class javax.management.loading.MLet (the hereby targeted class-under-test class)
 * @see MLetClassTests MLetClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MLetTests<SUT extends javax.management.loading.MLet>
extends MLetMBeanTests<SUT>, org.j8unit.repository.javax.management.MBeanRegistrationTests<SUT>, org.j8unit.repository.java.io.ExternalizableTests<SUT>,
org.j8unit.repository.java.net.URLClassLoaderTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#writeExternal(java.io.ObjectOutput) public void
     * javax.management.loading.MLet.writeExternal(java.io.ObjectOutput) throws
     * java.io.IOException,java.lang.UnsupportedOperationException}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#writeExternal(java.io.ObjectOutput) public void
     * javax.management.loading.MLet.writeExternal(java.io.ObjectOutput) throws
     * java.io.IOException,java.lang.UnsupportedOperationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#writeExternal(java.io.ObjectOutput) public void
     *      javax.management.loading.MLet.writeExternal(java.io.ObjectOutput) throws
     *      java.io.IOException,java.lang.UnsupportedOperationException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeExternal_ObjectOutput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#postDeregister() public void
     * javax.management.loading.MLet.postDeregister()}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#postDeregister() public void
     * javax.management.loading.MLet.postDeregister()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#postDeregister() public void javax.management.loading.MLet.postDeregister()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_postDeregister()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#preDeregister() public void
     * javax.management.loading.MLet.preDeregister() throws java.lang.Exception}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#preDeregister() public void
     * javax.management.loading.MLet.preDeregister() throws java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#preDeregister() public void javax.management.loading.MLet.preDeregister()
     *      throws java.lang.Exception (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_preDeregister()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#getMBeansFromURL(String) public java.util.Set
     * <java.lang.Object> javax.management.loading.MLet.getMBeansFromURL(java.lang.String) throws
     * javax.management.ServiceNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#getMBeansFromURL(String) public java.util.Set
     * javax.management.loading.MLet.getMBeansFromURL(java.lang.String) throws
     * javax.management.ServiceNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#getMBeansFromURL(String) public java.util.Set
     *      javax.management.loading.MLet.getMBeansFromURL(java.lang.String) throws
     *      javax.management.ServiceNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMBeansFromURL_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#getMBeansFromURL(java.net.URL) public java.util.Set
     * <java.lang.Object> javax.management.loading.MLet.getMBeansFromURL(java.net.URL) throws
     * javax.management.ServiceNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#getMBeansFromURL(java.net.URL) public java.util.Set
     * javax.management.loading.MLet.getMBeansFromURL(java.net.URL) throws javax.management.ServiceNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#getMBeansFromURL(java.net.URL) public java.util.Set
     *      javax.management.loading.MLet.getMBeansFromURL(java.net.URL) throws
     *      javax.management.ServiceNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMBeansFromURL_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.loading.MLet#loadClass(String, javax.management.loading.ClassLoaderRepository) public
     * synchronized java.lang.Class
     * <?> javax.management.loading.MLet.loadClass(java.lang.String,javax.management.loading.ClassLoaderRepository)
     * throws java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.loading.MLet#loadClass(String, javax.management.loading.ClassLoaderRepository) public
     * synchronized java.lang.Class
     * javax.management.loading.MLet.loadClass(java.lang.String,javax.management.loading.ClassLoaderRepository) throws
     * java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#loadClass(String, javax.management.loading.ClassLoaderRepository) public
     *      synchronized java.lang.Class
     *      javax.management.loading.MLet.loadClass(java.lang.String,javax.management.loading.ClassLoaderRepository)
     *      throws java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loadClass_String_ClassLoaderRepository()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#postRegister(Boolean) public void
     * javax.management.loading.MLet.postRegister(java.lang.Boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#postRegister(Boolean) public void
     * javax.management.loading.MLet.postRegister(java.lang.Boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#postRegister(Boolean) public void
     *      javax.management.loading.MLet.postRegister(java.lang.Boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_postRegister_Boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#setLibraryDirectory(String) public synchronized void
     * javax.management.loading.MLet.setLibraryDirectory(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#setLibraryDirectory(String) public synchronized void
     * javax.management.loading.MLet.setLibraryDirectory(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#setLibraryDirectory(String) public synchronized void
     *      javax.management.loading.MLet.setLibraryDirectory(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setLibraryDirectory_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#addURL(java.net.URL) public void
     * javax.management.loading.MLet.addURL(java.net.URL)}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#addURL(java.net.URL) public void
     * javax.management.loading.MLet.addURL(java.net.URL)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#addURL(java.net.URL) public void
     *      javax.management.loading.MLet.addURL(java.net.URL) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addURL_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#addURL(String) public void
     * javax.management.loading.MLet.addURL(java.lang.String) throws javax.management.ServiceNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#addURL(String) public void
     * javax.management.loading.MLet.addURL(java.lang.String) throws javax.management.ServiceNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#addURL(String) public void
     *      javax.management.loading.MLet.addURL(java.lang.String) throws javax.management.ServiceNotFoundException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addURL_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#readExternal(java.io.ObjectInput) public void
     * javax.management.loading.MLet.readExternal(java.io.ObjectInput) throws
     * java.io.IOException,java.lang.ClassNotFoundException,java.lang.UnsupportedOperationException}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#readExternal(java.io.ObjectInput) public void
     * javax.management.loading.MLet.readExternal(java.io.ObjectInput) throws
     * java.io.IOException,java.lang.ClassNotFoundException,java.lang.UnsupportedOperationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#readExternal(java.io.ObjectInput) public void
     *      javax.management.loading.MLet.readExternal(java.io.ObjectInput) throws
     *      java.io.IOException,java.lang.ClassNotFoundException,java.lang.UnsupportedOperationException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readExternal_ObjectInput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#getLibraryDirectory() public synchronized java.lang.String
     * javax.management.loading.MLet.getLibraryDirectory()}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#getLibraryDirectory() public synchronized java.lang.String
     * javax.management.loading.MLet.getLibraryDirectory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#getLibraryDirectory() public synchronized java.lang.String
     *      javax.management.loading.MLet.getLibraryDirectory() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getLibraryDirectory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.MLet#getURLs() public java.net.URL[]
     * javax.management.loading.MLet.getURLs()}.
     *
     * <p>
     * Test method for {@link javax.management.loading.MLet#getURLs() public java.net.URL[]
     * javax.management.loading.MLet.getURLs()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#getURLs() public java.net.URL[] javax.management.loading.MLet.getURLs() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getURLs()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.loading.MLet#preRegister(javax.management.MBeanServer, javax.management.ObjectName)
     * public javax.management.ObjectName
     * javax.management.loading.MLet.preRegister(javax.management.MBeanServer,javax.management.ObjectName) throws
     * java.lang.Exception}.
     *
     * <p>
     * Test method for
     * {@link javax.management.loading.MLet#preRegister(javax.management.MBeanServer, javax.management.ObjectName)
     * public javax.management.ObjectName
     * javax.management.loading.MLet.preRegister(javax.management.MBeanServer,javax.management.ObjectName) throws
     * java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.MLet#preRegister(javax.management.MBeanServer, javax.management.ObjectName) public
     *      javax.management.ObjectName
     *      javax.management.loading.MLet.preRegister(javax.management.MBeanServer,javax.management.ObjectName) throws
     *      java.lang.Exception (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_preRegister_MBeanServer_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.loading.MLetMBean#getResourceAsStream(String) interface
     * javax.management.loading.MLetMBean}</li>
     * <li>{@linkplain java.net.URLClassLoader#getResourceAsStream(String) class java.net.URLClassLoader}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResourceAsStream_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.loading.MLetMBean#getResource(String) interface
     * javax.management.loading.MLetMBean}</li>
     * <li>{@linkplain ClassLoader#getResource(String) class java.lang.ClassLoader}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResource_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.loading.MLetMBean#getResources(String) interface
     * javax.management.loading.MLetMBean}</li>
     * <li>{@linkplain ClassLoader#getResources(String) class java.lang.ClassLoader}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResources_String()
    throws Exception {
    }

}
