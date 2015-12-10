package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingTypeHolderTest
implements org.j8unit.repository.org.omg.CosNaming.BindingTypeHolderTests<org.omg.CosNaming.BindingTypeHolder> {

    @Override
    public org.omg.CosNaming.BindingTypeHolder createNewSUT() {
        return new org.omg.CosNaming.BindingTypeHolder();
    }

}
