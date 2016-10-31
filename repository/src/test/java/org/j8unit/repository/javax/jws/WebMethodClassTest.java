package org.j8unit.repository.javax.jws;

import javax.jws.WebMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebMethodClassTest
implements org.j8unit.repository.javax.jws.WebMethodClassTests<WebMethod> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.WebMethod]

    @Override
    public Class<WebMethod> createNewSUT() {
        return WebMethod.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.jws.WebMethod]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.WebMethod]

}
