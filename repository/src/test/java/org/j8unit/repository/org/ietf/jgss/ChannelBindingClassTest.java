package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChannelBindingClassTest
implements org.j8unit.repository.org.ietf.jgss.ChannelBindingClassTests<org.ietf.jgss.ChannelBinding> {

    @Override
    public Class<org.ietf.jgss.ChannelBinding> createNewSUT() {
        return org.ietf.jgss.ChannelBinding.class;
    }

}
