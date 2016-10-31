package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.Parameterizable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterizableClassTest
implements org.j8unit.repository.javax.lang.model.element.ParameterizableClassTests<Parameterizable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.Parameterizable]

    @Override
    public Class<Parameterizable> createNewSUT() {
        return Parameterizable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.Parameterizable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.Parameterizable]

}
