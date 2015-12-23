package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.beancontext.BeanContext interface
 * java.beans.beancontext.BeanContext}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.beans.beancontext.BeanContextTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.beancontext.BeanContext
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextTests<SUT extends java.beans.beancontext.BeanContext>
extends org.j8unit.repository.java.beans.beancontext.BeanContextChildTests, org.j8unit.repository.java.util.CollectionTests,
org.j8unit.repository.java.beans.DesignModeTests, org.j8unit.repository.java.beans.VisibilityTests {

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of this 8Unit test interface
    // (caused by the "rawtypes" nature of the class-under-test).
    @Override
    public abstract SUT createNewSUT();

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContext#addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     * public abstract void
     * java.beans.beancontext.BeanContext.addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContext#addBeanContextMembershipListener(java.beans.beancontext.
     *             BeanContextMembershipListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addBeanContextMembershipListener_BeanContextMembershipListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContext#getResource(java.lang.String, java.beans.beancontext.BeanContextChild)
     * public abstract java.net.URL
     * java.beans.beancontext.BeanContext.getResource(java.lang.String,java.beans.beancontext.BeanContextChild) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContext#getResource(java.lang.String,
     *             java.beans.beancontext.BeanContextChild)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResource_String_BeanContextChild()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContext#getResourceAsStream(java.lang.String, java.beans.beancontext.BeanContextChild)
     * public abstract java.io.InputStream
     * java.beans.beancontext.BeanContext.getResourceAsStream(java.lang.String,java.beans.beancontext.BeanContextChild)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContext#getResourceAsStream(java.lang.String,
     *             java.beans.beancontext.BeanContextChild)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResourceAsStream_String_BeanContextChild()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContext#instantiateChild(java.lang.String) public abstract
     * java.lang.Object java.beans.beancontext.BeanContext.instantiateChild(java.lang.String) throws
     * java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContext#instantiateChild(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_instantiateChild_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContext#removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     * public abstract void
     * java.beans.beancontext.BeanContext.removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContext#removeBeanContextMembershipListener(java.beans.beancontext.
     *             BeanContextMembershipListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeBeanContextMembershipListener_BeanContextMembershipListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
