package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.beancontext.BeanContextServices interface
 * java.beans.beancontext.BeanContextServices}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.beans.beancontext.BeanContextServicesTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextServicesClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.beancontext.BeanContextServices
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextServicesTests<SUT extends java.beans.beancontext.BeanContextServices>
extends org.j8unit.repository.java.beans.beancontext.BeanContextTests, org.j8unit.repository.java.beans.beancontext.BeanContextServicesListenerTests {

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of this 8Unit test interface
    // (caused by the "rawtypes" nature of the class-under-test).
    @Override
    public abstract SUT createNewSUT();

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServices#addBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)
     * public abstract void
     * java.beans.beancontext.BeanContextServices.addBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServices#addBeanContextServicesListener(java.beans.beancontext.
     *             BeanContextServicesListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addBeanContextServicesListener_BeanContextServicesListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServices#addService(java.lang.Class, java.beans.beancontext.BeanContextServiceProvider)
     * public abstract boolean
     * java.beans.beancontext.BeanContextServices.addService(java.lang.Class,java.beans.beancontext.BeanContextServiceProvider)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServices#addService(java.lang.Class,
     *             java.beans.beancontext.BeanContextServiceProvider)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addService_Class_BeanContextServiceProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#getCurrentServiceClasses() public abstract
     * java.util.Iterator java.beans.beancontext.BeanContextServices.getCurrentServiceClasses()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServices#getCurrentServiceClasses()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCurrentServiceClasses()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#getCurrentServiceSelectors(java.lang.Class)
     * public abstract java.util.Iterator
     * java.beans.beancontext.BeanContextServices.getCurrentServiceSelectors(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServices#getCurrentServiceSelectors(java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCurrentServiceSelectors_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServices#getService(java.beans.beancontext.BeanContextChild, java.lang.Object, java.lang.Class, java.lang.Object, java.beans.beancontext.BeanContextServiceRevokedListener)
     * public abstract java.lang.Object
     * java.beans.beancontext.BeanContextServices.getService(java.beans.beancontext.BeanContextChild,java.lang.Object,java.lang.Class,java.lang.Object,java.beans.beancontext.BeanContextServiceRevokedListener)
     * throws java.util.TooManyListenersException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServices#getService(java.beans.beancontext.BeanContextChild,
     *             java.lang.Object, java.lang.Class, java.lang.Object,
     *             java.beans.beancontext.BeanContextServiceRevokedListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getService_BeanContextChild_Object_Class_Object_BeanContextServiceRevokedListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#hasService(java.lang.Class) public abstract
     * boolean java.beans.beancontext.BeanContextServices.hasService(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServices#hasService(java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasService_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServices#releaseService(java.beans.beancontext.BeanContextChild, java.lang.Object, java.lang.Object)
     * public abstract void
     * java.beans.beancontext.BeanContextServices.releaseService(java.beans.beancontext.BeanContextChild,java.lang.Object,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServices#releaseService(java.beans.beancontext.BeanContextChild,
     *             java.lang.Object, java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_releaseService_BeanContextChild_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServices#removeBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)
     * public abstract void
     * java.beans.beancontext.BeanContextServices.removeBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServices#removeBeanContextServicesListener(java.beans.beancontext.
     *             BeanContextServicesListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeBeanContextServicesListener_BeanContextServicesListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServices#revokeService(java.lang.Class, java.beans.beancontext.BeanContextServiceProvider, boolean)
     * public abstract void
     * java.beans.beancontext.BeanContextServices.revokeService(java.lang.Class,java.beans.beancontext.BeanContextServiceProvider,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServices#revokeService(java.lang.Class,
     *             java.beans.beancontext.BeanContextServiceProvider, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_revokeService_Class_BeanContextServiceProvider_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
