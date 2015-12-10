package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecureClassLoaderClassTest
implements org.j8unit.repository.java.security.SecureClassLoaderClassTests<java.security.SecureClassLoader> {

    @Override
    public Class<java.security.SecureClassLoader> createNewSUT() {
        return java.security.SecureClassLoader.class;
    }

}
