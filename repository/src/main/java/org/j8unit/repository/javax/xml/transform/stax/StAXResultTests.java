package org.j8unit.repository.javax.xml.transform.stax;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.transform.stax.StAXResult class
 * javax.xml.transform.stax.StAXResult}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link StAXResultClassTests}.
 * </p>
 *
 * @see javax.xml.transform.stax.StAXResult class javax.xml.transform.stax.StAXResult (the hereby targeted
 *      class-under-test class)
 * @see StAXResultClassTests StAXResultClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StAXResultTests<SUT extends javax.xml.transform.stax.StAXResult>
extends org.j8unit.repository.javax.xml.transform.ResultTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.transform.stax.StAXResult#getSystemId() public java.lang.String
     * javax.xml.transform.stax.StAXResult.getSystemId()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.stax.StAXResult#getSystemId() public java.lang.String
     * javax.xml.transform.stax.StAXResult.getSystemId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.stax.StAXResult#getSystemId() public java.lang.String
     *      javax.xml.transform.stax.StAXResult.getSystemId() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSystemId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.stax.StAXResult#setSystemId(String) public void
     * javax.xml.transform.stax.StAXResult.setSystemId(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.stax.StAXResult#setSystemId(String) public void
     * javax.xml.transform.stax.StAXResult.setSystemId(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.stax.StAXResult#setSystemId(String) public void
     *      javax.xml.transform.stax.StAXResult.setSystemId(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.xml.transform.stax.StAXResult#getXMLEventWriter() public
     * javax.xml.stream.XMLEventWriter javax.xml.transform.stax.StAXResult.getXMLEventWriter()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.stax.StAXResult#getXMLEventWriter() public
     * javax.xml.stream.XMLEventWriter javax.xml.transform.stax.StAXResult.getXMLEventWriter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.stax.StAXResult#getXMLEventWriter() public javax.xml.stream.XMLEventWriter
     *      javax.xml.transform.stax.StAXResult.getXMLEventWriter() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXMLEventWriter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.stax.StAXResult#getXMLStreamWriter() public
     * javax.xml.stream.XMLStreamWriter javax.xml.transform.stax.StAXResult.getXMLStreamWriter()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.stax.StAXResult#getXMLStreamWriter() public
     * javax.xml.stream.XMLStreamWriter javax.xml.transform.stax.StAXResult.getXMLStreamWriter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.stax.StAXResult#getXMLStreamWriter() public javax.xml.stream.XMLStreamWriter
     *      javax.xml.transform.stax.StAXResult.getXMLStreamWriter() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXMLStreamWriter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
