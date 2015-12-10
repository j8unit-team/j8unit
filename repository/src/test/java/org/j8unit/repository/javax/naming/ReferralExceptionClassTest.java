package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferralExceptionClassTest
implements org.j8unit.repository.javax.naming.ReferralExceptionClassTests<javax.naming.ReferralException> {

    @Override
    public Class<javax.naming.ReferralException> createNewSUT() {
        return javax.naming.ReferralException.class;
    }

}
