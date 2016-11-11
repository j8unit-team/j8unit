package org.j8unit.repository.javax.crypto.interfaces;

import javax.crypto.interfaces.PBEKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PBEKey} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.crypto.interfaces.PBEKeyTests}).
 */

@RunWith(J8Unit4.class)
public class PBEKeyTest
implements PBEKeyTests<PBEKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.interfaces.PBEKey]

    @Override
    public PBEKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.interfaces.PBEKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.interfaces.PBEKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.interfaces.PBEKey]

}
