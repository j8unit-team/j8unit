package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ManifestClassTest
implements org.j8unit.repository.java.util.jar.ManifestClassTests<java.util.jar.Manifest> {

    @Override
    public Class<java.util.jar.Manifest> createNewSUT() {
        return java.util.jar.Manifest.class;
    }

}
