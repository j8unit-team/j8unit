package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NestingKindClassTest
implements org.j8unit.repository.javax.lang.model.element.NestingKindClassTests<javax.lang.model.element.NestingKind> {

    @Override
    public Class<javax.lang.model.element.NestingKind> createNewSUT() {
        return javax.lang.model.element.NestingKind.class;
    }

}
