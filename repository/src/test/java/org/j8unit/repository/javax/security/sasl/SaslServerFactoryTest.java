package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslServerFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslServerFactoryTest
implements org.j8unit.repository.javax.security.sasl.SaslServerFactoryTests<SaslServerFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.SaslServerFactory]

    @Override
    public SaslServerFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.sasl.SaslServerFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.SaslServerFactory]

}
