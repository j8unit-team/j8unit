package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class HolderClassTest
implements org.j8unit.repository.javax.xml.ws.HolderClassTests<javax.xml.ws.Holder> {

    @Override
    public Class<javax.xml.ws.Holder> createNewSUT() {
        return javax.xml.ws.Holder.class;
    }

}
