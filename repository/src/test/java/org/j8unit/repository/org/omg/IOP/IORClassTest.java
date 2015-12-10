package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IORClassTest
implements org.j8unit.repository.org.omg.IOP.IORClassTests<org.omg.IOP.IOR> {

    @Override
    public Class<org.omg.IOP.IOR> createNewSUT() {
        return org.omg.IOP.IOR.class;
    }

}
