package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TaggedProfileHolderTest
implements org.j8unit.repository.org.omg.IOP.TaggedProfileHolderTests<org.omg.IOP.TaggedProfileHolder> {

    @Override
    public org.omg.IOP.TaggedProfileHolder createNewSUT() {
        return new org.omg.IOP.TaggedProfileHolder();
    }

}
