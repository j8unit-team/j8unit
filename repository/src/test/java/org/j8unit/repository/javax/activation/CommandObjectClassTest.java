package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommandObjectClassTest
implements org.j8unit.repository.javax.activation.CommandObjectClassTests<javax.activation.CommandObject> {

    @Override
    public Class<javax.activation.CommandObject> createNewSUT() {
        return javax.activation.CommandObject.class;
    }

}
