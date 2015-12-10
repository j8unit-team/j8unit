package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LSProgressEventClassTest
implements org.j8unit.repository.org.w3c.dom.ls.LSProgressEventClassTests<org.w3c.dom.ls.LSProgressEvent> {

    @Override
    public Class<org.w3c.dom.ls.LSProgressEvent> createNewSUT() {
        return org.w3c.dom.ls.LSProgressEvent.class;
    }

}
