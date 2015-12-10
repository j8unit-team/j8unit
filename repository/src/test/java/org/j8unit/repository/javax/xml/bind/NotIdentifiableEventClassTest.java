package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotIdentifiableEventClassTest
implements org.j8unit.repository.javax.xml.bind.NotIdentifiableEventClassTests<javax.xml.bind.NotIdentifiableEvent> {

    @Override
    public Class<javax.xml.bind.NotIdentifiableEvent> createNewSUT() {
        return javax.xml.bind.NotIdentifiableEvent.class;
    }

}
