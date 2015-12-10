package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameComponentTest
implements org.j8unit.repository.org.omg.CosNaming.NameComponentTests<org.omg.CosNaming.NameComponent> {

    @Override
    public org.omg.CosNaming.NameComponent createNewSUT() {
        return new org.omg.CosNaming.NameComponent();
    }

}
