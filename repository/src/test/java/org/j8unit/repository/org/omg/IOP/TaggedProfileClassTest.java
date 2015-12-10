package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TaggedProfileClassTest
implements org.j8unit.repository.org.omg.IOP.TaggedProfileClassTests<org.omg.IOP.TaggedProfile> {

    @Override
    public Class<org.omg.IOP.TaggedProfile> createNewSUT() {
        return org.omg.IOP.TaggedProfile.class;
    }

}
