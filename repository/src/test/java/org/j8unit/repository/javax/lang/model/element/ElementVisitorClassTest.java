package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ElementVisitorClassTest
implements org.j8unit.repository.javax.lang.model.element.ElementVisitorClassTests<javax.lang.model.element.ElementVisitor> {

    @Override
    public Class<javax.lang.model.element.ElementVisitor> createNewSUT() {
        return javax.lang.model.element.ElementVisitor.class;
    }

}
