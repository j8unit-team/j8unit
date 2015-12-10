package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TaggedComponentHolderTest
implements org.j8unit.repository.org.omg.IOP.TaggedComponentHolderTests<org.omg.IOP.TaggedComponentHolder> {

    @Override
    public org.omg.IOP.TaggedComponentHolder createNewSUT() {
        return new org.omg.IOP.TaggedComponentHolder();
    }

}
