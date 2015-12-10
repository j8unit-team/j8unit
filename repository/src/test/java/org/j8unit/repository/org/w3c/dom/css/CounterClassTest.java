package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CounterClassTest
implements org.j8unit.repository.org.w3c.dom.css.CounterClassTests<org.w3c.dom.css.Counter> {

    @Override
    public Class<org.w3c.dom.css.Counter> createNewSUT() {
        return org.w3c.dom.css.Counter.class;
    }

}
