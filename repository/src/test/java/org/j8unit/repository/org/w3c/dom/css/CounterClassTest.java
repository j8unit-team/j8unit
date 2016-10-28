package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.Counter;

@RunWith(J8Unit4.class)
public class CounterClassTest
implements org.j8unit.repository.org.w3c.dom.css.CounterClassTests<Counter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.Counter]

    @Override
    public Class<Counter> createNewSUT() {
        return Counter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.Counter]

}
