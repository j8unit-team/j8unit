package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.element.TypeElement interface
 * javax.lang.model.element.TypeElement}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link TypeElementClassTests}.
 * </p>
 *
 * @see javax.lang.model.element.TypeElement interface javax.lang.model.element.TypeElement (the hereby targeted
 *      class-under-test class)
 * @see TypeElementClassTests TypeElementClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TypeElementTests<SUT extends javax.lang.model.element.TypeElement>
extends ElementTests<SUT>, ParameterizableTests<SUT>, QualifiedNameableTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getSimpleName() public abstract
     * javax.lang.model.element.Name javax.lang.model.element.TypeElement.getSimpleName()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getSimpleName() public abstract
     * javax.lang.model.element.Name javax.lang.model.element.TypeElement.getSimpleName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.TypeElement#getSimpleName() public abstract javax.lang.model.element.Name
     *      javax.lang.model.element.TypeElement.getSimpleName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSimpleName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getTypeParameters() public abstract java.util.List<?
     * extends javax.lang.model.element.TypeParameterElement> javax.lang.model.element.TypeElement.getTypeParameters()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getTypeParameters() public abstract java.util.List
     * javax.lang.model.element.TypeElement.getTypeParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.TypeElement#getTypeParameters() public abstract java.util.List
     *      javax.lang.model.element.TypeElement.getTypeParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTypeParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getInterfaces() public abstract java.util.List<?
     * extends javax.lang.model.type.TypeMirror> javax.lang.model.element.TypeElement.getInterfaces()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getInterfaces() public abstract java.util.List
     * javax.lang.model.element.TypeElement.getInterfaces()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.TypeElement#getInterfaces() public abstract java.util.List
     *      javax.lang.model.element.TypeElement.getInterfaces() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInterfaces()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getEnclosedElements() public abstract
     * java.util.List<? extends javax.lang.model.element.Element>
     * javax.lang.model.element.TypeElement.getEnclosedElements()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getEnclosedElements() public abstract java.util.List
     * javax.lang.model.element.TypeElement.getEnclosedElements()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.TypeElement#getEnclosedElements() public abstract java.util.List
     *      javax.lang.model.element.TypeElement.getEnclosedElements() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getEnclosedElements()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getSuperclass() public abstract
     * javax.lang.model.type.TypeMirror javax.lang.model.element.TypeElement.getSuperclass()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getSuperclass() public abstract
     * javax.lang.model.type.TypeMirror javax.lang.model.element.TypeElement.getSuperclass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.TypeElement#getSuperclass() public abstract javax.lang.model.type.TypeMirror
     *      javax.lang.model.element.TypeElement.getSuperclass() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSuperclass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getQualifiedName() public abstract
     * javax.lang.model.element.Name javax.lang.model.element.TypeElement.getQualifiedName()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getQualifiedName() public abstract
     * javax.lang.model.element.Name javax.lang.model.element.TypeElement.getQualifiedName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.TypeElement#getQualifiedName() public abstract javax.lang.model.element.Name
     *      javax.lang.model.element.TypeElement.getQualifiedName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getQualifiedName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getEnclosingElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.element.TypeElement.getEnclosingElement()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getEnclosingElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.element.TypeElement.getEnclosingElement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.TypeElement#getEnclosingElement() public abstract javax.lang.model.element.Element
     *      javax.lang.model.element.TypeElement.getEnclosingElement() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getEnclosingElement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getNestingKind() public abstract
     * javax.lang.model.element.NestingKind javax.lang.model.element.TypeElement.getNestingKind()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.TypeElement#getNestingKind() public abstract
     * javax.lang.model.element.NestingKind javax.lang.model.element.TypeElement.getNestingKind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.TypeElement#getNestingKind() public abstract javax.lang.model.element.NestingKind
     *      javax.lang.model.element.TypeElement.getNestingKind() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNestingKind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
