package org.j8unit.repository.org.xml.sax;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.xml.sax.XMLFilter interface org.xml.sax.XMLFilter}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.org.xml.sax.XMLFilterTests}
 * .
 * </p>
 *
 * @see org.j8unit.repository.org.xml.sax.XMLFilterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.xml.sax.XMLFilter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLFilterTests<SUT extends org.xml.sax.XMLFilter>
extends org.j8unit.repository.org.xml.sax.XMLReaderTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.XMLFilter#getParent() public abstract org.xml.sax.XMLReader
     * org.xml.sax.XMLFilter.getParent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.xml.sax.XMLFilter#getParent()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.xml.sax.XMLFilter#setParent(org.xml.sax.XMLReader)
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
