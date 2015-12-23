package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RenderingHintsClassTest
implements org.j8unit.repository.java.awt.RenderingHintsClassTests<java.awt.RenderingHints> {

    @Override
    public Class<java.awt.RenderingHints> createNewSUT() {
        return java.awt.RenderingHints.class;
    }

    @RunWith(J8Unit4.class)
    public static class KeyClassTest
    implements org.j8unit.repository.java.awt.RenderingHintsClassTests.KeyClassTests<java.awt.RenderingHints.Key> {

        @Override
        public Class<java.awt.RenderingHints.Key> createNewSUT() {
            return java.awt.RenderingHints.Key.class;
        }

    }

}
