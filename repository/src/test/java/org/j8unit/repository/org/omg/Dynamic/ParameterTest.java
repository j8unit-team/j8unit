package org.j8unit.repository.org.omg.Dynamic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterTest
implements org.j8unit.repository.org.omg.Dynamic.ParameterTests<org.omg.Dynamic.Parameter> {

    @Override
    public org.omg.Dynamic.Parameter createNewSUT() {
        return new org.omg.Dynamic.Parameter();
    }

}
