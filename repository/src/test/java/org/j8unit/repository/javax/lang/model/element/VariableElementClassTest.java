package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VariableElementClassTest
implements org.j8unit.repository.javax.lang.model.element.VariableElementClassTests<javax.lang.model.element.VariableElement> {

    @Override
    public Class<javax.lang.model.element.VariableElement> createNewSUT() {
        return javax.lang.model.element.VariableElement.class;
    }

}
