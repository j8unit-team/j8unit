package org.j8unit.repository.javax.security.auth.kerberos;

import javax.security.auth.kerberos.KerberosKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KerberosKeyTest
implements org.j8unit.repository.javax.security.auth.kerberos.KerberosKeyTests<KerberosKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.kerberos.KerberosKey]

    @Override
    public KerberosKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.kerberos.KerberosKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.kerberos.KerberosKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.kerberos.KerberosKey]

}
