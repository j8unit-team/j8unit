package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.Element interface org.w3c.dom.Element}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ElementClassTests}.
 * </p>
 *
 * @see org.w3c.dom.Element interface org.w3c.dom.Element (the hereby targeted class-under-test class)
 * @see ElementClassTests ElementClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ElementTests<SUT extends org.w3c.dom.Element>
extends NodeTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#getAttribute(String) public abstract java.lang.String
     * org.w3c.dom.Element.getAttribute(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#getAttribute(String) public abstract java.lang.String
     * org.w3c.dom.Element.getAttribute(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#getAttribute(String) public abstract java.lang.String
     *      org.w3c.dom.Element.getAttribute(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttribute_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#setAttribute(String, String) public abstract void
     * org.w3c.dom.Element.setAttribute(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#setAttribute(String, String) public abstract void
     * org.w3c.dom.Element.setAttribute(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#setAttribute(String, String) public abstract void
     *      org.w3c.dom.Element.setAttribute(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttribute_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#getElementsByTagNameNS(String, String) public abstract
     * org.w3c.dom.NodeList org.w3c.dom.Element.getElementsByTagNameNS(java.lang.String,java.lang.String) throws
     * org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#getElementsByTagNameNS(String, String) public abstract
     * org.w3c.dom.NodeList org.w3c.dom.Element.getElementsByTagNameNS(java.lang.String,java.lang.String) throws
     * org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#getElementsByTagNameNS(String, String) public abstract org.w3c.dom.NodeList
     *      org.w3c.dom.Element.getElementsByTagNameNS(java.lang.String,java.lang.String) throws
     *      org.w3c.dom.DOMException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementsByTagNameNS_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#getAttributeNS(String, String) public abstract java.lang.String
     * org.w3c.dom.Element.getAttributeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#getAttributeNS(String, String) public abstract java.lang.String
     * org.w3c.dom.Element.getAttributeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#getAttributeNS(String, String) public abstract java.lang.String
     *      org.w3c.dom.Element.getAttributeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributeNS_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#setIdAttributeNode(org.w3c.dom.Attr, boolean) public abstract void
     * org.w3c.dom.Element.setIdAttributeNode(org.w3c.dom.Attr,boolean) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#setIdAttributeNode(org.w3c.dom.Attr, boolean) public abstract void
     * org.w3c.dom.Element.setIdAttributeNode(org.w3c.dom.Attr,boolean) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#setIdAttributeNode(org.w3c.dom.Attr, boolean) public abstract void
     *      org.w3c.dom.Element.setIdAttributeNode(org.w3c.dom.Attr,boolean) throws org.w3c.dom.DOMException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setIdAttributeNode_Attr_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#getAttributeNode(String) public abstract org.w3c.dom.Attr
     * org.w3c.dom.Element.getAttributeNode(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#getAttributeNode(String) public abstract org.w3c.dom.Attr
     * org.w3c.dom.Element.getAttributeNode(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#getAttributeNode(String) public abstract org.w3c.dom.Attr
     *      org.w3c.dom.Element.getAttributeNode(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributeNode_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#removeAttributeNode(org.w3c.dom.Attr) public abstract org.w3c.dom.Attr
     * org.w3c.dom.Element.removeAttributeNode(org.w3c.dom.Attr) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#removeAttributeNode(org.w3c.dom.Attr) public abstract org.w3c.dom.Attr
     * org.w3c.dom.Element.removeAttributeNode(org.w3c.dom.Attr) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#removeAttributeNode(org.w3c.dom.Attr) public abstract org.w3c.dom.Attr
     *      org.w3c.dom.Element.removeAttributeNode(org.w3c.dom.Attr) throws org.w3c.dom.DOMException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeAttributeNode_Attr()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#hasAttributeNS(String, String) public abstract boolean
     * org.w3c.dom.Element.hasAttributeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#hasAttributeNS(String, String) public abstract boolean
     * org.w3c.dom.Element.hasAttributeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#hasAttributeNS(String, String) public abstract boolean
     *      org.w3c.dom.Element.hasAttributeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasAttributeNS_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#getTagName() public abstract java.lang.String
     * org.w3c.dom.Element.getTagName()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#getTagName() public abstract java.lang.String
     * org.w3c.dom.Element.getTagName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#getTagName() public abstract java.lang.String org.w3c.dom.Element.getTagName() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTagName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#getAttributeNodeNS(String, String) public abstract org.w3c.dom.Attr
     * org.w3c.dom.Element.getAttributeNodeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#getAttributeNodeNS(String, String) public abstract org.w3c.dom.Attr
     * org.w3c.dom.Element.getAttributeNodeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#getAttributeNodeNS(String, String) public abstract org.w3c.dom.Attr
     *      org.w3c.dom.Element.getAttributeNodeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributeNodeNS_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#getElementsByTagName(String) public abstract org.w3c.dom.NodeList
     * org.w3c.dom.Element.getElementsByTagName(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#getElementsByTagName(String) public abstract org.w3c.dom.NodeList
     * org.w3c.dom.Element.getElementsByTagName(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#getElementsByTagName(String) public abstract org.w3c.dom.NodeList
     *      org.w3c.dom.Element.getElementsByTagName(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementsByTagName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#getSchemaTypeInfo() public abstract org.w3c.dom.TypeInfo
     * org.w3c.dom.Element.getSchemaTypeInfo()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#getSchemaTypeInfo() public abstract org.w3c.dom.TypeInfo
     * org.w3c.dom.Element.getSchemaTypeInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#getSchemaTypeInfo() public abstract org.w3c.dom.TypeInfo
     *      org.w3c.dom.Element.getSchemaTypeInfo() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSchemaTypeInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#removeAttribute(String) public abstract void
     * org.w3c.dom.Element.removeAttribute(java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#removeAttribute(String) public abstract void
     * org.w3c.dom.Element.removeAttribute(java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#removeAttribute(String) public abstract void
     *      org.w3c.dom.Element.removeAttribute(java.lang.String) throws org.w3c.dom.DOMException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeAttribute_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#setAttributeNS(String, String, String) public abstract void
     * org.w3c.dom.Element.setAttributeNS(java.lang.String,java.lang.String,java.lang.String) throws
     * org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#setAttributeNS(String, String, String) public abstract void
     * org.w3c.dom.Element.setAttributeNS(java.lang.String,java.lang.String,java.lang.String) throws
     * org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#setAttributeNS(String, String, String) public abstract void
     *      org.w3c.dom.Element.setAttributeNS(java.lang.String,java.lang.String,java.lang.String) throws
     *      org.w3c.dom.DOMException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttributeNS_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#removeAttributeNS(String, String) public abstract void
     * org.w3c.dom.Element.removeAttributeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#removeAttributeNS(String, String) public abstract void
     * org.w3c.dom.Element.removeAttributeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#removeAttributeNS(String, String) public abstract void
     *      org.w3c.dom.Element.removeAttributeNS(java.lang.String,java.lang.String) throws org.w3c.dom.DOMException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeAttributeNS_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#hasAttribute(String) public abstract boolean
     * org.w3c.dom.Element.hasAttribute(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#hasAttribute(String) public abstract boolean
     * org.w3c.dom.Element.hasAttribute(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#hasAttribute(String) public abstract boolean
     *      org.w3c.dom.Element.hasAttribute(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasAttribute_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#setAttributeNode(org.w3c.dom.Attr) public abstract org.w3c.dom.Attr
     * org.w3c.dom.Element.setAttributeNode(org.w3c.dom.Attr) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#setAttributeNode(org.w3c.dom.Attr) public abstract org.w3c.dom.Attr
     * org.w3c.dom.Element.setAttributeNode(org.w3c.dom.Attr) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#setAttributeNode(org.w3c.dom.Attr) public abstract org.w3c.dom.Attr
     *      org.w3c.dom.Element.setAttributeNode(org.w3c.dom.Attr) throws org.w3c.dom.DOMException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttributeNode_Attr()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#setAttributeNodeNS(org.w3c.dom.Attr) public abstract org.w3c.dom.Attr
     * org.w3c.dom.Element.setAttributeNodeNS(org.w3c.dom.Attr) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#setAttributeNodeNS(org.w3c.dom.Attr) public abstract org.w3c.dom.Attr
     * org.w3c.dom.Element.setAttributeNodeNS(org.w3c.dom.Attr) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#setAttributeNodeNS(org.w3c.dom.Attr) public abstract org.w3c.dom.Attr
     *      org.w3c.dom.Element.setAttributeNodeNS(org.w3c.dom.Attr) throws org.w3c.dom.DOMException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttributeNodeNS_Attr()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#setIdAttributeNS(String, String, boolean) public abstract void
     * org.w3c.dom.Element.setIdAttributeNS(java.lang.String,java.lang.String,boolean) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#setIdAttributeNS(String, String, boolean) public abstract void
     * org.w3c.dom.Element.setIdAttributeNS(java.lang.String,java.lang.String,boolean) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#setIdAttributeNS(String, String, boolean) public abstract void
     *      org.w3c.dom.Element.setIdAttributeNS(java.lang.String,java.lang.String,boolean) throws
     *      org.w3c.dom.DOMException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setIdAttributeNS_String_String_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Element#setIdAttribute(String, boolean) public abstract void
     * org.w3c.dom.Element.setIdAttribute(java.lang.String,boolean) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Element#setIdAttribute(String, boolean) public abstract void
     * org.w3c.dom.Element.setIdAttribute(java.lang.String,boolean) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Element#setIdAttribute(String, boolean) public abstract void
     *      org.w3c.dom.Element.setIdAttribute(java.lang.String,boolean) throws org.w3c.dom.DOMException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setIdAttribute_String_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
