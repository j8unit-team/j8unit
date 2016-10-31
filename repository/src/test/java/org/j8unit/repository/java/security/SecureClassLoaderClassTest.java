package org.j8unit.repository.java.security;

import java.security.SecureClassLoader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecureClassLoaderClassTest
implements org.j8unit.repository.java.security.SecureClassLoaderClassTests<SecureClassLoader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.SecureClassLoader]

    @Override
    public Class<SecureClassLoader> createNewSUT() {
        return SecureClassLoader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.SecureClassLoader]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.SecureClassLoader]

}
