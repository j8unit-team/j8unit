package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MessagePropClassTest
implements org.j8unit.repository.org.ietf.jgss.MessagePropClassTests<org.ietf.jgss.MessageProp> {

    @Override
    public Class<org.ietf.jgss.MessageProp> createNewSUT() {
        return org.ietf.jgss.MessageProp.class;
    }

}
