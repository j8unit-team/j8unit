package org.j8unit.repository.javax.jws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebMethodClassTest
implements org.j8unit.repository.javax.jws.WebMethodClassTests<javax.jws.WebMethod> {

    @Override
    public Class<javax.jws.WebMethod> createNewSUT() {
        return javax.jws.WebMethod.class;
    }

}
