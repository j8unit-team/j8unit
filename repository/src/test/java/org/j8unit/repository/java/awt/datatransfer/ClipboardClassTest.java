package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClipboardClassTest
implements org.j8unit.repository.java.awt.datatransfer.ClipboardClassTests<java.awt.datatransfer.Clipboard> {

    @Override
    public Class<java.awt.datatransfer.Clipboard> createNewSUT() {
        return java.awt.datatransfer.Clipboard.class;
    }

}
