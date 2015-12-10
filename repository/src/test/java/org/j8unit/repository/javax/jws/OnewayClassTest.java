package org.j8unit.repository.javax.jws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OnewayClassTest
implements org.j8unit.repository.javax.jws.OnewayClassTests<javax.jws.Oneway> {

    @Override
    public Class<javax.jws.Oneway> createNewSUT() {
        return javax.jws.Oneway.class;
    }

}
