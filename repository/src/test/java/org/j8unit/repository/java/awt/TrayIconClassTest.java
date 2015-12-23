package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TrayIconClassTest
implements org.j8unit.repository.java.awt.TrayIconClassTests<java.awt.TrayIcon> {

    @Override
    public Class<java.awt.TrayIcon> createNewSUT() {
        return java.awt.TrayIcon.class;
    }

    @RunWith(J8Unit4.class)
    public static class MessageTypeClassTest
    implements org.j8unit.repository.java.awt.TrayIconClassTests.MessageTypeClassTests<java.awt.TrayIcon.MessageType> {

        @Override
        public Class<java.awt.TrayIcon.MessageType> createNewSUT() {
            return java.awt.TrayIcon.MessageType.class;
        }

    }

}
