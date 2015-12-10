package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultipleComponentProfileHolderClassTest
implements org.j8unit.repository.org.omg.IOP.MultipleComponentProfileHolderClassTests<org.omg.IOP.MultipleComponentProfileHolder> {

    @Override
    public Class<org.omg.IOP.MultipleComponentProfileHolder> createNewSUT() {
        return org.omg.IOP.MultipleComponentProfileHolder.class;
    }

}
