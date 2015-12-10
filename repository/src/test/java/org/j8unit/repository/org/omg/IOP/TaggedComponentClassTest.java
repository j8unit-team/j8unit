package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TaggedComponentClassTest
implements org.j8unit.repository.org.omg.IOP.TaggedComponentClassTests<org.omg.IOP.TaggedComponent> {

    @Override
    public Class<org.omg.IOP.TaggedComponent> createNewSUT() {
        return org.omg.IOP.TaggedComponent.class;
    }

}
