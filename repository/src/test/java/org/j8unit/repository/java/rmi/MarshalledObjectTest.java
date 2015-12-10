package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MarshalledObjectTest<T>
implements org.j8unit.repository.java.rmi.MarshalledObjectTests<java.rmi.MarshalledObject<T>, T> {

    @Override
    public java.rmi.MarshalledObject<T> createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.MarshalledObject] available.");
    }

}
