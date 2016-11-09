package org.j8unit.repository.java.awt.font;

import java.awt.font.TextMeasurer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TextMeasurer} (by simply reusing the
 * J8Unit test interface {@link TextMeasurerClassTests}).
 */

@RunWith(J8Unit4.class)
public class TextMeasurerClassTest
implements TextMeasurerClassTests<TextMeasurer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.font.TextMeasurer]

    @Override
    public Class<TextMeasurer> createNewSUT() {
        return TextMeasurer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.font.TextMeasurer#TextMeasurer(java.text.AttributedCharacterIterator, java.awt.font.FontRenderContext)
     * public java.awt.font.TextMeasurer(java.text.AttributedCharacterIterator,java.awt.font.FontRenderContext)}.
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
    public void create_TextMeasurer_AttributedCharacterIterator_FontRenderContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TextMeasurer sut = null; // = new TextMeasurer(java.text.AttributedCharacterIterator,
                                       // java.awt.font.FontRenderContext);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.font.TextMeasurer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.font.TextMeasurer]

}
