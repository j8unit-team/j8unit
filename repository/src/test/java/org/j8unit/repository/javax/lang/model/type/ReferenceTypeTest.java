package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.ReferenceType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferenceTypeTest
implements org.j8unit.repository.javax.lang.model.type.ReferenceTypeTests<ReferenceType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.ReferenceType]

    @Override
    public ReferenceType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.type.ReferenceType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.type.ReferenceType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.type.ReferenceType]

}
