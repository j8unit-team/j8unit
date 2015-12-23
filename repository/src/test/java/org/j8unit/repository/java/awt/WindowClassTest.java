package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WindowClassTest
implements org.j8unit.repository.java.awt.WindowClassTests<java.awt.Window> {

    @Override
    public Class<java.awt.Window> createNewSUT() {
        return java.awt.Window.class;
    }

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.java.awt.WindowClassTests.TypeClassTests<java.awt.Window.Type> {

        @Override
        public Class<java.awt.Window.Type> createNewSUT() {
            return java.awt.Window.Type.class;
        }

    }

}
