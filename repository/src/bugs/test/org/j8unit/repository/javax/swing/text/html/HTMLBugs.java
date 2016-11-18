package org.j8unit.repository.javax.swing.text.html;

import static org.junit.Assert.assertNotNull;
import javax.swing.text.html.HTML;
import org.junit.Test;

/**
 * @since 0.9.4
 */
public class HTMLBugs {

    public static class TagBugs {

        @Test(expected = AssertionError.class /* because there is a bug! */)
        public void toStringReturnsNull() {
            final HTML.Tag instance = new HTML.Tag();
            assertNotNull(null, instance.toString());
        }

    }

}
