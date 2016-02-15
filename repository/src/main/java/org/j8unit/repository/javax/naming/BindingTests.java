package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.Binding class javax.naming.Binding}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link BindingClassTests}.
 * </p>
 *
 * @see javax.naming.Binding class javax.naming.Binding (the hereby targeted class-under-test class)
 * @see BindingClassTests BindingClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BindingTests<SUT extends javax.naming.Binding>
extends NameClassPairTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.Binding#toString() public java.lang.String javax.naming.Binding.toString()}.
     *
     * <p>
     * Test method for {@link javax.naming.Binding#toString() public java.lang.String javax.naming.Binding.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.Binding#toString() public java.lang.String javax.naming.Binding.toString() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.Binding#getClassName() public java.lang.String
     * javax.naming.Binding.getClassName()}.
     *
     * <p>
     * Test method for {@link javax.naming.Binding#getClassName() public java.lang.String
     * javax.naming.Binding.getClassName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.Binding#getClassName() public java.lang.String javax.naming.Binding.getClassName() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getClassName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.Binding#setObject(Object) public void
     * javax.naming.Binding.setObject(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.naming.Binding#setObject(Object) public void
     * javax.naming.Binding.setObject(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.Binding#setObject(Object) public void javax.naming.Binding.setObject(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setObject_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.Binding#getObject() public java.lang.Object javax.naming.Binding.getObject()}
     * .
     *
     * <p>
     * Test method for {@link javax.naming.Binding#getObject() public java.lang.Object javax.naming.Binding.getObject()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.Binding#getObject() public java.lang.Object javax.naming.Binding.getObject() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
