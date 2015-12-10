package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameComponentClassTest
implements org.j8unit.repository.org.omg.CosNaming.NameComponentClassTests<org.omg.CosNaming.NameComponent> {

    @Override
    public Class<org.omg.CosNaming.NameComponent> createNewSUT() {
        return org.omg.CosNaming.NameComponent.class;
    }

}
