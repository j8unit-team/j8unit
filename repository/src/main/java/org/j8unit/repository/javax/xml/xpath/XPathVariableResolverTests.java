package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.xpath.XPathVariableResolver interface
 * javax.xml.xpath.XPathVariableResolver}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link XPathVariableResolverClassTests}.
 * </p>
 *
 * @see javax.xml.xpath.XPathVariableResolver interface javax.xml.xpath.XPathVariableResolver (the hereby targeted
 *      class-under-test class)
 * @see XPathVariableResolverClassTests XPathVariableResolverClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XPathVariableResolverTests<SUT extends javax.xml.xpath.XPathVariableResolver>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPathVariableResolver#resolveVariable(javax.xml.namespace.QName) public
     * abstract java.lang.Object javax.xml.xpath.XPathVariableResolver.resolveVariable(javax.xml.namespace.QName)}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPathVariableResolver#resolveVariable(javax.xml.namespace.QName) public
     * abstract java.lang.Object javax.xml.xpath.XPathVariableResolver.resolveVariable(javax.xml.namespace.QName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPathVariableResolver#resolveVariable(javax.xml.namespace.QName) public abstract
     *      java.lang.Object javax.xml.xpath.XPathVariableResolver.resolveVariable(javax.xml.namespace.QName) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resolveVariable_QName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
