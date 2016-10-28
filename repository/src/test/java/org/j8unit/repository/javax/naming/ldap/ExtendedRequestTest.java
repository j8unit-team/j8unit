package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.ExtendedRequest;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExtendedRequestTest
implements org.j8unit.repository.javax.naming.ldap.ExtendedRequestTests<ExtendedRequest> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.ExtendedRequest]

    @Override
    public ExtendedRequest createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.ldap.ExtendedRequest], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.ExtendedRequest]

}
