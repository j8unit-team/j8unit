package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPBindingClassTest
implements org.j8unit.repository.javax.xml.ws.soap.SOAPBindingClassTests<javax.xml.ws.soap.SOAPBinding> {

    @Override
    public Class<javax.xml.ws.soap.SOAPBinding> createNewSUT() {
        return javax.xml.ws.soap.SOAPBinding.class;
    }

}
