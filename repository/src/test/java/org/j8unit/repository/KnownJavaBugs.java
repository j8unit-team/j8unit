package org.j8unit.repository;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class KnownJavaBugs {

    @Test
    public void toStringReturnsNull_AttributeValueExp() {
        assertNull(new javax.management.AttributeValueExp().toString());
    }

    @Test
    public void toStringReturnsNull2_AttributeValueExp() {
        assertNull(new javax.management.AttributeValueExp(null).toString());
    }

    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException_DebugGraphics() {
        new javax.swing.DebugGraphics().toString();
    }

    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException_ContentModel() {
        new javax.swing.text.html.parser.ContentModel().toString();
    }

}
