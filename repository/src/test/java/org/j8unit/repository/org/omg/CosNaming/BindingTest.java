package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingTest
implements org.j8unit.repository.org.omg.CosNaming.BindingTests<org.omg.CosNaming.Binding> {

    @Override
    public org.omg.CosNaming.Binding createNewSUT() {
        return new org.omg.CosNaming.Binding();
    }

}
