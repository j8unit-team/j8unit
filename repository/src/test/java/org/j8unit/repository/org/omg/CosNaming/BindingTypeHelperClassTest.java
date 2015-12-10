package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingTypeHelperClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingTypeHelperClassTests<org.omg.CosNaming.BindingTypeHelper> {

    @Override
    public Class<org.omg.CosNaming.BindingTypeHelper> createNewSUT() {
        return org.omg.CosNaming.BindingTypeHelper.class;
    }

}
