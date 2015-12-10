package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TaggedComponentHolderClassTest
implements org.j8unit.repository.org.omg.IOP.TaggedComponentHolderClassTests<org.omg.IOP.TaggedComponentHolder> {

    @Override
    public Class<org.omg.IOP.TaggedComponentHolder> createNewSUT() {
        return org.omg.IOP.TaggedComponentHolder.class;
    }

}
