package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AWTEventClassTest
implements org.j8unit.repository.java.awt.AWTEventClassTests<java.awt.AWTEvent> {

    @Override
    public Class<java.awt.AWTEvent> createNewSUT() {
        return java.awt.AWTEvent.class;
    }

}
