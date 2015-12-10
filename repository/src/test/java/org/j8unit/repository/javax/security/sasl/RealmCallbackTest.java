package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RealmCallbackTest
implements org.j8unit.repository.javax.security.sasl.RealmCallbackTests<javax.security.sasl.RealmCallback> {

    @Override
    public javax.security.sasl.RealmCallback createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.security.sasl.RealmCallback] available.");
    }

}
