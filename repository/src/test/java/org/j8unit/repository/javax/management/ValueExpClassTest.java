package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueExpClassTest
implements org.j8unit.repository.javax.management.ValueExpClassTests<javax.management.ValueExp> {

    @Override
    public Class<javax.management.ValueExp> createNewSUT() {
        return javax.management.ValueExp.class;
    }

}
