package org.j8unit.repository.javax.jws;

import javax.jws.Oneway;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OnewayClassTest
implements org.j8unit.repository.javax.jws.OnewayClassTests<Oneway> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.Oneway]

    @Override
    public Class<Oneway> createNewSUT() {
        return Oneway.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.Oneway]

}
