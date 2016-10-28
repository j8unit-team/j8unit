package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.NameList;

@RunWith(J8Unit4.class)
public class NameListClassTest
implements org.j8unit.repository.org.w3c.dom.NameListClassTests<NameList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.NameList]

    @Override
    public Class<NameList> createNewSUT() {
        return NameList.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.NameList]

}
