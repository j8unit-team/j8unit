package org.j8unit.repository.org.omg.SendingContext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RunTimeOperationsClassTest
implements org.j8unit.repository.org.omg.SendingContext.RunTimeOperationsClassTests<org.omg.SendingContext.RunTimeOperations> {

    @Override
    public Class<org.omg.SendingContext.RunTimeOperations> createNewSUT() {
        return org.omg.SendingContext.RunTimeOperations.class;
    }

}
