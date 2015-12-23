package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CSSClassTest
implements org.j8unit.repository.javax.swing.text.html.CSSClassTests<javax.swing.text.html.CSS> {

    @Override
    public Class<javax.swing.text.html.CSS> createNewSUT() {
        return javax.swing.text.html.CSS.class;
    }

    @RunWith(J8Unit4.class)
    public static class AttributeClassTest
    implements org.j8unit.repository.javax.swing.text.html.CSSClassTests.AttributeClassTests<javax.swing.text.html.CSS.Attribute> {

        @Override
        public Class<javax.swing.text.html.CSS.Attribute> createNewSUT() {
            return javax.swing.text.html.CSS.Attribute.class;
        }

    }

}
