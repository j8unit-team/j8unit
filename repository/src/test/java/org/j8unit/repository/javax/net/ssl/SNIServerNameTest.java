package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SNIServerName;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SNIServerNameTest
implements org.j8unit.repository.javax.net.ssl.SNIServerNameTests<SNIServerName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SNIServerName]

    @Override
    public SNIServerName createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.SNIServerName], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SNIServerName]

}
