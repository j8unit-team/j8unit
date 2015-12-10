package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnionTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.UnionTypeClassTests<javax.lang.model.type.UnionType> {

    @Override
    public Class<javax.lang.model.type.UnionType> createNewSUT() {
        return javax.lang.model.type.UnionType.class;
    }

}
