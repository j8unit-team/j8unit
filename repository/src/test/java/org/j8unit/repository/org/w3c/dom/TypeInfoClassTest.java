package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.TypeInfo;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TypeInfo} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.TypeInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class TypeInfoClassTest
implements TypeInfoClassTests<TypeInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.TypeInfo]

    @Override
    public Class<TypeInfo> createNewSUT() {
        return TypeInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.TypeInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.TypeInfo]

}
