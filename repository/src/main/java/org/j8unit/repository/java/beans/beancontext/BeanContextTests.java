package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.beans.beancontext.BeanContext interface java.beans.beancontext.BeanContext},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BeanContextTests<SUT extends java.beans.beancontext.BeanContext>
extends org.j8unit.repository.java.beans.beancontext.BeanContextChildTests<SUT>,
        org.j8unit.repository.java.util.CollectionTests<SUT>,
        org.j8unit.repository.java.beans.DesignModeTests<SUT>,
        org.j8unit.repository.java.beans.VisibilityTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContext#getResource(java.lang.String,java.beans.beancontext.BeanContextChild) public abstract java.net.URL java.beans.beancontext.BeanContext.getResource(java.lang.String,java.beans.beancontext.BeanContextChild) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResource_String_BeanContextChild() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContext#addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener) public abstract void java.beans.beancontext.BeanContext.addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addBeanContextMembershipListener_BeanContextMembershipListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContext#getResourceAsStream(java.lang.String,java.beans.beancontext.BeanContextChild) public abstract java.io.InputStream java.beans.beancontext.BeanContext.getResourceAsStream(java.lang.String,java.beans.beancontext.BeanContextChild) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResourceAsStream_String_BeanContextChild() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContext#removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener) public abstract void java.beans.beancontext.BeanContext.removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeBeanContextMembershipListener_BeanContextMembershipListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContext#instantiateChild(java.lang.String) public abstract java.lang.Object java.beans.beancontext.BeanContext.instantiateChild(java.lang.String) throws java.io.IOException,java.lang.ClassNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_instantiateChild_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
