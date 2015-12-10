package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QualifiedNameableClassTest
implements org.j8unit.repository.javax.lang.model.element.QualifiedNameableClassTests<javax.lang.model.element.QualifiedNameable> {

    @Override
    public Class<javax.lang.model.element.QualifiedNameable> createNewSUT() {
        return javax.lang.model.element.QualifiedNameable.class;
    }

}
