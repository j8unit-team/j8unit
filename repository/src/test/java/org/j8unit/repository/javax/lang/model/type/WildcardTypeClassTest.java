package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WildcardTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.WildcardTypeClassTests<javax.lang.model.type.WildcardType> {

    @Override
    public Class<javax.lang.model.type.WildcardType> createNewSUT() {
        return javax.lang.model.type.WildcardType.class;
    }

}
