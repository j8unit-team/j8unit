package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.PropertyDescriptor class java.beans.PropertyDescriptor}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PropertyDescriptorClassTests}.
 * </p>
 *
 * @see java.beans.PropertyDescriptor class java.beans.PropertyDescriptor (the hereby targeted class-under-test class)
 * @see PropertyDescriptorClassTests PropertyDescriptorClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PropertyDescriptorTests<SUT extends java.beans.PropertyDescriptor>
extends FeatureDescriptorTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#hashCode() public int
     * java.beans.PropertyDescriptor.hashCode()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#hashCode() public int
     * java.beans.PropertyDescriptor.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#hashCode() public int java.beans.PropertyDescriptor.hashCode() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#equals(Object) public boolean
     * java.beans.PropertyDescriptor.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#equals(Object) public boolean
     * java.beans.PropertyDescriptor.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#equals(Object) public boolean
     *      java.beans.PropertyDescriptor.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#isBound() public boolean
     * java.beans.PropertyDescriptor.isBound()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#isBound() public boolean
     * java.beans.PropertyDescriptor.isBound()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#isBound() public boolean java.beans.PropertyDescriptor.isBound() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isBound()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#setPropertyEditorClass(Class) public void
     * java.beans.PropertyDescriptor.setPropertyEditorClass(java.lang.Class<?>)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#setPropertyEditorClass(Class) public void
     * java.beans.PropertyDescriptor.setPropertyEditorClass(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#setPropertyEditorClass(Class) public void
     *      java.beans.PropertyDescriptor.setPropertyEditorClass(java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPropertyEditorClass_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#isConstrained() public boolean
     * java.beans.PropertyDescriptor.isConstrained()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#isConstrained() public boolean
     * java.beans.PropertyDescriptor.isConstrained()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#isConstrained() public boolean java.beans.PropertyDescriptor.isConstrained()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isConstrained()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#setReadMethod(java.lang.reflect.Method) public synchronized
     * void java.beans.PropertyDescriptor.setReadMethod(java.lang.reflect.Method) throws
     * java.beans.IntrospectionException}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#setReadMethod(java.lang.reflect.Method) public synchronized
     * void java.beans.PropertyDescriptor.setReadMethod(java.lang.reflect.Method) throws
     * java.beans.IntrospectionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#setReadMethod(java.lang.reflect.Method) public synchronized void
     *      java.beans.PropertyDescriptor.setReadMethod(java.lang.reflect.Method) throws
     *      java.beans.IntrospectionException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setReadMethod_Method()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#createPropertyEditor(Object) public
     * java.beans.PropertyEditor java.beans.PropertyDescriptor.createPropertyEditor(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#createPropertyEditor(Object) public
     * java.beans.PropertyEditor java.beans.PropertyDescriptor.createPropertyEditor(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#createPropertyEditor(Object) public java.beans.PropertyEditor
     *      java.beans.PropertyDescriptor.createPropertyEditor(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createPropertyEditor_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#setBound(boolean) public void
     * java.beans.PropertyDescriptor.setBound(boolean)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#setBound(boolean) public void
     * java.beans.PropertyDescriptor.setBound(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#setBound(boolean) public void java.beans.PropertyDescriptor.setBound(boolean)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBound_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#getWriteMethod() public synchronized
     * java.lang.reflect.Method java.beans.PropertyDescriptor.getWriteMethod()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#getWriteMethod() public synchronized
     * java.lang.reflect.Method java.beans.PropertyDescriptor.getWriteMethod()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#getWriteMethod() public synchronized java.lang.reflect.Method
     *      java.beans.PropertyDescriptor.getWriteMethod() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWriteMethod()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#setWriteMethod(java.lang.reflect.Method) public synchronized
     * void java.beans.PropertyDescriptor.setWriteMethod(java.lang.reflect.Method) throws
     * java.beans.IntrospectionException}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#setWriteMethod(java.lang.reflect.Method) public synchronized
     * void java.beans.PropertyDescriptor.setWriteMethod(java.lang.reflect.Method) throws
     * java.beans.IntrospectionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#setWriteMethod(java.lang.reflect.Method) public synchronized void
     *      java.beans.PropertyDescriptor.setWriteMethod(java.lang.reflect.Method) throws
     *      java.beans.IntrospectionException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setWriteMethod_Method()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#setConstrained(boolean) public void
     * java.beans.PropertyDescriptor.setConstrained(boolean)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#setConstrained(boolean) public void
     * java.beans.PropertyDescriptor.setConstrained(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#setConstrained(boolean) public void
     *      java.beans.PropertyDescriptor.setConstrained(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setConstrained_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#getPropertyEditorClass() public java.lang.Class
     * <?> java.beans.PropertyDescriptor.getPropertyEditorClass()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#getPropertyEditorClass() public java.lang.Class
     * java.beans.PropertyDescriptor.getPropertyEditorClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#getPropertyEditorClass() public java.lang.Class
     *      java.beans.PropertyDescriptor.getPropertyEditorClass() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyEditorClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#getPropertyType() public synchronized java.lang.Class
     * <?> java.beans.PropertyDescriptor.getPropertyType()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#getPropertyType() public synchronized java.lang.Class
     * java.beans.PropertyDescriptor.getPropertyType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#getPropertyType() public synchronized java.lang.Class
     *      java.beans.PropertyDescriptor.getPropertyType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#getReadMethod() public synchronized java.lang.reflect.Method
     * java.beans.PropertyDescriptor.getReadMethod()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyDescriptor#getReadMethod() public synchronized java.lang.reflect.Method
     * java.beans.PropertyDescriptor.getReadMethod()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyDescriptor#getReadMethod() public synchronized java.lang.reflect.Method
     *      java.beans.PropertyDescriptor.getReadMethod() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReadMethod()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
