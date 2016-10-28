package org.j8unit.repository.javax.xml.ws.http;

import javax.xml.ws.http.HTTPBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTTPBindingClassTest
implements org.j8unit.repository.javax.xml.ws.http.HTTPBindingClassTests<HTTPBinding> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.http.HTTPBinding]

    @Override
    public Class<HTTPBinding> createNewSUT() {
        return HTTPBinding.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.http.HTTPBinding]

}
