package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TreeModelEventClassTest
implements org.j8unit.repository.javax.swing.event.TreeModelEventClassTests<javax.swing.event.TreeModelEvent> {

    @Override
    public Class<javax.swing.event.TreeModelEvent> createNewSUT() {
        return javax.swing.event.TreeModelEvent.class;
    }

}
