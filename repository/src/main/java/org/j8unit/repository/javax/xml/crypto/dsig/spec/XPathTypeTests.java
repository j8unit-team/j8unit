package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.spec.XPathType class javax.xml.crypto.dsig.spec.XPathType}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XPathTypeTests<SUT extends javax.xml.crypto.dsig.spec.XPathType>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.xml.crypto.dsig.spec.XPathType$Filter class
     * javax.xml.crypto.dsig.spec.XPathType$Filter}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeClassTests.FilterClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FilterTests<SUT extends javax.xml.crypto.dsig.spec.XPathType.Filter>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.xml.crypto.dsig.spec.XPathType.Filter#toString() public java.lang.String
         * javax.xml.crypto.dsig.spec.XPathType$Filter.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.XPathType#getExpression() public java.lang.String
     * javax.xml.crypto.dsig.spec.XPathType.getExpression()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExpression()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.XPathType#getFilter() public
     * javax.xml.crypto.dsig.spec.XPathType$Filter javax.xml.crypto.dsig.spec.XPathType.getFilter()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFilter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.XPathType#getNamespaceMap() public java.util.Map
     * javax.xml.crypto.dsig.spec.XPathType.getNamespaceMap()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNamespaceMap()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
