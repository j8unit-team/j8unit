package org.j8unit.repository.javax.swing.text.html.parser;

import javax.swing.text.html.parser.ContentModel;
import org.junit.Test;

/**
 * @since 0.9.4
 */
public class ContentModelBugs {

    @Test(expected = NullPointerException.class /* because there is a bug! */)
    public void toStringThrowsAnException() {
        final ContentModel instance = new ContentModel();
        instance.toString();
    }

    @Test(expected = NullPointerException.class /* because there is a bug! */)
    public void toStringThrowsAnException2() {
        final ContentModel instance = new ContentModel(null);
        instance.toString();
    }

}
