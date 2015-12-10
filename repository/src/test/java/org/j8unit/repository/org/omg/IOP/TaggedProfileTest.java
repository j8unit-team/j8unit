package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TaggedProfileTest
implements org.j8unit.repository.org.omg.IOP.TaggedProfileTests<org.omg.IOP.TaggedProfile> {

    @Override
    public org.omg.IOP.TaggedProfile createNewSUT() {
        return new org.omg.IOP.TaggedProfile();
    }

}
