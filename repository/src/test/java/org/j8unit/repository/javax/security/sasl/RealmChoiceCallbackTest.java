package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RealmChoiceCallbackTest
implements org.j8unit.repository.javax.security.sasl.RealmChoiceCallbackTests<javax.security.sasl.RealmChoiceCallback> {

    @Override
    public javax.security.sasl.RealmChoiceCallback createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.security.sasl.RealmChoiceCallback] available.");
    }

}
