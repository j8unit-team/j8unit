package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FidelityClassTest
implements org.j8unit.repository.javax.print.attribute.standard.FidelityClassTests<javax.print.attribute.standard.Fidelity> {

    @Override
    public Class<javax.print.attribute.standard.Fidelity> createNewSUT() {
        return javax.print.attribute.standard.Fidelity.class;
    }

}
