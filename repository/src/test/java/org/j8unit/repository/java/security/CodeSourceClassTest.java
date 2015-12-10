package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CodeSourceClassTest
implements org.j8unit.repository.java.security.CodeSourceClassTests<java.security.CodeSource> {

    @Override
    public Class<java.security.CodeSource> createNewSUT() {
        return java.security.CodeSource.class;
    }

}
