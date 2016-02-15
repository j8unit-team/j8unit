package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.type.DeclaredType interface
 * javax.lang.model.type.DeclaredType}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DeclaredTypeClassTests}.
 * </p>
 *
 * @see javax.lang.model.type.DeclaredType interface javax.lang.model.type.DeclaredType (the hereby targeted
 *      class-under-test class)
 * @see DeclaredTypeClassTests DeclaredTypeClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DeclaredTypeTests<SUT extends javax.lang.model.type.DeclaredType>
extends ReferenceTypeTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.DeclaredType#getEnclosingType() public abstract
     * javax.lang.model.type.TypeMirror javax.lang.model.type.DeclaredType.getEnclosingType()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.DeclaredType#getEnclosingType() public abstract
     * javax.lang.model.type.TypeMirror javax.lang.model.type.DeclaredType.getEnclosingType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.DeclaredType#getEnclosingType() public abstract javax.lang.model.type.TypeMirror
     *      javax.lang.model.type.DeclaredType.getEnclosingType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnclosingType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.DeclaredType#asElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.type.DeclaredType.asElement()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.DeclaredType#asElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.type.DeclaredType.asElement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.DeclaredType#asElement() public abstract javax.lang.model.element.Element
     *      javax.lang.model.type.DeclaredType.asElement() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_asElement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.DeclaredType#getTypeArguments() public abstract java.util.List<?
     * extends javax.lang.model.type.TypeMirror> javax.lang.model.type.DeclaredType.getTypeArguments()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.DeclaredType#getTypeArguments() public abstract java.util.List
     * javax.lang.model.type.DeclaredType.getTypeArguments()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.DeclaredType#getTypeArguments() public abstract java.util.List
     *      javax.lang.model.type.DeclaredType.getTypeArguments() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTypeArguments()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
