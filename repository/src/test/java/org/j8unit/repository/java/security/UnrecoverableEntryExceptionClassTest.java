package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnrecoverableEntryExceptionClassTest
implements org.j8unit.repository.java.security.UnrecoverableEntryExceptionClassTests<java.security.UnrecoverableEntryException> {

    @Override
    public Class<java.security.UnrecoverableEntryException> createNewSUT() {
        return java.security.UnrecoverableEntryException.class;
    }

}
