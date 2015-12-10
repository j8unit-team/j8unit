package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LSLoadEventClassTest
implements org.j8unit.repository.org.w3c.dom.ls.LSLoadEventClassTests<org.w3c.dom.ls.LSLoadEvent> {

    @Override
    public Class<org.w3c.dom.ls.LSLoadEvent> createNewSUT() {
        return org.w3c.dom.ls.LSLoadEvent.class;
    }

}
