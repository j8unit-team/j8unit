package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActionClassTest
implements org.j8unit.repository.javax.xml.ws.ActionClassTests<javax.xml.ws.Action> {

    @Override
    public Class<javax.xml.ws.Action> createNewSUT() {
        return javax.xml.ws.Action.class;
    }

}
