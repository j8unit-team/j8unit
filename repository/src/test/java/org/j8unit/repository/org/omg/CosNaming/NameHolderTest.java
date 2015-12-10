package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameHolderTest
implements org.j8unit.repository.org.omg.CosNaming.NameHolderTests<org.omg.CosNaming.NameHolder> {

    @Override
    public org.omg.CosNaming.NameHolder createNewSUT() {
        return new org.omg.CosNaming.NameHolder();
    }

}
