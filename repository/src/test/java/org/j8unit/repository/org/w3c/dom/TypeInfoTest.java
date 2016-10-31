package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.TypeInfo;

@RunWith(J8Unit4.class)
public class TypeInfoTest
implements org.j8unit.repository.org.w3c.dom.TypeInfoTests<TypeInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.TypeInfo]

    @Override
    public TypeInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.TypeInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.TypeInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.TypeInfo]

}
