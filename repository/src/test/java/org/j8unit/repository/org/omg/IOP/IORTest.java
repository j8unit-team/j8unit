package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IORTest
implements org.j8unit.repository.org.omg.IOP.IORTests<org.omg.IOP.IOR> {

    @Override
    public org.omg.IOP.IOR createNewSUT() {
        return new org.omg.IOP.IOR();
    }

}
