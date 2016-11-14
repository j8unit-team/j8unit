package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.HTML;
import org.j8unit.repository.javax.swing.text.html.HTMLTests;
import org.junit.Test;

/**
 * @since 0.9.4
 */
public class HTMLBugs {

    public static class TagBugs {

        @Test(expected = AssertionError.class)
        public void toStringReturnsNull() {
            final HTMLTests.TagTests<HTML.Tag> t = HTML.Tag::new;
            t.toStringMustReturnNotNull();
        }

    }

}
