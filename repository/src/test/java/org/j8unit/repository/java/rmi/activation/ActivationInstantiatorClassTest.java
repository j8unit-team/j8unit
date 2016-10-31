package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationInstantiator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationInstantiatorClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationInstantiatorClassTests<ActivationInstantiator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.activation.ActivationInstantiator]

    @Override
    public Class<ActivationInstantiator> createNewSUT() {
        return ActivationInstantiator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.activation.ActivationInstantiator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.activation.ActivationInstantiator]

}
