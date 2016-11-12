package org.j8unit.repository.javax.swing.text.html.parser;

import javax.swing.text.html.parser.ContentModel;
import org.junit.Test;

/**
 * @since 0.9.4
 */
public class ContentModelBugs {

    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException() {
        final ContentModelTests<ContentModel> cm = ContentModel::new;
        cm.toStringMustReturnNotNull();
    }

    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException2() {
        final ContentModelTests<ContentModel> cm = () -> new ContentModel(null);
        cm.toStringMustReturnNotNull();
    }

}
