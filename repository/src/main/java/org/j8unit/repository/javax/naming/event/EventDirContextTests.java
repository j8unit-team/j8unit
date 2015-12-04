package org.j8unit.repository.javax.naming.event;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.naming.event.EventDirContext interface javax.naming.event.EventDirContext},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.event.EventDirContextClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface EventDirContextTests<SUT extends javax.naming.event.EventDirContext>
extends org.j8unit.repository.javax.naming.event.EventContextTests<SUT>,
        org.j8unit.repository.javax.naming.directory.DirContextTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.naming.event.EventDirContext#addNamingListener(java.lang.String,java.lang.String,java.lang.Object[],javax.naming.directory.SearchControls,javax.naming.event.NamingListener) public abstract void javax.naming.event.EventDirContext.addNamingListener(java.lang.String,java.lang.String,java.lang.Object[],javax.naming.directory.SearchControls,javax.naming.event.NamingListener) throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNamingListener_String_String_ObjectArray_SearchControls_NamingListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.event.EventDirContext#addNamingListener(javax.naming.Name,java.lang.String,java.lang.Object[],javax.naming.directory.SearchControls,javax.naming.event.NamingListener) public abstract void javax.naming.event.EventDirContext.addNamingListener(javax.naming.Name,java.lang.String,java.lang.Object[],javax.naming.directory.SearchControls,javax.naming.event.NamingListener) throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNamingListener_Name_String_ObjectArray_SearchControls_NamingListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.event.EventDirContext#addNamingListener(java.lang.String,java.lang.String,javax.naming.directory.SearchControls,javax.naming.event.NamingListener) public abstract void javax.naming.event.EventDirContext.addNamingListener(java.lang.String,java.lang.String,javax.naming.directory.SearchControls,javax.naming.event.NamingListener) throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNamingListener_String_String_SearchControls_NamingListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.event.EventDirContext#addNamingListener(javax.naming.Name,java.lang.String,javax.naming.directory.SearchControls,javax.naming.event.NamingListener) public abstract void javax.naming.event.EventDirContext.addNamingListener(javax.naming.Name,java.lang.String,javax.naming.directory.SearchControls,javax.naming.event.NamingListener) throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNamingListener_Name_String_SearchControls_NamingListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
