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
 * non-{@code static} methods) of {@linkplain javax.xml.xpath.XPath interface javax.xml.xpath.XPath}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link XPathClassTests}.
 * </p>
 *
 * @see javax.xml.xpath.XPath interface javax.xml.xpath.XPath (the hereby targeted class-under-test class)
 * @see XPathClassTests XPathClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XPathTests<SUT extends javax.xml.xpath.XPath>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#compile(String) public abstract javax.xml.xpath.XPathExpression
     * javax.xml.xpath.XPath.compile(java.lang.String) throws javax.xml.xpath.XPathExpressionException}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#compile(String) public abstract javax.xml.xpath.XPathExpression
     * javax.xml.xpath.XPath.compile(java.lang.String) throws javax.xml.xpath.XPathExpressionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#compile(String) public abstract javax.xml.xpath.XPathExpression
     *      javax.xml.xpath.XPath.compile(java.lang.String) throws javax.xml.xpath.XPathExpressionException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compile_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#setNamespaceContext(javax.xml.namespace.NamespaceContext) public
     * abstract void javax.xml.xpath.XPath.setNamespaceContext(javax.xml.namespace.NamespaceContext)}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#setNamespaceContext(javax.xml.namespace.NamespaceContext) public
     * abstract void javax.xml.xpath.XPath.setNamespaceContext(javax.xml.namespace.NamespaceContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#setNamespaceContext(javax.xml.namespace.NamespaceContext) public abstract void
     *      javax.xml.xpath.XPath.setNamespaceContext(javax.xml.namespace.NamespaceContext) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNamespaceContext_NamespaceContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#getXPathVariableResolver() public abstract
     * javax.xml.xpath.XPathVariableResolver javax.xml.xpath.XPath.getXPathVariableResolver()}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#getXPathVariableResolver() public abstract
     * javax.xml.xpath.XPathVariableResolver javax.xml.xpath.XPath.getXPathVariableResolver()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#getXPathVariableResolver() public abstract javax.xml.xpath.XPathVariableResolver
     *      javax.xml.xpath.XPath.getXPathVariableResolver() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXPathVariableResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#setXPathVariableResolver(javax.xml.xpath.XPathVariableResolver)
     * public abstract void javax.xml.xpath.XPath.setXPathVariableResolver(javax.xml.xpath.XPathVariableResolver)}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#setXPathVariableResolver(javax.xml.xpath.XPathVariableResolver)
     * public abstract void javax.xml.xpath.XPath.setXPathVariableResolver(javax.xml.xpath.XPathVariableResolver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#setXPathVariableResolver(javax.xml.xpath.XPathVariableResolver) public abstract void
     *      javax.xml.xpath.XPath.setXPathVariableResolver(javax.xml.xpath.XPathVariableResolver) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setXPathVariableResolver_XPathVariableResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#getNamespaceContext() public abstract
     * javax.xml.namespace.NamespaceContext javax.xml.xpath.XPath.getNamespaceContext()}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#getNamespaceContext() public abstract
     * javax.xml.namespace.NamespaceContext javax.xml.xpath.XPath.getNamespaceContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#getNamespaceContext() public abstract javax.xml.namespace.NamespaceContext
     *      javax.xml.xpath.XPath.getNamespaceContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNamespaceContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#evaluate(String, org.xml.sax.InputSource) public abstract
     * java.lang.String javax.xml.xpath.XPath.evaluate(java.lang.String,org.xml.sax.InputSource) throws
     * javax.xml.xpath.XPathExpressionException}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#evaluate(String, org.xml.sax.InputSource) public abstract
     * java.lang.String javax.xml.xpath.XPath.evaluate(java.lang.String,org.xml.sax.InputSource) throws
     * javax.xml.xpath.XPathExpressionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#evaluate(String, org.xml.sax.InputSource) public abstract java.lang.String
     *      javax.xml.xpath.XPath.evaluate(java.lang.String,org.xml.sax.InputSource) throws
     *      javax.xml.xpath.XPathExpressionException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_String_InputSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#evaluate(String, Object, javax.xml.namespace.QName) public abstract
     * java.lang.Object javax.xml.xpath.XPath.evaluate(java.lang.String,java.lang.Object,javax.xml.namespace.QName)
     * throws javax.xml.xpath.XPathExpressionException}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#evaluate(String, Object, javax.xml.namespace.QName) public abstract
     * java.lang.Object javax.xml.xpath.XPath.evaluate(java.lang.String,java.lang.Object,javax.xml.namespace.QName)
     * throws javax.xml.xpath.XPathExpressionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#evaluate(String, Object, javax.xml.namespace.QName) public abstract java.lang.Object
     *      javax.xml.xpath.XPath.evaluate(java.lang.String,java.lang.Object,javax.xml.namespace.QName) throws
     *      javax.xml.xpath.XPathExpressionException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_String_Object_QName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#evaluate(String, Object) public abstract java.lang.String
     * javax.xml.xpath.XPath.evaluate(java.lang.String,java.lang.Object) throws
     * javax.xml.xpath.XPathExpressionException}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#evaluate(String, Object) public abstract java.lang.String
     * javax.xml.xpath.XPath.evaluate(java.lang.String,java.lang.Object) throws
     * javax.xml.xpath.XPathExpressionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#evaluate(String, Object) public abstract java.lang.String
     *      javax.xml.xpath.XPath.evaluate(java.lang.String,java.lang.Object) throws
     *      javax.xml.xpath.XPathExpressionException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#evaluate(String, org.xml.sax.InputSource, javax.xml.namespace.QName)
     * public abstract java.lang.Object
     * javax.xml.xpath.XPath.evaluate(java.lang.String,org.xml.sax.InputSource,javax.xml.namespace.QName) throws
     * javax.xml.xpath.XPathExpressionException}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#evaluate(String, org.xml.sax.InputSource, javax.xml.namespace.QName)
     * public abstract java.lang.Object
     * javax.xml.xpath.XPath.evaluate(java.lang.String,org.xml.sax.InputSource,javax.xml.namespace.QName) throws
     * javax.xml.xpath.XPathExpressionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#evaluate(String, org.xml.sax.InputSource, javax.xml.namespace.QName) public abstract
     *      java.lang.Object
     *      javax.xml.xpath.XPath.evaluate(java.lang.String,org.xml.sax.InputSource,javax.xml.namespace.QName) throws
     *      javax.xml.xpath.XPathExpressionException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_String_InputSource_QName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#reset() public abstract void javax.xml.xpath.XPath.reset()}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#reset() public abstract void javax.xml.xpath.XPath.reset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#reset() public abstract void javax.xml.xpath.XPath.reset() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#setXPathFunctionResolver(javax.xml.xpath.XPathFunctionResolver)
     * public abstract void javax.xml.xpath.XPath.setXPathFunctionResolver(javax.xml.xpath.XPathFunctionResolver)}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#setXPathFunctionResolver(javax.xml.xpath.XPathFunctionResolver)
     * public abstract void javax.xml.xpath.XPath.setXPathFunctionResolver(javax.xml.xpath.XPathFunctionResolver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#setXPathFunctionResolver(javax.xml.xpath.XPathFunctionResolver) public abstract void
     *      javax.xml.xpath.XPath.setXPathFunctionResolver(javax.xml.xpath.XPathFunctionResolver) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setXPathFunctionResolver_XPathFunctionResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#getXPathFunctionResolver() public abstract
     * javax.xml.xpath.XPathFunctionResolver javax.xml.xpath.XPath.getXPathFunctionResolver()}.
     *
     * <p>
     * Test method for {@link javax.xml.xpath.XPath#getXPathFunctionResolver() public abstract
     * javax.xml.xpath.XPathFunctionResolver javax.xml.xpath.XPath.getXPathFunctionResolver()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.xpath.XPath#getXPathFunctionResolver() public abstract javax.xml.xpath.XPathFunctionResolver
     *      javax.xml.xpath.XPath.getXPathFunctionResolver() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXPathFunctionResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
