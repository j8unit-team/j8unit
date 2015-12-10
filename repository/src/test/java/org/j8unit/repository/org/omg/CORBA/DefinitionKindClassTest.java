package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefinitionKindClassTest
implements org.j8unit.repository.org.omg.CORBA.DefinitionKindClassTests<org.omg.CORBA.DefinitionKind> {

    @Override
    public Class<org.omg.CORBA.DefinitionKind> createNewSUT() {
        return org.omg.CORBA.DefinitionKind.class;
    }

}
