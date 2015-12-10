package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslTest
implements org.j8unit.repository.javax.security.sasl.SaslTests<javax.security.sasl.Sasl> {

    @Override
    public javax.security.sasl.Sasl createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.security.sasl.Sasl] available.");
    }

}
