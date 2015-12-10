package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingListHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingListHolderClassTests<org.omg.CosNaming.BindingListHolder> {

    @Override
    public Class<org.omg.CosNaming.BindingListHolder> createNewSUT() {
        return org.omg.CosNaming.BindingListHolder.class;
    }

}
