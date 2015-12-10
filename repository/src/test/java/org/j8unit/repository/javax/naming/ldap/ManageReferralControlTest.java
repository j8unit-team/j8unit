package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ManageReferralControlTest
implements org.j8unit.repository.javax.naming.ldap.ManageReferralControlTests<javax.naming.ldap.ManageReferralControl> {

    @Override
    public javax.naming.ldap.ManageReferralControl createNewSUT() {
        return new javax.naming.ldap.ManageReferralControl();
    }

}
