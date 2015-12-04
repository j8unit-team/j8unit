package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.xml.sax.ext.Locator2 interface org.xml.sax.ext.Locator2}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.xml.sax.ext.Locator2ClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface Locator2Tests<SUT extends org.xml.sax.ext.Locator2>
extends org.j8unit.repository.org.xml.sax.LocatorTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.ext.Locator2#getEncoding() public abstract java.lang.String
     * org.xml.sax.ext.Locator2.getEncoding()}.
     * </p>
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
     * </p>
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
