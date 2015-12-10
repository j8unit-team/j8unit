package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectInstanceClassTest
implements org.j8unit.repository.javax.management.ObjectInstanceClassTests<javax.management.ObjectInstance> {

    @Override
    public Class<javax.management.ObjectInstance> createNewSUT() {
        return javax.management.ObjectInstance.class;
    }

}
