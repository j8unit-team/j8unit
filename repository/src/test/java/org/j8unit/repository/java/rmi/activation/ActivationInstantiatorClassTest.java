package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationInstantiatorClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationInstantiatorClassTests<java.rmi.activation.ActivationInstantiator> {

    @Override
    public Class<java.rmi.activation.ActivationInstantiator> createNewSUT() {
        return java.rmi.activation.ActivationInstantiator.class;
    }

}
