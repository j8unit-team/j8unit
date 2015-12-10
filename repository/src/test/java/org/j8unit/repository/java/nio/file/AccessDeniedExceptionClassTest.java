package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessDeniedExceptionClassTest
implements org.j8unit.repository.java.nio.file.AccessDeniedExceptionClassTests<java.nio.file.AccessDeniedException> {

    @Override
    public Class<java.nio.file.AccessDeniedException> createNewSUT() {
        return java.nio.file.AccessDeniedException.class;
    }

}
