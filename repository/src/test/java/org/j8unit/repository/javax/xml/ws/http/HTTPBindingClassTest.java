package org.j8unit.repository.javax.xml.ws.http;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTTPBindingClassTest
implements org.j8unit.repository.javax.xml.ws.http.HTTPBindingClassTests<javax.xml.ws.http.HTTPBinding> {

    @Override
    public Class<javax.xml.ws.http.HTTPBinding> createNewSUT() {
        return javax.xml.ws.http.HTTPBinding.class;
    }

}
