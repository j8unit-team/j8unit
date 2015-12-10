package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingListHolderTest
implements org.j8unit.repository.org.omg.CosNaming.BindingListHolderTests<org.omg.CosNaming.BindingListHolder> {

    @Override
    public org.omg.CosNaming.BindingListHolder createNewSUT() {
        return new org.omg.CosNaming.BindingListHolder();
    }

}
