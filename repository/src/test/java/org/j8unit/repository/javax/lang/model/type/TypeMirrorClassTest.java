package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeMirrorClassTest
implements org.j8unit.repository.javax.lang.model.type.TypeMirrorClassTests<javax.lang.model.type.TypeMirror> {

    @Override
    public Class<javax.lang.model.type.TypeMirror> createNewSUT() {
        return javax.lang.model.type.TypeMirror.class;
    }

}
