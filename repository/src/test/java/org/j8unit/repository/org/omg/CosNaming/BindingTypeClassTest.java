package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingTypeClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingTypeClassTests<org.omg.CosNaming.BindingType> {

    @Override
    public Class<org.omg.CosNaming.BindingType> createNewSUT() {
        return org.omg.CosNaming.BindingType.class;
    }

}
