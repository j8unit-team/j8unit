package org.j8unit.repository.javax.management;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.DynamicMBean interface javax.management.DynamicMBean},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.DynamicMBeanClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynamicMBeanTests<SUT extends javax.management.DynamicMBean>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#getMBeanInfo() public abstract javax.management.MBeanInfo javax.management.DynamicMBean.getMBeanInfo()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanInfo() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#invoke(java.lang.String,java.lang.Object[],java.lang.String[]) public abstract java.lang.Object javax.management.DynamicMBean.invoke(java.lang.String,java.lang.Object[],java.lang.String[]) throws javax.management.MBeanException,javax.management.ReflectionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_String_ObjectArray_StringArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#setAttributes(javax.management.AttributeList) public abstract javax.management.AttributeList javax.management.DynamicMBean.setAttributes(javax.management.AttributeList)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttributes_AttributeList() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#setAttribute(javax.management.Attribute) public abstract void javax.management.DynamicMBean.setAttribute(javax.management.Attribute) throws javax.management.AttributeNotFoundException,javax.management.InvalidAttributeValueException,javax.management.MBeanException,javax.management.ReflectionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttribute_Attribute() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#getAttributes(java.lang.String[]) public abstract javax.management.AttributeList javax.management.DynamicMBean.getAttributes(java.lang.String[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes_StringArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.DynamicMBean#getAttribute(java.lang.String) public abstract java.lang.Object javax.management.DynamicMBean.getAttribute(java.lang.String) throws javax.management.AttributeNotFoundException,javax.management.MBeanException,javax.management.ReflectionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttribute_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
