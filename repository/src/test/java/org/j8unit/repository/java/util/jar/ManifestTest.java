package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ManifestTest
implements org.j8unit.repository.java.util.jar.ManifestTests<java.util.jar.Manifest> {

    @Override
    public java.util.jar.Manifest createNewSUT() {
        return new java.util.jar.Manifest();
    }

}
