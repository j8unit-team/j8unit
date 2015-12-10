package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultipleComponentProfileHolderTest
implements org.j8unit.repository.org.omg.IOP.MultipleComponentProfileHolderTests<org.omg.IOP.MultipleComponentProfileHolder> {

    @Override
    public org.omg.IOP.MultipleComponentProfileHolder createNewSUT() {
        return new org.omg.IOP.MultipleComponentProfileHolder();
    }

}
