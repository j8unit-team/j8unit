package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameComponentHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.NameComponentHolderClassTests<org.omg.CosNaming.NameComponentHolder> {

    @Override
    public Class<org.omg.CosNaming.NameComponentHolder> createNewSUT() {
        return org.omg.CosNaming.NameComponentHolder.class;
    }

}
