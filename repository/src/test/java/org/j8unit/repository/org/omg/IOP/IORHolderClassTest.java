package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IORHolderClassTest
implements org.j8unit.repository.org.omg.IOP.IORHolderClassTests<org.omg.IOP.IORHolder> {

    @Override
    public Class<org.omg.IOP.IORHolder> createNewSUT() {
        return org.omg.IOP.IORHolder.class;
    }

}
