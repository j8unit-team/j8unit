package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LSExceptionClassTest
implements org.j8unit.repository.org.w3c.dom.ls.LSExceptionClassTests<org.w3c.dom.ls.LSException> {

    @Override
    public Class<org.w3c.dom.ls.LSException> createNewSUT() {
        return org.w3c.dom.ls.LSException.class;
    }

}
