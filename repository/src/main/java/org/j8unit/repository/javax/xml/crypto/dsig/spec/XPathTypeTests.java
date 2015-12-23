package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.crypto.dsig.spec.XPathType class
 * javax.xml.crypto.dsig.spec.XPathType}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XPathTypeTests<SUT extends javax.xml.crypto.dsig.spec.XPathType>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.xml.crypto.dsig.spec.XPathType.Filter class
     * javax.xml.crypto.dsig.spec.XPathType$Filter}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeTests.FilterTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeClassTests.FilterClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType.Filter
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FilterTests<SUT extends javax.xml.crypto.dsig.spec.XPathType.Filter>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.xml.crypto.dsig.spec.XPathType.Filter#toString() public java.lang.String
         * javax.xml.crypto.dsig.spec.XPathType$Filter.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType.Filter#toString()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType#getExpression()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType#getFilter()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType#getNamespaceMap()
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
