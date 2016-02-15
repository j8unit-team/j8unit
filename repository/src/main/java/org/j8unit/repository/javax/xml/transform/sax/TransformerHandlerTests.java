package org.j8unit.repository.javax.xml.transform.sax;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.transform.sax.TransformerHandler interface
 * javax.xml.transform.sax.TransformerHandler}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link TransformerHandlerClassTests}.
 * </p>
 *
 * @see javax.xml.transform.sax.TransformerHandler interface javax.xml.transform.sax.TransformerHandler (the hereby
 *      targeted class-under-test class)
 * @see TransformerHandlerClassTests TransformerHandlerClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransformerHandlerTests<SUT extends javax.xml.transform.sax.TransformerHandler>
extends org.j8unit.repository.org.xml.sax.ContentHandlerTests<SUT>, org.j8unit.repository.org.xml.sax.ext.LexicalHandlerTests<SUT>,
org.j8unit.repository.org.xml.sax.DTDHandlerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.transform.sax.TransformerHandler#setResult(javax.xml.transform.Result) public
     * abstract void javax.xml.transform.sax.TransformerHandler.setResult(javax.xml.transform.Result) throws
     * java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.sax.TransformerHandler#setResult(javax.xml.transform.Result) public
     * abstract void javax.xml.transform.sax.TransformerHandler.setResult(javax.xml.transform.Result) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.sax.TransformerHandler#setResult(javax.xml.transform.Result) public abstract void
     *      javax.xml.transform.sax.TransformerHandler.setResult(javax.xml.transform.Result) throws
     *      java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setResult_Result()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.sax.TransformerHandler#getTransformer() public abstract
     * javax.xml.transform.Transformer javax.xml.transform.sax.TransformerHandler.getTransformer()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.sax.TransformerHandler#getTransformer() public abstract
     * javax.xml.transform.Transformer javax.xml.transform.sax.TransformerHandler.getTransformer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.sax.TransformerHandler#getTransformer() public abstract javax.xml.transform.Transformer
     *      javax.xml.transform.sax.TransformerHandler.getTransformer() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransformer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.sax.TransformerHandler#setSystemId(String) public abstract void
     * javax.xml.transform.sax.TransformerHandler.setSystemId(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.sax.TransformerHandler#setSystemId(String) public abstract void
     * javax.xml.transform.sax.TransformerHandler.setSystemId(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.sax.TransformerHandler#setSystemId(String) public abstract void
     *      javax.xml.transform.sax.TransformerHandler.setSystemId(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSystemId_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.sax.TransformerHandler#getSystemId() public abstract java.lang.String
     * javax.xml.transform.sax.TransformerHandler.getSystemId()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.sax.TransformerHandler#getSystemId() public abstract java.lang.String
     * javax.xml.transform.sax.TransformerHandler.getSystemId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.sax.TransformerHandler#getSystemId() public abstract java.lang.String
     *      javax.xml.transform.sax.TransformerHandler.getSystemId() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSystemId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
