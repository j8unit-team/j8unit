package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.DOMImplementation interface org.w3c.dom.DOMImplementation}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link DOMImplementationClassTests}.
 * </p>
 *
 * @see org.w3c.dom.DOMImplementation interface org.w3c.dom.DOMImplementation (the hereby targeted class-under-test
 *      class)
 * @see DOMImplementationClassTests DOMImplementationClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMImplementationTests<SUT extends org.w3c.dom.DOMImplementation>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMImplementation#getFeature(String, String) public abstract java.lang.Object
     * org.w3c.dom.DOMImplementation.getFeature(java.lang.String,java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMImplementation#getFeature(String, String) public abstract java.lang.Object
     * org.w3c.dom.DOMImplementation.getFeature(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMImplementation#getFeature(String, String) public abstract java.lang.Object
     *      org.w3c.dom.DOMImplementation.getFeature(java.lang.String,java.lang.String) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link org.w3c.dom.DOMImplementation#createDocument(String, String, org.w3c.dom.DocumentType)
     * public abstract org.w3c.dom.Document
     * org.w3c.dom.DOMImplementation.createDocument(java.lang.String,java.lang.String,org.w3c.dom.DocumentType) throws
     * org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMImplementation#createDocument(String, String, org.w3c.dom.DocumentType)
     * public abstract org.w3c.dom.Document
     * org.w3c.dom.DOMImplementation.createDocument(java.lang.String,java.lang.String,org.w3c.dom.DocumentType) throws
     * org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMImplementation#createDocument(String, String, org.w3c.dom.DocumentType) public abstract
     *      org.w3c.dom.Document
     *      org.w3c.dom.DOMImplementation.createDocument(java.lang.String,java.lang.String,org.w3c.dom.DocumentType)
     *      throws org.w3c.dom.DOMException (the hereby targeted method-under-test)
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
     * Test method for {@link org.w3c.dom.DOMImplementation#createDocumentType(String, String, String) public abstract
     * org.w3c.dom.DocumentType
     * org.w3c.dom.DOMImplementation.createDocumentType(java.lang.String,java.lang.String,java.lang.String) throws
     * org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMImplementation#createDocumentType(String, String, String) public abstract
     * org.w3c.dom.DocumentType
     * org.w3c.dom.DOMImplementation.createDocumentType(java.lang.String,java.lang.String,java.lang.String) throws
     * org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMImplementation#createDocumentType(String, String, String) public abstract
     *      org.w3c.dom.DocumentType
     *      org.w3c.dom.DOMImplementation.createDocumentType(java.lang.String,java.lang.String,java.lang.String) throws
     *      org.w3c.dom.DOMException (the hereby targeted method-under-test)
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
     * Test method for {@link org.w3c.dom.DOMImplementation#hasFeature(String, String) public abstract boolean
     * org.w3c.dom.DOMImplementation.hasFeature(java.lang.String,java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMImplementation#hasFeature(String, String) public abstract boolean
     * org.w3c.dom.DOMImplementation.hasFeature(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMImplementation#hasFeature(String, String) public abstract boolean
     *      org.w3c.dom.DOMImplementation.hasFeature(java.lang.String,java.lang.String) (the hereby targeted
     *      method-under-test)
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
