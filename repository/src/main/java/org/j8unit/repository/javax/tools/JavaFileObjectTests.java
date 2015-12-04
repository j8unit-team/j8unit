package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.tools.JavaFileObject interface javax.tools.JavaFileObject}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.tools.JavaFileObjectClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface JavaFileObjectTests<SUT extends javax.tools.JavaFileObject>
extends org.j8unit.repository.javax.tools.FileObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.tools.JavaFileObject$Kind class javax.tools.JavaFileObject$Kind}, containing all
     * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.tools.JavaFileObjectClassTests.KindClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface KindTests<SUT extends javax.tools.JavaFileObject.Kind>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.tools.JavaFileObject.Kind> {

    }

    /**
     * <p>
     * Test method for {@link javax.tools.JavaFileObject#getAccessLevel() public abstract
     * javax.lang.model.element.Modifier javax.tools.JavaFileObject.getAccessLevel()}.
     * </p>
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
     * Test method for {@link javax.tools.JavaFileObject#getKind() public abstract javax.tools.JavaFileObject$Kind
     * javax.tools.JavaFileObject.getKind()}.
     * </p>
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
     * Test method for {@link javax.tools.JavaFileObject#getNestingKind() public abstract
     * javax.lang.model.element.NestingKind javax.tools.JavaFileObject.getNestingKind()}.
     * </p>
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
     * Test method for
     * {@link javax.tools.JavaFileObject#isNameCompatible(java.lang.String,javax.tools.JavaFileObject.Kind) public
     * abstract boolean javax.tools.JavaFileObject.isNameCompatible(java.lang.String,javax.tools.JavaFileObject$Kind)}.
     * </p>
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

}
