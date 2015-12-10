package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotationClassTest
implements org.j8unit.repository.org.w3c.dom.NotationClassTests<org.w3c.dom.Notation> {

    @Override
    public Class<org.w3c.dom.Notation> createNewSUT() {
        return org.w3c.dom.Notation.class;
    }

}
