package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Dispatch;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DispatchClassTest
implements org.j8unit.repository.javax.xml.ws.DispatchClassTests<Dispatch> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.Dispatch]

    @Override
    public Class<Dispatch> createNewSUT() {
        return Dispatch.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.Dispatch]

}
