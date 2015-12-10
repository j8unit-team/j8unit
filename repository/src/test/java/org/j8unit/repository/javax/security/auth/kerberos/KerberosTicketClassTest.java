package org.j8unit.repository.javax.security.auth.kerberos;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KerberosTicketClassTest
implements org.j8unit.repository.javax.security.auth.kerberos.KerberosTicketClassTests<javax.security.auth.kerberos.KerberosTicket> {

    @Override
    public Class<javax.security.auth.kerberos.KerberosTicket> createNewSUT() {
        return javax.security.auth.kerberos.KerberosTicket.class;
    }

}
