package org.j8unit.repository.javax.jws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceClassTest
implements org.j8unit.repository.javax.jws.WebServiceClassTests<javax.jws.WebService> {

    @Override
    public Class<javax.jws.WebService> createNewSUT() {
        return javax.jws.WebService.class;
    }

}
