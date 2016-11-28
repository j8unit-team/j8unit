package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.Manifest;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Manifest} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.ManifestClassTests}).
 */
@RunWith(J8Unit4.class)
public class ManifestClassTest
implements ManifestClassTests<Manifest> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.Manifest]

    @Override
    public Class<Manifest> createNewSUT() {
        return Manifest.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.Manifest]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.Manifest]

}
