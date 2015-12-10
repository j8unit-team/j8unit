package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AncestorListenerClassTest
implements org.j8unit.repository.javax.swing.event.AncestorListenerClassTests<javax.swing.event.AncestorListener> {

    @Override
    public Class<javax.swing.event.AncestorListener> createNewSUT() {
        return javax.swing.event.AncestorListener.class;
    }

}
