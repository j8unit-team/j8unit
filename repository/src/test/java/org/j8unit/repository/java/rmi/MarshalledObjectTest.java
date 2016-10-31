package org.j8unit.repository.java.rmi;

import java.rmi.MarshalledObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MarshalledObjectTest<T>
implements org.j8unit.repository.java.rmi.MarshalledObjectTests<MarshalledObject<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.MarshalledObject]

    @Override
    public MarshalledObject<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.MarshalledObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.MarshalledObject]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.MarshalledObject]

}
