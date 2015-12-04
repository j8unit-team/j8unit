package org.j8unit.repository.javax.xml.transform.sax;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.transform.sax.TransformerHandler interface
 * javax.xml.transform.sax.TransformerHandler}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.transform.sax.TransformerHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TransformerHandlerTests<SUT extends javax.xml.transform.sax.TransformerHandler>
extends org.j8unit.repository.org.xml.sax.ContentHandlerTests<SUT>, org.j8unit.repository.org.xml.sax.ext.LexicalHandlerTests<SUT>,
org.j8unit.repository.org.xml.sax.DTDHandlerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.transform.sax.TransformerHandler#setResult(javax.xml.transform.Result) public
     * abstract void javax.xml.transform.sax.TransformerHandler.setResult(javax.xml.transform.Result) throws
     * java.lang.IllegalArgumentException}.
     * </p>
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
     * </p>
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
     * Test method for {@link javax.xml.transform.sax.TransformerHandler#setSystemId(java.lang.String) public abstract
     * void javax.xml.transform.sax.TransformerHandler.setSystemId(java.lang.String)}.
     * </p>
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
     * </p>
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
