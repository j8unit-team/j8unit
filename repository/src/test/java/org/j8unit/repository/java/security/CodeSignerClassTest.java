package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CodeSignerClassTest
implements org.j8unit.repository.java.security.CodeSignerClassTests<java.security.CodeSigner> {

    @Override
    public Class<java.security.CodeSigner> createNewSUT() {
        return java.security.CodeSigner.class;
    }

}
