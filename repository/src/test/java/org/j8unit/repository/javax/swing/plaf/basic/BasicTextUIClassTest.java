package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.fail;
import javax.swing.plaf.basic.BasicTextUI;
import javax.swing.plaf.basic.BasicTextUI.BasicCaret;
import javax.swing.plaf.basic.BasicTextUI.BasicHighlighter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicTextUI} (by simply reusing the
 * J8Unit test interface {@link BasicTextUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class BasicTextUIClassTest
implements BasicTextUIClassTests<BasicTextUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTextUI]

    @Override
    public Class<BasicTextUI> createNewSUT() {
        return BasicTextUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicTextUI#BasicTextUI() public javax.swing.plaf.basic.BasicTextUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_BasicTextUI()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTextUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTextUI]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link BasicHighlighter} (by simply reusing
     * the J8Unit test interface {@link BasicHighlighterClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BasicHighlighterClassTest
    implements BasicHighlighterClassTests<BasicHighlighter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTextUI$BasicHighlighter]

        @Override
        public Class<BasicHighlighter> createNewSUT() {
            return BasicHighlighter.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTextUI.BasicHighlighter#BasicHighlighter() public
         * javax.swing.plaf.basic.BasicTextUI$BasicHighlighter()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_BasicHighlighter()
        throws Exception {
            // create new instance
            final BasicHighlighter sut = new BasicHighlighter();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTextUI$BasicHighlighter]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTextUI$BasicHighlighter]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link BasicCaret} (by simply reusing the
     * J8Unit test interface {@link BasicCaretClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BasicCaretClassTest
    implements BasicCaretClassTests<BasicCaret> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTextUI$BasicCaret]

        @Override
        public Class<BasicCaret> createNewSUT() {
            return BasicCaret.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTextUI.BasicCaret#BasicCaret() public
         * javax.swing.plaf.basic.BasicTextUI$BasicCaret()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_BasicCaret()
        throws Exception {
            // create new instance
            final BasicCaret sut = new BasicCaret();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTextUI$BasicCaret]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTextUI$BasicCaret]

    }

}
