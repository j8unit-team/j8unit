package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.RealmChoiceCallback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RealmChoiceCallbackTest
implements org.j8unit.repository.javax.security.sasl.RealmChoiceCallbackTests<RealmChoiceCallback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.RealmChoiceCallback]

    @Override
    public RealmChoiceCallback createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.sasl.RealmChoiceCallback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.RealmChoiceCallback]

}
