package org.j8unit.repository.javax.xml.transform.sax;

import javax.xml.transform.sax.SAXResult;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;

@RunWith(J8Unit4.class)
public class SAXResultClassTest
implements org.j8unit.repository.javax.xml.transform.sax.SAXResultClassTests<SAXResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.sax.SAXResult]

    @Override
    public Class<SAXResult> createNewSUT() {
        return SAXResult.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SAXResult#SAXResult() public
     * javax.xml.transform.sax.SAXResult()}.
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
    public void create_SAXResult()
    throws Exception {
        // create new instance
        final SAXResult sut = new SAXResult();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SAXResult#SAXResult(ContentHandler) public
     * javax.xml.transform.sax.SAXResult(org.xml.sax.ContentHandler)}.
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
    public void create_SAXResult_ContentHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SAXResult sut = null; // = new SAXResult(ContentHandler);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.sax.SAXResult]

}
