package org.j8unit.repository.javax.jws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebResultClassTest
implements org.j8unit.repository.javax.jws.WebResultClassTests<javax.jws.WebResult> {

    @Override
    public Class<javax.jws.WebResult> createNewSUT() {
        return javax.jws.WebResult.class;
    }

}
