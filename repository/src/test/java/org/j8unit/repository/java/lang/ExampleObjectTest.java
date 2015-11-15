package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExampleObjectTest
implements ObjectTests<Object> {

    @Override
    public Object createNewSUT() {
        return new Object();
    }

}
