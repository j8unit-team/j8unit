package org.j8unit.repository.javax.security.auth.kerberos;

import javax.security.auth.kerberos.KerberosTicket;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KerberosTicketClassTest
implements org.j8unit.repository.javax.security.auth.kerberos.KerberosTicketClassTests<KerberosTicket> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.kerberos.KerberosTicket]

    @Override
    public Class<KerberosTicket> createNewSUT() {
        return KerberosTicket.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.kerberos.KerberosTicket#KerberosTicket(byte[], javax.security.auth.kerberos.KerberosPrincipal, javax.security.auth.kerberos.KerberosPrincipal, byte[], int, boolean[], java.util.Date, java.util.Date, java.util.Date, java.util.Date, java.net.InetAddress[])
     * public
     * javax.security.auth.kerberos.KerberosTicket(byte[],javax.security.auth.kerberos.KerberosPrincipal,javax.security.auth.kerberos.KerberosPrincipal,byte[],int,boolean[],java.util.Date,java.util.Date,java.util.Date,java.util.Date,java.net.InetAddress[])}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_KerberosTicket_byteArray_KerberosPrincipal_KerberosPrincipal_byteArray_int_booleanArray_Date_Date_Date_Date_InetAddressArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KerberosTicket sut = null; // = new KerberosTicket(byte[], javax.security.auth.kerberos.KerberosPrincipal,
                                         // javax.security.auth.kerberos.KerberosPrincipal, byte[], int, boolean[],
                                         // java.util.Date, java.util.Date, java.util.Date, java.util.Date,
                                         // java.net.InetAddress[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.kerberos.KerberosTicket]

}
