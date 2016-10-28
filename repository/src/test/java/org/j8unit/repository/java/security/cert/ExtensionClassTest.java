package org.j8unit.repository.java.security.cert;

import java.security.cert.Extension;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExtensionClassTest
implements org.j8unit.repository.java.security.cert.ExtensionClassTests<Extension> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.Extension]

    @Override
    public Class<Extension> createNewSUT() {
        return Extension.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.Extension]

}
