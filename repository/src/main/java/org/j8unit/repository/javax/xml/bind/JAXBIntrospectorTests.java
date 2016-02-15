package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.JAXBIntrospector class javax.xml.bind.JAXBIntrospector}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link JAXBIntrospectorClassTests}.
 * </p>
 *
 * @see javax.xml.bind.JAXBIntrospector class javax.xml.bind.JAXBIntrospector (the hereby targeted class-under-test
 *      class)
 * @see JAXBIntrospectorClassTests JAXBIntrospectorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JAXBIntrospectorTests<SUT extends javax.xml.bind.JAXBIntrospector>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBIntrospector#getElementName(Object) public abstract
     * javax.xml.namespace.QName javax.xml.bind.JAXBIntrospector.getElementName(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBIntrospector#getElementName(Object) public abstract
     * javax.xml.namespace.QName javax.xml.bind.JAXBIntrospector.getElementName(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBIntrospector#getElementName(Object) public abstract javax.xml.namespace.QName
     *      javax.xml.bind.JAXBIntrospector.getElementName(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementName_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBIntrospector#isElement(Object) public abstract boolean
     * javax.xml.bind.JAXBIntrospector.isElement(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBIntrospector#isElement(Object) public abstract boolean
     * javax.xml.bind.JAXBIntrospector.isElement(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBIntrospector#isElement(Object) public abstract boolean
     *      javax.xml.bind.JAXBIntrospector.isElement(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isElement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
