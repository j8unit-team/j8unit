package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class DomHandlerClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.DomHandlerClassTests<javax.xml.bind.annotation.DomHandler> {

    @Override
    public Class<javax.xml.bind.annotation.DomHandler> createNewSUT() {
        return javax.xml.bind.annotation.DomHandler.class;
    }

}
