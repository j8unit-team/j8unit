package org.j8unit.repository.javax.crypto.interfaces;

import javax.crypto.interfaces.DHPrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DHPrivateKey} (by simply reusing the
 * J8Unit test interface {@link DHPrivateKeyTests}).
 */

@RunWith(J8Unit4.class)
public class DHPrivateKeyTest
implements DHPrivateKeyTests<DHPrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.interfaces.DHPrivateKey]

    @Override
    public DHPrivateKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.interfaces.DHPrivateKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.interfaces.DHPrivateKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.interfaces.DHPrivateKey]

}
