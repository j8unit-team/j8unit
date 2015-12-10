package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActiveEventClassTest
implements org.j8unit.repository.java.awt.ActiveEventClassTests<java.awt.ActiveEvent> {

    @Override
    public Class<java.awt.ActiveEvent> createNewSUT() {
        return java.awt.ActiveEvent.class;
    }

}
