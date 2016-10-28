package org.j8unit.repository.javax.crypto;

import javax.crypto.SealedObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SealedObjectTest
implements org.j8unit.repository.javax.crypto.SealedObjectTests<SealedObject> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.SealedObject]

    @Override
    public SealedObject createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.SealedObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.SealedObject]

}
