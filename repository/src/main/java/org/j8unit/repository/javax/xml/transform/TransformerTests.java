package org.j8unit.repository.javax.xml.transform;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.transform.Transformer class javax.xml.transform.Transformer}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link TransformerClassTests}.
 * </p>
 *
 * @see javax.xml.transform.Transformer class javax.xml.transform.Transformer (the hereby targeted class-under-test
 *      class)
 * @see TransformerClassTests TransformerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransformerTests<SUT extends javax.xml.transform.Transformer>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#getOutputProperty(String) public abstract java.lang.String
     * javax.xml.transform.Transformer.getOutputProperty(java.lang.String) throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#getOutputProperty(String) public abstract java.lang.String
     * javax.xml.transform.Transformer.getOutputProperty(java.lang.String) throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#getOutputProperty(String) public abstract java.lang.String
     *      javax.xml.transform.Transformer.getOutputProperty(java.lang.String) throws
     *      java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOutputProperty_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#getOutputProperties() public abstract java.util.Properties
     * javax.xml.transform.Transformer.getOutputProperties()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#getOutputProperties() public abstract java.util.Properties
     * javax.xml.transform.Transformer.getOutputProperties()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#getOutputProperties() public abstract java.util.Properties
     *      javax.xml.transform.Transformer.getOutputProperties() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOutputProperties()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#setOutputProperties(java.util.Properties) public abstract
     * void javax.xml.transform.Transformer.setOutputProperties(java.util.Properties)}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#setOutputProperties(java.util.Properties) public abstract
     * void javax.xml.transform.Transformer.setOutputProperties(java.util.Properties)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#setOutputProperties(java.util.Properties) public abstract void
     *      javax.xml.transform.Transformer.setOutputProperties(java.util.Properties) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setOutputProperties_Properties()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#getErrorListener() public abstract
     * javax.xml.transform.ErrorListener javax.xml.transform.Transformer.getErrorListener()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#getErrorListener() public abstract
     * javax.xml.transform.ErrorListener javax.xml.transform.Transformer.getErrorListener()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#getErrorListener() public abstract javax.xml.transform.ErrorListener
     *      javax.xml.transform.Transformer.getErrorListener() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getErrorListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.transform.Transformer#transform(javax.xml.transform.Source, javax.xml.transform.Result) public
     * abstract void javax.xml.transform.Transformer.transform(javax.xml.transform.Source,javax.xml.transform.Result)
     * throws javax.xml.transform.TransformerException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.transform.Transformer#transform(javax.xml.transform.Source, javax.xml.transform.Result) public
     * abstract void javax.xml.transform.Transformer.transform(javax.xml.transform.Source,javax.xml.transform.Result)
     * throws javax.xml.transform.TransformerException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#transform(javax.xml.transform.Source, javax.xml.transform.Result) public
     *      abstract void
     *      javax.xml.transform.Transformer.transform(javax.xml.transform.Source,javax.xml.transform.Result) throws
     *      javax.xml.transform.TransformerException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_Source_Result()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#reset() public void
     * javax.xml.transform.Transformer.reset()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#reset() public void
     * javax.xml.transform.Transformer.reset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#reset() public void javax.xml.transform.Transformer.reset() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.xml.transform.Transformer#setErrorListener(javax.xml.transform.ErrorListener) public
     * abstract void javax.xml.transform.Transformer.setErrorListener(javax.xml.transform.ErrorListener) throws
     * java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#setErrorListener(javax.xml.transform.ErrorListener) public
     * abstract void javax.xml.transform.Transformer.setErrorListener(javax.xml.transform.ErrorListener) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#setErrorListener(javax.xml.transform.ErrorListener) public abstract void
     *      javax.xml.transform.Transformer.setErrorListener(javax.xml.transform.ErrorListener) throws
     *      java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setErrorListener_ErrorListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#setParameter(String, Object) public abstract void
     * javax.xml.transform.Transformer.setParameter(java.lang.String,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#setParameter(String, Object) public abstract void
     * javax.xml.transform.Transformer.setParameter(java.lang.String,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#setParameter(String, Object) public abstract void
     *      javax.xml.transform.Transformer.setParameter(java.lang.String,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setParameter_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#getURIResolver() public abstract
     * javax.xml.transform.URIResolver javax.xml.transform.Transformer.getURIResolver()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#getURIResolver() public abstract
     * javax.xml.transform.URIResolver javax.xml.transform.Transformer.getURIResolver()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#getURIResolver() public abstract javax.xml.transform.URIResolver
     *      javax.xml.transform.Transformer.getURIResolver() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getURIResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#setOutputProperty(String, String) public abstract void
     * javax.xml.transform.Transformer.setOutputProperty(java.lang.String,java.lang.String) throws
     * java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#setOutputProperty(String, String) public abstract void
     * javax.xml.transform.Transformer.setOutputProperty(java.lang.String,java.lang.String) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#setOutputProperty(String, String) public abstract void
     *      javax.xml.transform.Transformer.setOutputProperty(java.lang.String,java.lang.String) throws
     *      java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setOutputProperty_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#clearParameters() public abstract void
     * javax.xml.transform.Transformer.clearParameters()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#clearParameters() public abstract void
     * javax.xml.transform.Transformer.clearParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#clearParameters() public abstract void
     *      javax.xml.transform.Transformer.clearParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clearParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#setURIResolver(javax.xml.transform.URIResolver) public
     * abstract void javax.xml.transform.Transformer.setURIResolver(javax.xml.transform.URIResolver)}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#setURIResolver(javax.xml.transform.URIResolver) public
     * abstract void javax.xml.transform.Transformer.setURIResolver(javax.xml.transform.URIResolver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#setURIResolver(javax.xml.transform.URIResolver) public abstract void
     *      javax.xml.transform.Transformer.setURIResolver(javax.xml.transform.URIResolver) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setURIResolver_URIResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#getParameter(String) public abstract java.lang.Object
     * javax.xml.transform.Transformer.getParameter(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Transformer#getParameter(String) public abstract java.lang.Object
     * javax.xml.transform.Transformer.getParameter(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Transformer#getParameter(String) public abstract java.lang.Object
     *      javax.xml.transform.Transformer.getParameter(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameter_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
