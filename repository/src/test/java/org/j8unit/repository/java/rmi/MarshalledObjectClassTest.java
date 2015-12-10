package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class MarshalledObjectClassTest
implements org.j8unit.repository.java.rmi.MarshalledObjectClassTests<java.rmi.MarshalledObject> {

    @Override
    public Class<java.rmi.MarshalledObject> createNewSUT() {
        return java.rmi.MarshalledObject.class;
    }

}
