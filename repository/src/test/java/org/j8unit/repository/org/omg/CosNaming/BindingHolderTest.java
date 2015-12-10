package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingHolderTest
implements org.j8unit.repository.org.omg.CosNaming.BindingHolderTests<org.omg.CosNaming.BindingHolder> {

    @Override
    public org.omg.CosNaming.BindingHolder createNewSUT() {
        return new org.omg.CosNaming.BindingHolder();
    }

}
