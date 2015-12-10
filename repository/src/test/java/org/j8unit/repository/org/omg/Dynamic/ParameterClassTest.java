package org.j8unit.repository.org.omg.Dynamic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterClassTest
implements org.j8unit.repository.org.omg.Dynamic.ParameterClassTests<org.omg.Dynamic.Parameter> {

    @Override
    public Class<org.omg.Dynamic.Parameter> createNewSUT() {
        return org.omg.Dynamic.Parameter.class;
    }

}
