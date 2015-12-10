package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingIteratorHolderTest
implements org.j8unit.repository.org.omg.CosNaming.BindingIteratorHolderTests<org.omg.CosNaming.BindingIteratorHolder> {

    @Override
    public org.omg.CosNaming.BindingIteratorHolder createNewSUT() {
        return new org.omg.CosNaming.BindingIteratorHolder();
    }

}
