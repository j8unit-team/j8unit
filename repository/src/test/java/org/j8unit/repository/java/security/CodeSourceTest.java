package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CodeSourceTest
implements org.j8unit.repository.java.security.CodeSourceTests<java.security.CodeSource> {

    @Override
    public java.security.CodeSource createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.CodeSource] available.");
    }

}
