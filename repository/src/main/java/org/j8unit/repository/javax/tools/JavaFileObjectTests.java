package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.tools.JavaFileObject interface javax.tools.JavaFileObject}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JavaFileObjectClassTests}.
 * </p>
 *
 * @see javax.tools.JavaFileObject interface javax.tools.JavaFileObject (the hereby targeted class-under-test class)
 * @see JavaFileObjectClassTests JavaFileObjectClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JavaFileObjectTests<SUT extends javax.tools.JavaFileObject>
extends FileObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.tools.JavaFileObject#getAccessLevel() public abstract
     * javax.lang.model.element.Modifier javax.tools.JavaFileObject.getAccessLevel()}.
     *
     * <p>
     * Test method for {@link javax.tools.JavaFileObject#getAccessLevel() public abstract
     * javax.lang.model.element.Modifier javax.tools.JavaFileObject.getAccessLevel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.JavaFileObject#getAccessLevel() public abstract javax.lang.model.element.Modifier
     *      javax.tools.JavaFileObject.getAccessLevel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAccessLevel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.JavaFileObject#getNestingKind() public abstract
     * javax.lang.model.element.NestingKind javax.tools.JavaFileObject.getNestingKind()}.
     *
     * <p>
     * Test method for {@link javax.tools.JavaFileObject#getNestingKind() public abstract
     * javax.lang.model.element.NestingKind javax.tools.JavaFileObject.getNestingKind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.JavaFileObject#getNestingKind() public abstract javax.lang.model.element.NestingKind
     *      javax.tools.JavaFileObject.getNestingKind() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.tools.JavaFileObject#getKind() public abstract javax.tools.JavaFileObject$Kind
     * javax.tools.JavaFileObject.getKind()}.
     *
     * <p>
     * Test method for {@link javax.tools.JavaFileObject#getKind() public abstract javax.tools.JavaFileObject$Kind
     * javax.tools.JavaFileObject.getKind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.JavaFileObject#getKind() public abstract javax.tools.JavaFileObject$Kind
     *      javax.tools.JavaFileObject.getKind() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.JavaFileObject#isNameCompatible(String, javax.tools.JavaFileObject.Kind)
     * public abstract boolean
     * javax.tools.JavaFileObject.isNameCompatible(java.lang.String,javax.tools.JavaFileObject$Kind)}.
     *
     * <p>
     * Test method for {@link javax.tools.JavaFileObject#isNameCompatible(String, javax.tools.JavaFileObject.Kind)
     * public abstract boolean
     * javax.tools.JavaFileObject.isNameCompatible(java.lang.String,javax.tools.JavaFileObject$Kind)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.JavaFileObject#isNameCompatible(String, javax.tools.JavaFileObject.Kind) public abstract boolean
     *      javax.tools.JavaFileObject.isNameCompatible(java.lang.String,javax.tools.JavaFileObject$Kind) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isNameCompatible_String_Kind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.tools.JavaFileObject.Kind class javax.tools.JavaFileObject$Kind}
     * . The complementary j8unit test interface containing the class relevant aspects is
     * {@link JavaFileObjectClassTests.KindClassTests}.
     * </p>
     *
     * @see javax.tools.JavaFileObject.Kind class javax.tools.JavaFileObject$Kind (the hereby targeted class-under-test
     *      class)
     * @see JavaFileObjectClassTests.KindClassTests JavaFileObjectClassTests.KindClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KindTests<SUT extends javax.tools.JavaFileObject.Kind>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.tools.JavaFileObject.Kind> {

    }

}
