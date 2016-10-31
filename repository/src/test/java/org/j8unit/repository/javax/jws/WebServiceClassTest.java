package org.j8unit.repository.javax.jws;

import javax.jws.WebService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceClassTest
implements org.j8unit.repository.javax.jws.WebServiceClassTests<WebService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.WebService]

    @Override
    public Class<WebService> createNewSUT() {
        return WebService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.jws.WebService]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.WebService]

}
