package org.j8unit.repository.java.io;

import java.io.Externalizable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExternalizableTest
implements org.j8unit.repository.java.io.ExternalizableTests<Externalizable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.Externalizable]

    @Override
    public Externalizable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.Externalizable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.Externalizable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.Externalizable]

}
