package org.j8unit.repository.org.w3c.dom;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.DOMImplementation interface org.w3c.dom.DOMImplementation}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.DOMImplementationClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMImplementationTests<SUT extends org.w3c.dom.DOMImplementation>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.DOMImplementation#createDocument(java.lang.String,java.lang.String,org.w3c.dom.DocumentType)
     * public abstract org.w3c.dom.Document
     * org.w3c.dom.DOMImplementation.createDocument(java.lang.String,java.lang.String,org.w3c.dom.DocumentType) throws
     * org.w3c.dom.DOMException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDocument_String_String_DocumentType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.DOMImplementation#createDocumentType(java.lang.String,java.lang.String,java.lang.String)
     * public abstract org.w3c.dom.DocumentType
     * org.w3c.dom.DOMImplementation.createDocumentType(java.lang.String,java.lang.String,java.lang.String) throws
     * org.w3c.dom.DOMException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDocumentType_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMImplementation#getFeature(java.lang.String,java.lang.String) public
     * abstract java.lang.Object org.w3c.dom.DOMImplementation.getFeature(java.lang.String,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFeature_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMImplementation#hasFeature(java.lang.String,java.lang.String) public
     * abstract boolean org.w3c.dom.DOMImplementation.hasFeature(java.lang.String,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasFeature_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
