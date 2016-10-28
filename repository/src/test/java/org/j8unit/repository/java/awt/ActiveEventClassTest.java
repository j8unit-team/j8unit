package org.j8unit.repository.java.awt;

import java.awt.ActiveEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActiveEventClassTest
implements org.j8unit.repository.java.awt.ActiveEventClassTests<ActiveEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.ActiveEvent]

    @Override
    public Class<ActiveEvent> createNewSUT() {
        return ActiveEvent.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.ActiveEvent]

}
