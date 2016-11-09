package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.Counter;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Counter} (by simply reusing the J8Unit
 * test interface {@link CounterClassTests}).
 */

@RunWith(J8Unit4.class)
public class CounterClassTest
implements CounterClassTests<Counter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.Counter]

    @Override
    public Class<Counter> createNewSUT() {
        return Counter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.Counter]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.Counter]

}
