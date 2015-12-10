package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class DispatchClassTest
implements org.j8unit.repository.javax.xml.ws.DispatchClassTests<javax.xml.ws.Dispatch> {

    @Override
    public Class<javax.xml.ws.Dispatch> createNewSUT() {
        return javax.xml.ws.Dispatch.class;
    }

}
