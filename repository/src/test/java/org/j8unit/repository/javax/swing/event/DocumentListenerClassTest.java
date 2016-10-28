package org.j8unit.repository.javax.swing.event;

import javax.swing.event.DocumentListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentListenerClassTest
implements org.j8unit.repository.javax.swing.event.DocumentListenerClassTests<DocumentListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.DocumentListener]

    @Override
    public Class<DocumentListener> createNewSUT() {
        return DocumentListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.DocumentListener]

}
