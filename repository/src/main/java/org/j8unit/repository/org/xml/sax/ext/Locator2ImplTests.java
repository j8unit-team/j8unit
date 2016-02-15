package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.ext.Locator2Impl class org.xml.sax.ext.Locator2Impl}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link Locator2ImplClassTests}.
 * </p>
 *
 * @see org.xml.sax.ext.Locator2Impl class org.xml.sax.ext.Locator2Impl (the hereby targeted class-under-test class)
 * @see Locator2ImplClassTests Locator2ImplClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface Locator2ImplTests<SUT extends org.xml.sax.ext.Locator2Impl>
extends Locator2Tests<SUT>, org.j8unit.repository.org.xml.sax.helpers.LocatorImplTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2Impl#setEncoding(String) public void
     * org.xml.sax.ext.Locator2Impl.setEncoding(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2Impl#setEncoding(String) public void
     * org.xml.sax.ext.Locator2Impl.setEncoding(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.ext.Locator2Impl#setEncoding(String) public void
     *      org.xml.sax.ext.Locator2Impl.setEncoding(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEncoding_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2Impl#getEncoding() public java.lang.String
     * org.xml.sax.ext.Locator2Impl.getEncoding()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2Impl#getEncoding() public java.lang.String
     * org.xml.sax.ext.Locator2Impl.getEncoding()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.ext.Locator2Impl#getEncoding() public java.lang.String
     *      org.xml.sax.ext.Locator2Impl.getEncoding() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getEncoding()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2Impl#getXMLVersion() public java.lang.String
     * org.xml.sax.ext.Locator2Impl.getXMLVersion()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2Impl#getXMLVersion() public java.lang.String
     * org.xml.sax.ext.Locator2Impl.getXMLVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.ext.Locator2Impl#getXMLVersion() public java.lang.String
     *      org.xml.sax.ext.Locator2Impl.getXMLVersion() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getXMLVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2Impl#setXMLVersion(String) public void
     * org.xml.sax.ext.Locator2Impl.setXMLVersion(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2Impl#setXMLVersion(String) public void
     * org.xml.sax.ext.Locator2Impl.setXMLVersion(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.ext.Locator2Impl#setXMLVersion(String) public void
     *      org.xml.sax.ext.Locator2Impl.setXMLVersion(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setXMLVersion_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.xml.sax.Locator#getLineNumber() interface org.xml.sax.Locator}</li>
     * <li>{@linkplain org.xml.sax.helpers.LocatorImpl#getLineNumber() class org.xml.sax.helpers.LocatorImpl}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getLineNumber()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.xml.sax.Locator#getSystemId() interface org.xml.sax.Locator}</li>
     * <li>{@linkplain org.xml.sax.helpers.LocatorImpl#getSystemId() class org.xml.sax.helpers.LocatorImpl}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSystemId()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.xml.sax.Locator#getPublicId() interface org.xml.sax.Locator}</li>
     * <li>{@linkplain org.xml.sax.helpers.LocatorImpl#getPublicId() class org.xml.sax.helpers.LocatorImpl}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPublicId()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.xml.sax.Locator#getColumnNumber() interface org.xml.sax.Locator}</li>
     * <li>{@linkplain org.xml.sax.helpers.LocatorImpl#getColumnNumber() class org.xml.sax.helpers.LocatorImpl}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getColumnNumber()
    throws Exception {
    }

}
