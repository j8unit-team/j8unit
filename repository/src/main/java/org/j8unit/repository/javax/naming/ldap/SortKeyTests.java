package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.ldap.SortKey class javax.naming.ldap.SortKey}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SortKeyClassTests}.
 * </p>
 *
 * @see javax.naming.ldap.SortKey class javax.naming.ldap.SortKey (the hereby targeted class-under-test class)
 * @see SortKeyClassTests SortKeyClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SortKeyTests<SUT extends javax.naming.ldap.SortKey>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.SortKey#getMatchingRuleID() public java.lang.String
     * javax.naming.ldap.SortKey.getMatchingRuleID()}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.SortKey#getMatchingRuleID() public java.lang.String
     * javax.naming.ldap.SortKey.getMatchingRuleID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.SortKey#getMatchingRuleID() public java.lang.String
     *      javax.naming.ldap.SortKey.getMatchingRuleID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMatchingRuleID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.SortKey#getAttributeID() public java.lang.String
     * javax.naming.ldap.SortKey.getAttributeID()}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.SortKey#getAttributeID() public java.lang.String
     * javax.naming.ldap.SortKey.getAttributeID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.SortKey#getAttributeID() public java.lang.String
     *      javax.naming.ldap.SortKey.getAttributeID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributeID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.SortKey#isAscending() public boolean
     * javax.naming.ldap.SortKey.isAscending()}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.SortKey#isAscending() public boolean
     * javax.naming.ldap.SortKey.isAscending()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.SortKey#isAscending() public boolean javax.naming.ldap.SortKey.isAscending() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAscending()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
