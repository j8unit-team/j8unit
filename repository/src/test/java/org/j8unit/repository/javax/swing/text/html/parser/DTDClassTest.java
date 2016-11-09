package org.j8unit.repository.javax.swing.text.html.parser;

import javax.swing.text.html.parser.DTD;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DTD} (by simply reusing the J8Unit test
 * interface {@link DTDClassTests}).
 */

@RunWith(J8Unit4.class)
public class DTDClassTest
implements DTDClassTests<DTD> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.parser.DTD]

    @Override
    public Class<DTD> createNewSUT() {
        return DTD.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.parser.DTD#putDTDHash(String, javax.swing.text.html.parser.DTD) public static void
     * javax.swing.text.html.parser.DTD.putDTDHash(java.lang.String,javax.swing.text.html.parser.DTD)}.
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
    public void test_putDTDHash_String_DTD()
    throws Exception {
        // write some test for {@link javax.swing.text.html.parser.DTD#putDTDHash(String,
        // javax.swing.text.html.parser.DTD)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.html.parser.DTD#getDTD(String)
     * public static javax.swing.text.html.parser.DTD javax.swing.text.html.parser.DTD.getDTD(java.lang.String) throws
     * java.io.IOException}.
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
    public void test_getDTD_String()
    throws Exception {
        // write some test for {@link javax.swing.text.html.parser.DTD#getDTD(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.parser.DTD]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.parser.DTD]

}
