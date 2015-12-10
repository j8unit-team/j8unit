package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EntityClassTest
implements org.j8unit.repository.org.w3c.dom.EntityClassTests<org.w3c.dom.Entity> {

    @Override
    public Class<org.w3c.dom.Entity> createNewSUT() {
        return org.w3c.dom.Entity.class;
    }

}
