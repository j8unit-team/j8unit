package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingClassTest
implements org.j8unit.repository.javax.xml.ws.BindingClassTests<javax.xml.ws.Binding> {

    @Override
    public Class<javax.xml.ws.Binding> createNewSUT() {
        return javax.xml.ws.Binding.class;
    }

}
