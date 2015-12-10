package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IORHolderTest
implements org.j8unit.repository.org.omg.IOP.IORHolderTests<org.omg.IOP.IORHolder> {

    @Override
    public org.omg.IOP.IORHolder createNewSUT() {
        return new org.omg.IOP.IORHolder();
    }

}
