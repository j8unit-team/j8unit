package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.xml.sax.helpers.ParserFactory;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ParserFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.helpers.ParserFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class ParserFactoryClassTest
implements ParserFactoryClassTests<ParserFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.helpers.ParserFactory]

    @Override
    public Class<ParserFactory> createNewSUT() {
        return ParserFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.xml.sax.helpers.ParserFactory#makeParser(String)
     * public static org.xml.sax.Parser org.xml.sax.helpers.ParserFactory.makeParser(java.lang.String) throws
     * java.lang.ClassNotFoundException,java.lang.IllegalAccessException,java.lang.InstantiationException,java.lang.ClassCastException}.
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
    public void test_makeParser_String()
    throws Exception {
        // write some test for {@link org.xml.sax.helpers.ParserFactory#makeParser(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.xml.sax.helpers.ParserFactory#makeParser()
     * public static org.xml.sax.Parser org.xml.sax.helpers.ParserFactory.makeParser() throws
     * java.lang.ClassNotFoundException,java.lang.IllegalAccessException,java.lang.InstantiationException,java.lang.NullPointerException,java.lang.ClassCastException}.
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
    public void test_makeParser()
    throws Exception {
        // write some test for {@link org.xml.sax.helpers.ParserFactory#makeParser()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.helpers.ParserFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.helpers.ParserFactory]

}
