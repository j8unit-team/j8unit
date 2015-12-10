package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ManageReferralControlClassTest
implements org.j8unit.repository.javax.naming.ldap.ManageReferralControlClassTests<javax.naming.ldap.ManageReferralControl> {

    @Override
    public Class<javax.naming.ldap.ManageReferralControl> createNewSUT() {
        return javax.naming.ldap.ManageReferralControl.class;
    }

}
