package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StyleContextClassTest
implements org.j8unit.repository.javax.swing.text.StyleContextClassTests<javax.swing.text.StyleContext> {

    @Override
    public Class<javax.swing.text.StyleContext> createNewSUT() {
        return javax.swing.text.StyleContext.class;
    }

    @RunWith(J8Unit4.class)
    public static class NamedStyleClassTest
    implements org.j8unit.repository.javax.swing.text.StyleContextClassTests.NamedStyleClassTests<javax.swing.text.StyleContext.NamedStyle> {

        @Override
        public Class<javax.swing.text.StyleContext.NamedStyle> createNewSUT() {
            return javax.swing.text.StyleContext.NamedStyle.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class SmallAttributeSetClassTest
    implements org.j8unit.repository.javax.swing.text.StyleContextClassTests.SmallAttributeSetClassTests<javax.swing.text.StyleContext.SmallAttributeSet> {

        @Override
        public Class<javax.swing.text.StyleContext.SmallAttributeSet> createNewSUT() {
            return javax.swing.text.StyleContext.SmallAttributeSet.class;
        }

    }

}
