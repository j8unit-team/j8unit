package org.j8unit.repository.javax.management;

import javax.management.ValueExp;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValueExp} (by simply reusing the J8Unit
 * test interface {@link ValueExpClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValueExpClassTest
implements ValueExpClassTests<ValueExp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.ValueExp]

    @Override
    public Class<ValueExp> createNewSUT() {
        return ValueExp.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.ValueExp]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.ValueExp]

}
