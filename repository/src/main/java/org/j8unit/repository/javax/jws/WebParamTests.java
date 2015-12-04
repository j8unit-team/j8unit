package org.j8unit.repository.javax.jws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.jws.WebParam interface javax.jws.WebParam}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.jws.WebParamClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WebParamTests<SUT extends javax.jws.WebParam>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.jws.WebParam$Mode class javax.jws.WebParam$Mode}, containing all instance relevant
     * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.jws.WebParamClassTests.ModeClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ModeTests<SUT extends javax.jws.WebParam.Mode>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.jws.WebParam.Mode> {

    }

    /**
     * <p>
     * Test method for {@link javax.jws.WebParam#header() public abstract boolean javax.jws.WebParam.header()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_header()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.jws.WebParam#mode() public abstract javax.jws.WebParam$Mode
     * javax.jws.WebParam.mode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.jws.WebParam#name() public abstract java.lang.String javax.jws.WebParam.name()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.jws.WebParam#partName() public abstract java.lang.String
     * javax.jws.WebParam.partName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_partName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.jws.WebParam#targetNamespace() public abstract java.lang.String
     * javax.jws.WebParam.targetNamespace()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_targetNamespace()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
