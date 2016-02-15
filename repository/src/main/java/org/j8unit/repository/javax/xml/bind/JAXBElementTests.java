package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.JAXBElement class javax.xml.bind.JAXBElement}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JAXBElementClassTests}.
 * </p>
 *
 * @see javax.xml.bind.JAXBElement class javax.xml.bind.JAXBElement (the hereby targeted class-under-test class)
 * @see JAXBElementClassTests JAXBElementClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JAXBElementTests<SUT extends javax.xml.bind.JAXBElement<T>, T>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#setValue(Object) public void
     * javax.xml.bind.JAXBElement.setValue(T)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#setValue(Object) public void
     * javax.xml.bind.JAXBElement.setValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBElement#setValue(Object) public void
     *      javax.xml.bind.JAXBElement.setValue(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#getName() public javax.xml.namespace.QName
     * javax.xml.bind.JAXBElement.getName()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#getName() public javax.xml.namespace.QName
     * javax.xml.bind.JAXBElement.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBElement#getName() public javax.xml.namespace.QName javax.xml.bind.JAXBElement.getName()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#getValue() public T javax.xml.bind.JAXBElement.getValue()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#getValue() public java.lang.Object
     * javax.xml.bind.JAXBElement.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBElement#getValue() public java.lang.Object javax.xml.bind.JAXBElement.getValue() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#getScope() public java.lang.Class
     * javax.xml.bind.JAXBElement.getScope()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#getScope() public java.lang.Class
     * javax.xml.bind.JAXBElement.getScope()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBElement#getScope() public java.lang.Class javax.xml.bind.JAXBElement.getScope() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getScope()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#isTypeSubstituted() public boolean
     * javax.xml.bind.JAXBElement.isTypeSubstituted()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#isTypeSubstituted() public boolean
     * javax.xml.bind.JAXBElement.isTypeSubstituted()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBElement#isTypeSubstituted() public boolean javax.xml.bind.JAXBElement.isTypeSubstituted()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isTypeSubstituted()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#setNil(boolean) public void
     * javax.xml.bind.JAXBElement.setNil(boolean)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#setNil(boolean) public void
     * javax.xml.bind.JAXBElement.setNil(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBElement#setNil(boolean) public void javax.xml.bind.JAXBElement.setNil(boolean) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNil_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#isGlobalScope() public boolean
     * javax.xml.bind.JAXBElement.isGlobalScope()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#isGlobalScope() public boolean
     * javax.xml.bind.JAXBElement.isGlobalScope()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBElement#isGlobalScope() public boolean javax.xml.bind.JAXBElement.isGlobalScope() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isGlobalScope()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#isNil() public boolean javax.xml.bind.JAXBElement.isNil()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#isNil() public boolean javax.xml.bind.JAXBElement.isNil()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBElement#isNil() public boolean javax.xml.bind.JAXBElement.isNil() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isNil()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#getDeclaredType() public java.lang.Class
     * <T> javax.xml.bind.JAXBElement.getDeclaredType()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBElement#getDeclaredType() public java.lang.Class
     * javax.xml.bind.JAXBElement.getDeclaredType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBElement#getDeclaredType() public java.lang.Class
     *      javax.xml.bind.JAXBElement.getDeclaredType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.xml.bind.JAXBElement.GlobalScope class
     * javax.xml.bind.JAXBElement$GlobalScope}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link JAXBElementClassTests.GlobalScopeClassTests}.
     * </p>
     *
     * @see javax.xml.bind.JAXBElement.GlobalScope class javax.xml.bind.JAXBElement$GlobalScope (the hereby targeted
     *      class-under-test class)
     * @see JAXBElementClassTests.GlobalScopeClassTests JAXBElementClassTests.GlobalScopeClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface GlobalScopeTests<SUT extends javax.xml.bind.JAXBElement.GlobalScope>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    }

}
