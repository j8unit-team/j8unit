package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslClientFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslClientFactoryTest
implements org.j8unit.repository.javax.security.sasl.SaslClientFactoryTests<SaslClientFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.SaslClientFactory]

    @Override
    public SaslClientFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.sasl.SaslClientFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.sasl.SaslClientFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.sasl.SaslClientFactory]

}
