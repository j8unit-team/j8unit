package org.j8unit.repository.javax.crypto.interfaces;

import javax.crypto.interfaces.DHKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DHKey} (by simply reusing the J8Unit
 * test interface {@link DHKeyTests}).
 */

@RunWith(J8Unit4.class)
public class DHKeyTest
implements DHKeyTests<DHKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.interfaces.DHKey]

    @Override
    public DHKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.interfaces.DHKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.interfaces.DHKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.interfaces.DHKey]

}
