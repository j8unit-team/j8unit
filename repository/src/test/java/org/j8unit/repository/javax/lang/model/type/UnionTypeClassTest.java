package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.UnionType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnionTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.UnionTypeClassTests<UnionType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.UnionType]

    @Override
    public Class<UnionType> createNewSUT() {
        return UnionType.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.UnionType]

}
