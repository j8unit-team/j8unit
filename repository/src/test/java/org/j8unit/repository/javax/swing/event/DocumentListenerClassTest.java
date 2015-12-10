package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentListenerClassTest
implements org.j8unit.repository.javax.swing.event.DocumentListenerClassTests<javax.swing.event.DocumentListener> {

    @Override
    public Class<javax.swing.event.DocumentListener> createNewSUT() {
        return javax.swing.event.DocumentListener.class;
    }

}
