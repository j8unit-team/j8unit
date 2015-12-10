package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameListClassTest
implements org.j8unit.repository.org.w3c.dom.NameListClassTests<org.w3c.dom.NameList> {

    @Override
    public Class<org.w3c.dom.NameList> createNewSUT() {
        return org.w3c.dom.NameList.class;
    }

}
