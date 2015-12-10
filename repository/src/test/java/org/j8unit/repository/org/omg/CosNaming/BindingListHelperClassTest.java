package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingListHelperClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingListHelperClassTests<org.omg.CosNaming.BindingListHelper> {

    @Override
    public Class<org.omg.CosNaming.BindingListHelper> createNewSUT() {
        return org.omg.CosNaming.BindingListHelper.class;
    }

}
