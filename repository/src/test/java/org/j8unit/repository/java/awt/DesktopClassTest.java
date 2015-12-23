package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DesktopClassTest
implements org.j8unit.repository.java.awt.DesktopClassTests<java.awt.Desktop> {

    @Override
    public Class<java.awt.Desktop> createNewSUT() {
        return java.awt.Desktop.class;
    }

    @RunWith(J8Unit4.class)
    public static class ActionClassTest
    implements org.j8unit.repository.java.awt.DesktopClassTests.ActionClassTests<java.awt.Desktop.Action> {

        @Override
        public Class<java.awt.Desktop.Action> createNewSUT() {
            return java.awt.Desktop.Action.class;
        }

    }

}
