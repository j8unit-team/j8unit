package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LSInputClassTest
implements org.j8unit.repository.org.w3c.dom.ls.LSInputClassTests<org.w3c.dom.ls.LSInput> {

    @Override
    public Class<org.w3c.dom.ls.LSInput> createNewSUT() {
        return org.w3c.dom.ls.LSInput.class;
    }

}
