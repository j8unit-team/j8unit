package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.AuthorizeCallback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthorizeCallbackTest
implements org.j8unit.repository.javax.security.sasl.AuthorizeCallbackTests<AuthorizeCallback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.AuthorizeCallback]

    @Override
    public AuthorizeCallback createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.sasl.AuthorizeCallback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.AuthorizeCallback]

}
