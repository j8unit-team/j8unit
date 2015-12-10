package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RespectBindingClassTest
implements org.j8unit.repository.javax.xml.ws.RespectBindingClassTests<javax.xml.ws.RespectBinding> {

    @Override
    public Class<javax.xml.ws.RespectBinding> createNewSUT() {
        return javax.xml.ws.RespectBinding.class;
    }

}
