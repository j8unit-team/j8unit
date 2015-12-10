package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommandInfoClassTest
implements org.j8unit.repository.javax.activation.CommandInfoClassTests<javax.activation.CommandInfo> {

    @Override
    public Class<javax.activation.CommandInfo> createNewSUT() {
        return javax.activation.CommandInfo.class;
    }

}
