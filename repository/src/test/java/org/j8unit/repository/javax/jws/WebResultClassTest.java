package org.j8unit.repository.javax.jws;

import javax.jws.WebResult;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebResultClassTest
implements org.j8unit.repository.javax.jws.WebResultClassTests<WebResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.WebResult]

    @Override
    public Class<WebResult> createNewSUT() {
        return WebResult.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.jws.WebResult]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.WebResult]

}
