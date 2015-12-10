package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CSSTest
implements org.j8unit.repository.javax.swing.text.html.CSSTests<javax.swing.text.html.CSS> {

    @RunWith(J8Unit4.class)
    public static class AttributeTest
    implements org.j8unit.repository.javax.swing.text.html.CSSTests.AttributeTests<javax.swing.text.html.CSS.Attribute> {

        @Override
        public javax.swing.text.html.CSS.Attribute createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.text.html.CSS.Attribute] available.");
        }

    }

    @Override
    public javax.swing.text.html.CSS createNewSUT() {
        return new javax.swing.text.html.CSS();
    }

}
