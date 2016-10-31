package org.j8unit.repository.javax.jws;

import javax.jws.Oneway;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OnewayTest
implements org.j8unit.repository.javax.jws.OnewayTests<Oneway> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.Oneway]

    @Override
    public Oneway createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.Oneway], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.Oneway]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.Oneway]

}
