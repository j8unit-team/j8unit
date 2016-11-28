package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.Manifest;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Manifest} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.ManifestTests}).
 */
@RunWith(J8Unit4.class)
public class ManifestTest
implements ManifestTests<Manifest> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.Manifest]

    @Override
    public Manifest createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.Manifest], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.Manifest]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.Manifest]

}
