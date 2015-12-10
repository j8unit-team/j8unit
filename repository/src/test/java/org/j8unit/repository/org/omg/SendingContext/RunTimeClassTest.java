package org.j8unit.repository.org.omg.SendingContext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RunTimeClassTest
implements org.j8unit.repository.org.omg.SendingContext.RunTimeClassTests<org.omg.SendingContext.RunTime> {

    @Override
    public Class<org.omg.SendingContext.RunTime> createNewSUT() {
        return org.omg.SendingContext.RunTime.class;
    }

}
