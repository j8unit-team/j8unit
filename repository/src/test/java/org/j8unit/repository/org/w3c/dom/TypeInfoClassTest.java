package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.TypeInfo;

@RunWith(J8Unit4.class)
public class TypeInfoClassTest
implements org.j8unit.repository.org.w3c.dom.TypeInfoClassTests<TypeInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.TypeInfo]

    @Override
    public Class<TypeInfo> createNewSUT() {
        return TypeInfo.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.TypeInfo]

}
