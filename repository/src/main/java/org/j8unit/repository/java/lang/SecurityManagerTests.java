package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain SecurityManager class java.lang.SecurityManager}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link SecurityManagerClassTests}.
 * </p>
 *
 * @see SecurityManager class java.lang.SecurityManager (the hereby targeted class-under-test class)
 * @see SecurityManagerClassTests SecurityManagerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecurityManagerTests<SUT extends SecurityManager>
extends ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link SecurityManager#checkAccess(ThreadGroup) public void
     * java.lang.SecurityManager.checkAccess(java.lang.ThreadGroup)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkAccess(ThreadGroup) public void
     * java.lang.SecurityManager.checkAccess(java.lang.ThreadGroup)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkAccess(ThreadGroup) public void
     *      java.lang.SecurityManager.checkAccess(java.lang.ThreadGroup) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkAccess_ThreadGroup()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkAccess(Thread) public void
     * java.lang.SecurityManager.checkAccess(java.lang.Thread)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkAccess(Thread) public void
     * java.lang.SecurityManager.checkAccess(java.lang.Thread)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkAccess(Thread) public void java.lang.SecurityManager.checkAccess(java.lang.Thread) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkAccess_Thread()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkListen(int) public void java.lang.SecurityManager.checkListen(int)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkListen(int) public void java.lang.SecurityManager.checkListen(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkListen(int) public void java.lang.SecurityManager.checkListen(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkListen_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkSecurityAccess(String) public void
     * java.lang.SecurityManager.checkSecurityAccess(java.lang.String)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkSecurityAccess(String) public void
     * java.lang.SecurityManager.checkSecurityAccess(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkSecurityAccess(String) public void
     *      java.lang.SecurityManager.checkSecurityAccess(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkSecurityAccess_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkPropertyAccess(String) public void
     * java.lang.SecurityManager.checkPropertyAccess(java.lang.String)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkPropertyAccess(String) public void
     * java.lang.SecurityManager.checkPropertyAccess(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkPropertyAccess(String) public void
     *      java.lang.SecurityManager.checkPropertyAccess(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkPropertyAccess_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkRead(String) public void
     * java.lang.SecurityManager.checkRead(java.lang.String)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkRead(String) public void
     * java.lang.SecurityManager.checkRead(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkRead(String) public void java.lang.SecurityManager.checkRead(java.lang.String) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkRead_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkRead(String, Object) public void
     * java.lang.SecurityManager.checkRead(java.lang.String,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkRead(String, Object) public void
     * java.lang.SecurityManager.checkRead(java.lang.String,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkRead(String, Object) public void
     *      java.lang.SecurityManager.checkRead(java.lang.String,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkRead_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkRead(java.io.FileDescriptor) public void
     * java.lang.SecurityManager.checkRead(java.io.FileDescriptor)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkRead(java.io.FileDescriptor) public void
     * java.lang.SecurityManager.checkRead(java.io.FileDescriptor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkRead(java.io.FileDescriptor) public void
     *      java.lang.SecurityManager.checkRead(java.io.FileDescriptor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkRead_FileDescriptor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkSystemClipboardAccess() public void
     * java.lang.SecurityManager.checkSystemClipboardAccess()}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkSystemClipboardAccess() public void
     * java.lang.SecurityManager.checkSystemClipboardAccess()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkSystemClipboardAccess() public void
     *      java.lang.SecurityManager.checkSystemClipboardAccess() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkSystemClipboardAccess()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkPackageDefinition(String) public void
     * java.lang.SecurityManager.checkPackageDefinition(java.lang.String)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkPackageDefinition(String) public void
     * java.lang.SecurityManager.checkPackageDefinition(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkPackageDefinition(String) public void
     *      java.lang.SecurityManager.checkPackageDefinition(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkPackageDefinition_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#getSecurityContext() public java.lang.Object
     * java.lang.SecurityManager.getSecurityContext()}.
     *
     * <p>
     * Test method for {@link SecurityManager#getSecurityContext() public java.lang.Object
     * java.lang.SecurityManager.getSecurityContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#getSecurityContext() public java.lang.Object java.lang.SecurityManager.getSecurityContext()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSecurityContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#getInCheck() public boolean java.lang.SecurityManager.getInCheck()}.
     *
     * <p>
     * Test method for {@link SecurityManager#getInCheck() public boolean java.lang.SecurityManager.getInCheck()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#getInCheck() public boolean java.lang.SecurityManager.getInCheck() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInCheck()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkExit(int) public void java.lang.SecurityManager.checkExit(int)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkExit(int) public void java.lang.SecurityManager.checkExit(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkExit(int) public void java.lang.SecurityManager.checkExit(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkExit_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkCreateClassLoader() public void
     * java.lang.SecurityManager.checkCreateClassLoader()}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkCreateClassLoader() public void
     * java.lang.SecurityManager.checkCreateClassLoader()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkCreateClassLoader() public void java.lang.SecurityManager.checkCreateClassLoader() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkCreateClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkPropertiesAccess() public void
     * java.lang.SecurityManager.checkPropertiesAccess()}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkPropertiesAccess() public void
     * java.lang.SecurityManager.checkPropertiesAccess()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkPropertiesAccess() public void java.lang.SecurityManager.checkPropertiesAccess() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkPropertiesAccess()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkPackageAccess(String) public void
     * java.lang.SecurityManager.checkPackageAccess(java.lang.String)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkPackageAccess(String) public void
     * java.lang.SecurityManager.checkPackageAccess(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkPackageAccess(String) public void
     *      java.lang.SecurityManager.checkPackageAccess(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkPackageAccess_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkDelete(String) public void
     * java.lang.SecurityManager.checkDelete(java.lang.String)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkDelete(String) public void
     * java.lang.SecurityManager.checkDelete(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkDelete(String) public void java.lang.SecurityManager.checkDelete(java.lang.String) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkDelete_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkTopLevelWindow(Object) public boolean
     * java.lang.SecurityManager.checkTopLevelWindow(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkTopLevelWindow(Object) public boolean
     * java.lang.SecurityManager.checkTopLevelWindow(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkTopLevelWindow(Object) public boolean
     *      java.lang.SecurityManager.checkTopLevelWindow(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkTopLevelWindow_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkPrintJobAccess() public void
     * java.lang.SecurityManager.checkPrintJobAccess()}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkPrintJobAccess() public void
     * java.lang.SecurityManager.checkPrintJobAccess()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkPrintJobAccess() public void java.lang.SecurityManager.checkPrintJobAccess() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkPrintJobAccess()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkExec(String) public void
     * java.lang.SecurityManager.checkExec(java.lang.String)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkExec(String) public void
     * java.lang.SecurityManager.checkExec(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkExec(String) public void java.lang.SecurityManager.checkExec(java.lang.String) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkExec_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#getThreadGroup() public java.lang.ThreadGroup
     * java.lang.SecurityManager.getThreadGroup()}.
     *
     * <p>
     * Test method for {@link SecurityManager#getThreadGroup() public java.lang.ThreadGroup
     * java.lang.SecurityManager.getThreadGroup()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#getThreadGroup() public java.lang.ThreadGroup java.lang.SecurityManager.getThreadGroup()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getThreadGroup()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkAwtEventQueueAccess() public void
     * java.lang.SecurityManager.checkAwtEventQueueAccess()}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkAwtEventQueueAccess() public void
     * java.lang.SecurityManager.checkAwtEventQueueAccess()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkAwtEventQueueAccess() public void java.lang.SecurityManager.checkAwtEventQueueAccess()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkAwtEventQueueAccess()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkWrite(String) public void
     * java.lang.SecurityManager.checkWrite(java.lang.String)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkWrite(String) public void
     * java.lang.SecurityManager.checkWrite(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkWrite(String) public void java.lang.SecurityManager.checkWrite(java.lang.String) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkWrite_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkWrite(java.io.FileDescriptor) public void
     * java.lang.SecurityManager.checkWrite(java.io.FileDescriptor)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkWrite(java.io.FileDescriptor) public void
     * java.lang.SecurityManager.checkWrite(java.io.FileDescriptor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkWrite(java.io.FileDescriptor) public void
     *      java.lang.SecurityManager.checkWrite(java.io.FileDescriptor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkWrite_FileDescriptor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkLink(String) public void
     * java.lang.SecurityManager.checkLink(java.lang.String)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkLink(String) public void
     * java.lang.SecurityManager.checkLink(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkLink(String) public void java.lang.SecurityManager.checkLink(java.lang.String) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkLink_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkSetFactory() public void java.lang.SecurityManager.checkSetFactory()}
     * .
     *
     * <p>
     * Test method for {@link SecurityManager#checkSetFactory() public void java.lang.SecurityManager.checkSetFactory()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkSetFactory() public void java.lang.SecurityManager.checkSetFactory() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkSetFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkConnect(String, int, Object) public void
     * java.lang.SecurityManager.checkConnect(java.lang.String,int,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkConnect(String, int, Object) public void
     * java.lang.SecurityManager.checkConnect(java.lang.String,int,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkConnect(String, int, Object) public void
     *      java.lang.SecurityManager.checkConnect(java.lang.String,int,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkConnect_String_int_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkConnect(String, int) public void
     * java.lang.SecurityManager.checkConnect(java.lang.String,int)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkConnect(String, int) public void
     * java.lang.SecurityManager.checkConnect(java.lang.String,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkConnect(String, int) public void
     *      java.lang.SecurityManager.checkConnect(java.lang.String,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkConnect_String_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkAccept(String, int) public void
     * java.lang.SecurityManager.checkAccept(java.lang.String,int)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkAccept(String, int) public void
     * java.lang.SecurityManager.checkAccept(java.lang.String,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkAccept(String, int) public void
     *      java.lang.SecurityManager.checkAccept(java.lang.String,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkAccept_String_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkMemberAccess(Class, int) public void
     * java.lang.SecurityManager.checkMemberAccess(java.lang.Class<?>,int)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkMemberAccess(Class, int) public void
     * java.lang.SecurityManager.checkMemberAccess(java.lang.Class,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkMemberAccess(Class, int) public void
     *      java.lang.SecurityManager.checkMemberAccess(java.lang.Class,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkMemberAccess_Class_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkPermission(java.security.Permission, Object) public void
     * java.lang.SecurityManager.checkPermission(java.security.Permission,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkPermission(java.security.Permission, Object) public void
     * java.lang.SecurityManager.checkPermission(java.security.Permission,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkPermission(java.security.Permission, Object) public void
     *      java.lang.SecurityManager.checkPermission(java.security.Permission,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkPermission_Permission_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkPermission(java.security.Permission) public void
     * java.lang.SecurityManager.checkPermission(java.security.Permission)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkPermission(java.security.Permission) public void
     * java.lang.SecurityManager.checkPermission(java.security.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkPermission(java.security.Permission) public void
     *      java.lang.SecurityManager.checkPermission(java.security.Permission) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkPermission_Permission()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkMulticast(java.net.InetAddress, byte) public void
     * java.lang.SecurityManager.checkMulticast(java.net.InetAddress,byte)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkMulticast(java.net.InetAddress, byte) public void
     * java.lang.SecurityManager.checkMulticast(java.net.InetAddress,byte)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkMulticast(java.net.InetAddress, byte) public void
     *      java.lang.SecurityManager.checkMulticast(java.net.InetAddress,byte) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkMulticast_InetAddress_byte()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link SecurityManager#checkMulticast(java.net.InetAddress) public void
     * java.lang.SecurityManager.checkMulticast(java.net.InetAddress)}.
     *
     * <p>
     * Test method for {@link SecurityManager#checkMulticast(java.net.InetAddress) public void
     * java.lang.SecurityManager.checkMulticast(java.net.InetAddress)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see SecurityManager#checkMulticast(java.net.InetAddress) public void
     *      java.lang.SecurityManager.checkMulticast(java.net.InetAddress) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkMulticast_InetAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
