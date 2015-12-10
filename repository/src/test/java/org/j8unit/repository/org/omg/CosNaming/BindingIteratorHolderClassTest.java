package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingIteratorHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingIteratorHolderClassTests<org.omg.CosNaming.BindingIteratorHolder> {

    @Override
    public Class<org.omg.CosNaming.BindingIteratorHolder> createNewSUT() {
        return org.omg.CosNaming.BindingIteratorHolder.class;
    }

}
