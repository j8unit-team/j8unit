package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.StyleSheet;
import javax.swing.text.html.StyleSheet.BoxPainter;
import javax.swing.text.html.StyleSheet.ListPainter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StyleSheetClassTest
implements org.j8unit.repository.javax.swing.text.html.StyleSheetClassTests<StyleSheet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.StyleSheet]

    @Override
    public Class<StyleSheet> createNewSUT() {
        return StyleSheet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.text.html.StyleSheet#StyleSheet()
     * public javax.swing.text.html.StyleSheet()}.
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
    public void create_StyleSheet()
    throws Exception {
        // create new instance
        final StyleSheet sut = new StyleSheet();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.StyleSheet#getIndexOfSize(float) public static int
     * javax.swing.text.html.StyleSheet.getIndexOfSize(float)}.
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
    public void test_getIndexOfSize_float()
    throws Exception {
        // write some test for {@link javax.swing.text.html.StyleSheet#getIndexOfSize(float)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.StyleSheet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.StyleSheet]

    @RunWith(J8Unit4.class)
    public static class ListPainterClassTest
    implements org.j8unit.repository.javax.swing.text.html.StyleSheetClassTests.ListPainterClassTests<ListPainter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.StyleSheet$ListPainter]

        @Override
        public Class<ListPainter> createNewSUT() {
            return ListPainter.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.StyleSheet$ListPainter]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.StyleSheet$ListPainter]

    }

    @RunWith(J8Unit4.class)
    public static class BoxPainterClassTest
    implements org.j8unit.repository.javax.swing.text.html.StyleSheetClassTests.BoxPainterClassTests<BoxPainter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.StyleSheet$BoxPainter]

        @Override
        public Class<BoxPainter> createNewSUT() {
            return BoxPainter.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.StyleSheet$BoxPainter]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.StyleSheet$BoxPainter]

    }

}
