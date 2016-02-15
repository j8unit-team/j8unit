package org.j8unit.repository.javax.management;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.DynamicMBean interface javax.management.DynamicMBean}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link DynamicMBeanClassTests}.
 * </p>
 *
 * @see javax.management.DynamicMBean interface javax.management.DynamicMBean (the hereby targeted class-under-test
 *      class)
 * @see DynamicMBeanClassTests DynamicMBeanClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynamicMBeanTests<SUT extends javax.management.DynamicMBean>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#getMBeanInfo() public abstract javax.management.MBeanInfo
     * javax.management.DynamicMBean.getMBeanInfo()}.
     *
     * <p>
     * Test method for {@link javax.management.DynamicMBean#getMBeanInfo() public abstract javax.management.MBeanInfo
     * javax.management.DynamicMBean.getMBeanInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.DynamicMBean#getMBeanInfo() public abstract javax.management.MBeanInfo
     *      javax.management.DynamicMBean.getMBeanInfo() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#invoke(String, Object[], String[]) public abstract
     * java.lang.Object javax.management.DynamicMBean.invoke(java.lang.String,java.lang.Object[],java.lang.String[])
     * throws javax.management.MBeanException,javax.management.ReflectionException}.
     *
     * <p>
     * Test method for {@link javax.management.DynamicMBean#invoke(String, Object[], String[]) public abstract
     * java.lang.Object javax.management.DynamicMBean.invoke(java.lang.String,java.lang.Object[],java.lang.String[])
     * throws javax.management.MBeanException,javax.management.ReflectionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.DynamicMBean#invoke(String, Object[], String[]) public abstract java.lang.Object
     *      javax.management.DynamicMBean.invoke(java.lang.String,java.lang.Object[],java.lang.String[]) throws
     *      javax.management.MBeanException,javax.management.ReflectionException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_String_ObjectArray_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#setAttributes(javax.management.AttributeList) public
     * abstract javax.management.AttributeList
     * javax.management.DynamicMBean.setAttributes(javax.management.AttributeList)}.
     *
     * <p>
     * Test method for {@link javax.management.DynamicMBean#setAttributes(javax.management.AttributeList) public
     * abstract javax.management.AttributeList
     * javax.management.DynamicMBean.setAttributes(javax.management.AttributeList)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.DynamicMBean#setAttributes(javax.management.AttributeList) public abstract
     *      javax.management.AttributeList javax.management.DynamicMBean.setAttributes(javax.management.AttributeList)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttributes_AttributeList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#setAttribute(javax.management.Attribute) public abstract
     * void javax.management.DynamicMBean.setAttribute(javax.management.Attribute) throws
     * javax.management.AttributeNotFoundException,javax.management.InvalidAttributeValueException,javax.management.MBeanException,javax.management.ReflectionException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.DynamicMBean#setAttribute(javax.management.Attribute) public abstract
     * void javax.management.DynamicMBean.setAttribute(javax.management.Attribute) throws
     * javax.management.AttributeNotFoundException,javax.management.InvalidAttributeValueException,javax.management.MBeanException,javax.management.ReflectionException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.DynamicMBean#setAttribute(javax.management.Attribute) public abstract void
     *      javax.management.DynamicMBean.setAttribute(javax.management.Attribute) throws
     *      javax.management.AttributeNotFoundException,javax.management.InvalidAttributeValueException,javax.management
     *      .MBeanException,javax.management.ReflectionException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttribute_Attribute()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#getAttributes(String[]) public abstract
     * javax.management.AttributeList javax.management.DynamicMBean.getAttributes(java.lang.String[])}.
     *
     * <p>
     * Test method for {@link javax.management.DynamicMBean#getAttributes(String[]) public abstract
     * javax.management.AttributeList javax.management.DynamicMBean.getAttributes(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.DynamicMBean#getAttributes(String[]) public abstract javax.management.AttributeList
     *      javax.management.DynamicMBean.getAttributes(java.lang.String[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#getAttribute(String) public abstract java.lang.Object
     * javax.management.DynamicMBean.getAttribute(java.lang.String) throws
     * javax.management.AttributeNotFoundException,javax.management.MBeanException,javax.management.ReflectionException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.DynamicMBean#getAttribute(String) public abstract java.lang.Object
     * javax.management.DynamicMBean.getAttribute(java.lang.String) throws
     * javax.management.AttributeNotFoundException,javax.management.MBeanException,javax.management.ReflectionException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.DynamicMBean#getAttribute(String) public abstract java.lang.Object
     *      javax.management.DynamicMBean.getAttribute(java.lang.String) throws
     *      javax.management.AttributeNotFoundException,javax.management.MBeanException,javax.management.
     *      ReflectionException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttribute_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
