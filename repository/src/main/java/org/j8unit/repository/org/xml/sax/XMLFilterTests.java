package org.j8unit.repository.org.xml.sax;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.XMLFilter interface org.xml.sax.XMLFilter}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link XMLFilterClassTests}.
 * </p>
 *
 * @see org.xml.sax.XMLFilter interface org.xml.sax.XMLFilter (the hereby targeted class-under-test class)
 * @see XMLFilterClassTests XMLFilterClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLFilterTests<SUT extends org.xml.sax.XMLFilter>
extends XMLReaderTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.XMLFilter#getParent() public abstract org.xml.sax.XMLReader
     * org.xml.sax.XMLFilter.getParent()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLFilter#getParent() public abstract org.xml.sax.XMLReader
     * org.xml.sax.XMLFilter.getParent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLFilter#getParent() public abstract org.xml.sax.XMLReader org.xml.sax.XMLFilter.getParent()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.XMLFilter#setParent(org.xml.sax.XMLReader) public abstract void
     * org.xml.sax.XMLFilter.setParent(org.xml.sax.XMLReader)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLFilter#setParent(org.xml.sax.XMLReader) public abstract void
     * org.xml.sax.XMLFilter.setParent(org.xml.sax.XMLReader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLFilter#setParent(org.xml.sax.XMLReader) public abstract void
     *      org.xml.sax.XMLFilter.setParent(org.xml.sax.XMLReader) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setParent_XMLReader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
