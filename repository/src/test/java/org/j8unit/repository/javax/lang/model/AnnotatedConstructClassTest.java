package org.j8unit.repository.javax.lang.model;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotatedConstructClassTest
implements org.j8unit.repository.javax.lang.model.AnnotatedConstructClassTests<javax.lang.model.AnnotatedConstruct> {

    @Override
    public Class<javax.lang.model.AnnotatedConstruct> createNewSUT() {
        return javax.lang.model.AnnotatedConstruct.class;
    }

}
