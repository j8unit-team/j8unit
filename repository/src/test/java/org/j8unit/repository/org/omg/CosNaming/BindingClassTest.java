package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingClassTests<org.omg.CosNaming.Binding> {

    @Override
    public Class<org.omg.CosNaming.Binding> createNewSUT() {
        return org.omg.CosNaming.Binding.class;
    }

}
