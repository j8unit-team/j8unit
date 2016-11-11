package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.xml.sax.helpers.ParserAdapter;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ParserAdapter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.helpers.ParserAdapterClassTests}).
 */

@RunWith(J8Unit4.class)
public class ParserAdapterClassTest
implements ParserAdapterClassTests<ParserAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.helpers.ParserAdapter]

    @Override
    public Class<ParserAdapter> createNewSUT() {
        return ParserAdapter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.helpers.ParserAdapter#ParserAdapter() public org.xml.sax.helpers.ParserAdapter() throws
     * org.xml.sax.SAXException}.
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
    public void create_ParserAdapter()
    throws Exception {
        // create new instance
        final ParserAdapter sut = new ParserAdapter();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.helpers.ParserAdapter#ParserAdapter(org.xml.sax.Parser) public
     * org.xml.sax.helpers.ParserAdapter(org.xml.sax.Parser)}.
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
    public void create_ParserAdapter_Parser()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ParserAdapter sut = null; // = new ParserAdapter(org.xml.sax.Parser);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.helpers.ParserAdapter]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.helpers.ParserAdapter]

}
