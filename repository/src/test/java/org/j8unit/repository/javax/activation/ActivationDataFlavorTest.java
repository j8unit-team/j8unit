package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationDataFlavorTest
implements org.j8unit.repository.javax.activation.ActivationDataFlavorTests<javax.activation.ActivationDataFlavor> {

    @Override
    public javax.activation.ActivationDataFlavor createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.activation.ActivationDataFlavor] available.");
    }

}
