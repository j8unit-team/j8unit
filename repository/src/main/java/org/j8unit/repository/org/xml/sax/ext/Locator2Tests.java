package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.ext.Locator2 interface org.xml.sax.ext.Locator2}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link Locator2ClassTests}.
 * </p>
 *
 * @see org.xml.sax.ext.Locator2 interface org.xml.sax.ext.Locator2 (the hereby targeted class-under-test class)
 * @see Locator2ClassTests Locator2ClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface Locator2Tests<SUT extends org.xml.sax.ext.Locator2>
extends org.j8unit.repository.org.xml.sax.LocatorTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2#getEncoding() public abstract java.lang.String
     * org.xml.sax.ext.Locator2.getEncoding()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2#getEncoding() public abstract java.lang.String
     * org.xml.sax.ext.Locator2.getEncoding()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.ext.Locator2#getEncoding() public abstract java.lang.String
     *      org.xml.sax.ext.Locator2.getEncoding() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.ext.Locator2#getXMLVersion() public abstract java.lang.String
     * org.xml.sax.ext.Locator2.getXMLVersion()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2#getXMLVersion() public abstract java.lang.String
     * org.xml.sax.ext.Locator2.getXMLVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.ext.Locator2#getXMLVersion() public abstract java.lang.String
     *      org.xml.sax.ext.Locator2.getXMLVersion() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXMLVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
