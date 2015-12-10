package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StyleContextTest
implements org.j8unit.repository.javax.swing.text.StyleContextTests<javax.swing.text.StyleContext> {

    @RunWith(J8Unit4.class)
    public static class NamedStyleTest
    implements org.j8unit.repository.javax.swing.text.StyleContextTests.NamedStyleTests<javax.swing.text.StyleContext.NamedStyle> {

        @Override
        public javax.swing.text.StyleContext.NamedStyle createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.StyleContext.NamedStyle] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class SmallAttributeSetTest
    implements org.j8unit.repository.javax.swing.text.StyleContextTests.SmallAttributeSetTests<javax.swing.text.StyleContext.SmallAttributeSet> {

        @Override
        public javax.swing.text.StyleContext.SmallAttributeSet createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.StyleContext.SmallAttributeSet] available.");
        }

    }

    @Override
    public javax.swing.text.StyleContext createNewSUT() {
        return new javax.swing.text.StyleContext();
    }

}
