package org.j8unit.repository.java.awt.font;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextLayoutTest
implements org.j8unit.repository.java.awt.font.TextLayoutTests<java.awt.font.TextLayout> {

    @Override
    public java.awt.font.TextLayout createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.awt.font.TextLayout] available.");
    }

    @RunWith(J8Unit4.class)
    public static class CaretPolicyTest
    implements org.j8unit.repository.java.awt.font.TextLayoutTests.CaretPolicyTests<java.awt.font.TextLayout.CaretPolicy> {

        @Override
        public java.awt.font.TextLayout.CaretPolicy createNewSUT() {
            return new java.awt.font.TextLayout.CaretPolicy();
        }

    }

}
