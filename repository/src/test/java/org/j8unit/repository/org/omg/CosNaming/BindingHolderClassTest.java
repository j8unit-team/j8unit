package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingHolderClassTests<org.omg.CosNaming.BindingHolder> {

    @Override
    public Class<org.omg.CosNaming.BindingHolder> createNewSUT() {
        return org.omg.CosNaming.BindingHolder.class;
    }

}
