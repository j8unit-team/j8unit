package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLFilterImpl} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.helpers.XMLFilterImplClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLFilterImplClassTest
implements XMLFilterImplClassTests<XMLFilterImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.helpers.XMLFilterImpl]

    @Override
    public Class<XMLFilterImpl> createNewSUT() {
        return XMLFilterImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.helpers.XMLFilterImpl#XMLFilterImpl(org.xml.sax.XMLReader) public
     * org.xml.sax.helpers.XMLFilterImpl(org.xml.sax.XMLReader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_XMLFilterImpl_XMLReader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XMLFilterImpl sut = null; // = new XMLFilterImpl(org.xml.sax.XMLReader);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.helpers.XMLFilterImpl#XMLFilterImpl() public org.xml.sax.helpers.XMLFilterImpl()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_XMLFilterImpl()
    throws Exception {
        // create new instance
        final XMLFilterImpl sut = new XMLFilterImpl();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.helpers.XMLFilterImpl]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.helpers.XMLFilterImpl]

}
