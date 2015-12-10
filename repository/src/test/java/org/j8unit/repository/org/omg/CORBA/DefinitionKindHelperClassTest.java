package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefinitionKindHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.DefinitionKindHelperClassTests<org.omg.CORBA.DefinitionKindHelper> {

    @Override
    public Class<org.omg.CORBA.DefinitionKindHelper> createNewSUT() {
        return org.omg.CORBA.DefinitionKindHelper.class;
    }

}
