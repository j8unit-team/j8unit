package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TaggedComponentHelperClassTest
implements org.j8unit.repository.org.omg.IOP.TaggedComponentHelperClassTests<org.omg.IOP.TaggedComponentHelper> {

    @Override
    public Class<org.omg.IOP.TaggedComponentHelper> createNewSUT() {
        return org.omg.IOP.TaggedComponentHelper.class;
    }

}
