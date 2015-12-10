package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommandMapClassTest
implements org.j8unit.repository.javax.activation.CommandMapClassTests<javax.activation.CommandMap> {

    @Override
    public Class<javax.activation.CommandMap> createNewSUT() {
        return javax.activation.CommandMap.class;
    }

}
