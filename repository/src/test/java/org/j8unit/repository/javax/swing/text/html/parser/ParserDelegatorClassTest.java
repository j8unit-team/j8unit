package org.j8unit.repository.javax.swing.text.html.parser;

import javax.swing.text.html.parser.ParserDelegator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ParserDelegator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.parser.ParserDelegatorClassTests}).
 */
@RunWith(J8Unit4.class)
public class ParserDelegatorClassTest
implements ParserDelegatorClassTests<ParserDelegator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.parser.ParserDelegator]

    @Override
    public Class<ParserDelegator> createNewSUT() {
        return ParserDelegator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.parser.ParserDelegator#ParserDelegator() public
     * javax.swing.text.html.parser.ParserDelegator()}.
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
    public void create_ParserDelegator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ParserDelegator sut = new ParserDelegator();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.parser.ParserDelegator]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.parser.ParserDelegator]

}
