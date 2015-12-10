package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class TypeVisitorClassTest
implements org.j8unit.repository.javax.lang.model.type.TypeVisitorClassTests<javax.lang.model.type.TypeVisitor> {

    @Override
    public Class<javax.lang.model.type.TypeVisitor> createNewSUT() {
        return javax.lang.model.type.TypeVisitor.class;
    }

}
