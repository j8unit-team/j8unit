package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExtensionClassTest
implements org.j8unit.repository.java.security.cert.ExtensionClassTests<java.security.cert.Extension> {

    @Override
    public Class<java.security.cert.Extension> createNewSUT() {
        return java.security.cert.Extension.class;
    }

}
