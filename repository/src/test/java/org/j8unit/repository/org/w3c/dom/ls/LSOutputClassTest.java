package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LSOutputClassTest
implements org.j8unit.repository.org.w3c.dom.ls.LSOutputClassTests<org.w3c.dom.ls.LSOutput> {

    @Override
    public Class<org.w3c.dom.ls.LSOutput> createNewSUT() {
        return org.w3c.dom.ls.LSOutput.class;
    }

}
