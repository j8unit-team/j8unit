package org.j8unit.repository.javax.management;

import javax.management.ValueExp;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueExpClassTest
implements org.j8unit.repository.javax.management.ValueExpClassTests<ValueExp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.ValueExp]

    @Override
    public Class<ValueExp> createNewSUT() {
        return ValueExp.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.ValueExp]

}
