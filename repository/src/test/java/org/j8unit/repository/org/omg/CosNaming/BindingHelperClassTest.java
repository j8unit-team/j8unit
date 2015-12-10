package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingHelperClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingHelperClassTests<org.omg.CosNaming.BindingHelper> {

    @Override
    public Class<org.omg.CosNaming.BindingHelper> createNewSUT() {
        return org.omg.CosNaming.BindingHelper.class;
    }

}
