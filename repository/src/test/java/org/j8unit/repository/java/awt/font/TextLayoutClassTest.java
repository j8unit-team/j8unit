package org.j8unit.repository.java.awt.font;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextLayoutClassTest
implements org.j8unit.repository.java.awt.font.TextLayoutClassTests<java.awt.font.TextLayout> {

    @Override
    public Class<java.awt.font.TextLayout> createNewSUT() {
        return java.awt.font.TextLayout.class;
    }

    @RunWith(J8Unit4.class)
    public static class CaretPolicyClassTest
    implements org.j8unit.repository.java.awt.font.TextLayoutClassTests.CaretPolicyClassTests<java.awt.font.TextLayout.CaretPolicy> {

        @Override
        public Class<java.awt.font.TextLayout.CaretPolicy> createNewSUT() {
            return java.awt.font.TextLayout.CaretPolicy.class;
        }

    }

}
