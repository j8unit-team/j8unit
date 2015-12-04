package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.xpath.XPathFunctionResolver interface javax.xml.xpath.XPathFunctionResolver},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.xpath.XPathFunctionResolverClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XPathFunctionResolverTests<SUT extends javax.xml.xpath.XPathFunctionResolver>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPathFunctionResolver#resolveFunction(javax.xml.namespace.QName,int)
     * public abstract javax.xml.xpath.XPathFunction
     * javax.xml.xpath.XPathFunctionResolver.resolveFunction(javax.xml.namespace.QName,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resolveFunction_QName_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
