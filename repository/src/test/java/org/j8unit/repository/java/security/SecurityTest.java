package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecurityTest
implements org.j8unit.repository.java.security.SecurityTests<java.security.Security> {

    @Override
    public java.security.Security createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.Security] available.");
    }

}
