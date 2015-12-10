package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingTypeHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingTypeHolderClassTests<org.omg.CosNaming.BindingTypeHolder> {

    @Override
    public Class<org.omg.CosNaming.BindingTypeHolder> createNewSUT() {
        return org.omg.CosNaming.BindingTypeHolder.class;
    }

}
