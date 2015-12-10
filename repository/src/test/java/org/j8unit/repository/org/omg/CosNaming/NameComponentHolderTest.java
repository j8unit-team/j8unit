package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameComponentHolderTest
implements org.j8unit.repository.org.omg.CosNaming.NameComponentHolderTests<org.omg.CosNaming.NameComponentHolder> {

    @Override
    public org.omg.CosNaming.NameComponentHolder createNewSUT() {
        return new org.omg.CosNaming.NameComponentHolder();
    }

}
