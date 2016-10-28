package org.j8unit.repository.javax.crypto.interfaces;

import javax.crypto.interfaces.DHKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DHKeyTest
implements org.j8unit.repository.javax.crypto.interfaces.DHKeyTests<DHKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.interfaces.DHKey]

    @Override
    public DHKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.interfaces.DHKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.interfaces.DHKey]

}
