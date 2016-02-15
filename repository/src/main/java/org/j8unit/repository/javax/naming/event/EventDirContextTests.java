package org.j8unit.repository.javax.naming.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.event.EventDirContext interface
 * javax.naming.event.EventDirContext}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link EventDirContextClassTests}.
 * </p>
 *
 * @see javax.naming.event.EventDirContext interface javax.naming.event.EventDirContext (the hereby targeted
 *      class-under-test class)
 * @see EventDirContextClassTests EventDirContextClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EventDirContextTests<SUT extends javax.naming.event.EventDirContext>
extends EventContextTests<SUT>, org.j8unit.repository.javax.naming.directory.DirContextTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.naming.event.EventDirContext#addNamingListener(String, String, Object[], javax.naming.directory.SearchControls, javax.naming.event.NamingListener)
     * public abstract void
     * javax.naming.event.EventDirContext.addNamingListener(java.lang.String,java.lang.String,java.lang.Object[],javax.naming.directory.SearchControls,javax.naming.event.NamingListener)
     * throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for
     * {@link javax.naming.event.EventDirContext#addNamingListener(String, String, Object[], javax.naming.directory.SearchControls, javax.naming.event.NamingListener)
     * public abstract void
     * javax.naming.event.EventDirContext.addNamingListener(java.lang.String,java.lang.String,java.lang.Object[],javax.naming.directory.SearchControls,javax.naming.event.NamingListener)
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.event.EventDirContext#addNamingListener(String, String, Object[],
     *      javax.naming.directory.SearchControls, javax.naming.event.NamingListener) public abstract void
     *      javax.naming.event.EventDirContext.addNamingListener(java.lang.String,java.lang.String,java.lang.Object[],
     *      javax.naming.directory.SearchControls,javax.naming.event.NamingListener) throws javax.naming.NamingException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNamingListener_String_String_ObjectArray_SearchControls_NamingListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.event.EventDirContext#addNamingListener(javax.naming.Name, String, Object[], javax.naming.directory.SearchControls, javax.naming.event.NamingListener)
     * public abstract void
     * javax.naming.event.EventDirContext.addNamingListener(javax.naming.Name,java.lang.String,java.lang.Object[],javax.naming.directory.SearchControls,javax.naming.event.NamingListener)
     * throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for
     * {@link javax.naming.event.EventDirContext#addNamingListener(javax.naming.Name, String, Object[], javax.naming.directory.SearchControls, javax.naming.event.NamingListener)
     * public abstract void
     * javax.naming.event.EventDirContext.addNamingListener(javax.naming.Name,java.lang.String,java.lang.Object[],javax.naming.directory.SearchControls,javax.naming.event.NamingListener)
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.event.EventDirContext#addNamingListener(javax.naming.Name, String, Object[],
     *      javax.naming.directory.SearchControls, javax.naming.event.NamingListener) public abstract void
     *      javax.naming.event.EventDirContext.addNamingListener(javax.naming.Name,java.lang.String,java.lang.Object[],
     *      javax.naming.directory.SearchControls,javax.naming.event.NamingListener) throws javax.naming.NamingException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNamingListener_Name_String_ObjectArray_SearchControls_NamingListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.event.EventDirContext#addNamingListener(String, String, javax.naming.directory.SearchControls, javax.naming.event.NamingListener)
     * public abstract void
     * javax.naming.event.EventDirContext.addNamingListener(java.lang.String,java.lang.String,javax.naming.directory.SearchControls,javax.naming.event.NamingListener)
     * throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for
     * {@link javax.naming.event.EventDirContext#addNamingListener(String, String, javax.naming.directory.SearchControls, javax.naming.event.NamingListener)
     * public abstract void
     * javax.naming.event.EventDirContext.addNamingListener(java.lang.String,java.lang.String,javax.naming.directory.SearchControls,javax.naming.event.NamingListener)
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.event.EventDirContext#addNamingListener(String, String, javax.naming.directory.SearchControls,
     *      javax.naming.event.NamingListener) public abstract void
     *      javax.naming.event.EventDirContext.addNamingListener(java.lang.String,java.lang.String,javax.naming.
     *      directory.SearchControls,javax.naming.event.NamingListener) throws javax.naming.NamingException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNamingListener_String_String_SearchControls_NamingListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.event.EventDirContext#addNamingListener(javax.naming.Name, String, javax.naming.directory.SearchControls, javax.naming.event.NamingListener)
     * public abstract void
     * javax.naming.event.EventDirContext.addNamingListener(javax.naming.Name,java.lang.String,javax.naming.directory.SearchControls,javax.naming.event.NamingListener)
     * throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for
     * {@link javax.naming.event.EventDirContext#addNamingListener(javax.naming.Name, String, javax.naming.directory.SearchControls, javax.naming.event.NamingListener)
     * public abstract void
     * javax.naming.event.EventDirContext.addNamingListener(javax.naming.Name,java.lang.String,javax.naming.directory.SearchControls,javax.naming.event.NamingListener)
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.event.EventDirContext#addNamingListener(javax.naming.Name, String,
     *      javax.naming.directory.SearchControls, javax.naming.event.NamingListener) public abstract void
     *      javax.naming.event.EventDirContext.addNamingListener(javax.naming.Name,java.lang.String,javax.naming.
     *      directory.SearchControls,javax.naming.event.NamingListener) throws javax.naming.NamingException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNamingListener_Name_String_SearchControls_NamingListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
