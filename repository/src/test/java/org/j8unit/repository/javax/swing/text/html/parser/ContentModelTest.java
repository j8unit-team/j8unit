package org.j8unit.repository.javax.swing.text.html.parser;

import org.j8unit.repository.JavaBug;
import org.j8unit.runners.J8Unit4;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContentModelTest
implements org.j8unit.repository.javax.swing.text.html.parser.ContentModelTests<javax.swing.text.html.parser.ContentModel> {

    @Override
    public javax.swing.text.html.parser.ContentModel createNewSUT() {
        return new javax.swing.text.html.parser.ContentModel();
    }

    /**
     * {@code new ContentModel().toString()} throws {@code NullPointerException} illegally.
     */
    @Override
    @Test
    @Category(JavaBug.class)
    public void toStringMustReturnNotNull() {
        org.j8unit.repository.javax.swing.text.html.parser.ContentModelTests.super.toStringMustReturnNotNull();
    }

}
