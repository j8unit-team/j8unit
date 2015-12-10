package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComponentIdHelperClassTest
implements org.j8unit.repository.org.omg.IOP.ComponentIdHelperClassTests<org.omg.IOP.ComponentIdHelper> {

    @Override
    public Class<org.omg.IOP.ComponentIdHelper> createNewSUT() {
        return org.omg.IOP.ComponentIdHelper.class;
    }

}
