package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TaggedProfileHelperClassTest
implements org.j8unit.repository.org.omg.IOP.TaggedProfileHelperClassTests<org.omg.IOP.TaggedProfileHelper> {

    @Override
    public Class<org.omg.IOP.TaggedProfileHelper> createNewSUT() {
        return org.omg.IOP.TaggedProfileHelper.class;
    }

}
