package org.j8unit.repository.javax.naming;

import javax.naming.Referenceable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferenceableTest
implements org.j8unit.repository.javax.naming.ReferenceableTests<Referenceable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.Referenceable]

    @Override
    public Referenceable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.Referenceable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.Referenceable]

}
