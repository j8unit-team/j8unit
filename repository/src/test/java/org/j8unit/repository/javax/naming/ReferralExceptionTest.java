package org.j8unit.repository.javax.naming;

import javax.naming.ReferralException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferralExceptionTest
implements org.j8unit.repository.javax.naming.ReferralExceptionTests<ReferralException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ReferralException]

    @Override
    public ReferralException createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.ReferralException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ReferralException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ReferralException]

}
