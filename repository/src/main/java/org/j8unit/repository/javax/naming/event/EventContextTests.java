package org.j8unit.repository.javax.naming.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.event.EventContext interface javax.naming.event.EventContext}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.event.EventContextClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EventContextTests<SUT extends javax.naming.event.EventContext>
extends org.j8unit.repository.javax.naming.ContextTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.naming.event.EventContext#addNamingListener(javax.naming.Name,int,javax.naming.event.NamingListener)
     * public abstract void
     * javax.naming.event.EventContext.addNamingListener(javax.naming.Name,int,javax.naming.event.NamingListener) throws
     * javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNamingListener_Name_int_NamingListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.event.EventContext#addNamingListener(java.lang.String,int,javax.naming.event.NamingListener)
     * public abstract void
     * javax.naming.event.EventContext.addNamingListener(java.lang.String,int,javax.naming.event.NamingListener) throws
     * javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNamingListener_String_int_NamingListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.event.EventContext#removeNamingListener(javax.naming.event.NamingListener)
     * public abstract void javax.naming.event.EventContext.removeNamingListener(javax.naming.event.NamingListener)
     * throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeNamingListener_NamingListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.event.EventContext#targetMustExist() public abstract boolean
     * javax.naming.event.EventContext.targetMustExist() throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_targetMustExist()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
