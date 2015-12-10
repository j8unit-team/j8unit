package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TaggedProfileHolderClassTest
implements org.j8unit.repository.org.omg.IOP.TaggedProfileHolderClassTests<org.omg.IOP.TaggedProfileHolder> {

    @Override
    public Class<org.omg.IOP.TaggedProfileHolder> createNewSUT() {
        return org.omg.IOP.TaggedProfileHolder.class;
    }

}
