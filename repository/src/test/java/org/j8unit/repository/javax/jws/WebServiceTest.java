package org.j8unit.repository.javax.jws;

import javax.jws.WebService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceTest
implements org.j8unit.repository.javax.jws.WebServiceTests<WebService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.WebService]

    @Override
    public WebService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.WebService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.WebService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.WebService]

}
