package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslClient;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslClientTest
implements org.j8unit.repository.javax.security.sasl.SaslClientTests<SaslClient> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.SaslClient]

    @Override
    public SaslClient createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.sasl.SaslClient], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.SaslClient]

}
