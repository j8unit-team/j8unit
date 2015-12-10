package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.NameHolderClassTests<org.omg.CosNaming.NameHolder> {

    @Override
    public Class<org.omg.CosNaming.NameHolder> createNewSUT() {
        return org.omg.CosNaming.NameHolder.class;
    }

}
