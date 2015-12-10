package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeInfoClassTest
implements org.j8unit.repository.org.w3c.dom.TypeInfoClassTests<org.w3c.dom.TypeInfo> {

    @Override
    public Class<org.w3c.dom.TypeInfo> createNewSUT() {
        return org.w3c.dom.TypeInfo.class;
    }

}
