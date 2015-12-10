package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TaggedComponentTest
implements org.j8unit.repository.org.omg.IOP.TaggedComponentTests<org.omg.IOP.TaggedComponent> {

    @Override
    public org.omg.IOP.TaggedComponent createNewSUT() {
        return new org.omg.IOP.TaggedComponent();
    }

}
