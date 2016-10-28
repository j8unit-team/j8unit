package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.WildcardType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WildcardTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.WildcardTypeClassTests<WildcardType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.WildcardType]

    @Override
    public Class<WildcardType> createNewSUT() {
        return WildcardType.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.WildcardType]

}
