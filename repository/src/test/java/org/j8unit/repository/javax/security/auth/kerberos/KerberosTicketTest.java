package org.j8unit.repository.javax.security.auth.kerberos;

import javax.security.auth.kerberos.KerberosTicket;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KerberosTicketTest
implements org.j8unit.repository.javax.security.auth.kerberos.KerberosTicketTests<KerberosTicket> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.kerberos.KerberosTicket]

    @Override
    public KerberosTicket createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.kerberos.KerberosTicket], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.kerberos.KerberosTicket]

}
