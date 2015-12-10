package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnrecoverableEntryExceptionTest
implements org.j8unit.repository.java.security.UnrecoverableEntryExceptionTests<java.security.UnrecoverableEntryException> {

    @Override
    public java.security.UnrecoverableEntryException createNewSUT() {
        return new java.security.UnrecoverableEntryException();
    }

}
