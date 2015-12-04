package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.xpath.XPathExpression interface javax.xml.xpath.XPathExpression}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.xpath.XPathExpressionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XPathExpressionTests<SUT extends javax.xml.xpath.XPathExpression>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPathExpression#evaluate(org.xml.sax.InputSource) public abstract
     * java.lang.String javax.xml.xpath.XPathExpression.evaluate(org.xml.sax.InputSource) throws
     * javax.xml.xpath.XPathExpressionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_InputSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.xpath.XPathExpression#evaluate(org.xml.sax.InputSource,javax.xml.namespace.QName) public
     * abstract java.lang.Object
     * javax.xml.xpath.XPathExpression.evaluate(org.xml.sax.InputSource,javax.xml.namespace.QName) throws
     * javax.xml.xpath.XPathExpressionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_InputSource_QName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPathExpression#evaluate(java.lang.Object) public abstract
     * java.lang.String javax.xml.xpath.XPathExpression.evaluate(java.lang.Object) throws
     * javax.xml.xpath.XPathExpressionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPathExpression#evaluate(java.lang.Object,javax.xml.namespace.QName)
     * public abstract java.lang.Object
     * javax.xml.xpath.XPathExpression.evaluate(java.lang.Object,javax.xml.namespace.QName) throws
     * javax.xml.xpath.XPathExpressionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_Object_QName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
