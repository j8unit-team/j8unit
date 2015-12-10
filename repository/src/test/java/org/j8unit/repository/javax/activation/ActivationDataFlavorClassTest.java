package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationDataFlavorClassTest
implements org.j8unit.repository.javax.activation.ActivationDataFlavorClassTests<javax.activation.ActivationDataFlavor> {

    @Override
    public Class<javax.activation.ActivationDataFlavor> createNewSUT() {
        return javax.activation.ActivationDataFlavor.class;
    }

}
