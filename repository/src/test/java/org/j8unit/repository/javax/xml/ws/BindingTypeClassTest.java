package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingTypeClassTest
implements org.j8unit.repository.javax.xml.ws.BindingTypeClassTests<javax.xml.ws.BindingType> {

    @Override
    public Class<javax.xml.ws.BindingType> createNewSUT() {
        return javax.xml.ws.BindingType.class;
    }

}
