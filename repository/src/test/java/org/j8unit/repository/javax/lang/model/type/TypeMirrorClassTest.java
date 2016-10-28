package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.TypeMirror;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeMirrorClassTest
implements org.j8unit.repository.javax.lang.model.type.TypeMirrorClassTests<TypeMirror> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.TypeMirror]

    @Override
    public Class<TypeMirror> createNewSUT() {
        return TypeMirror.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.TypeMirror]

}
