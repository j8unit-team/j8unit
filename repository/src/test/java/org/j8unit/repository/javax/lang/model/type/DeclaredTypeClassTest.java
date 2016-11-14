package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.DeclaredType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DeclaredType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.DeclaredTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class DeclaredTypeClassTest
implements DeclaredTypeClassTests<DeclaredType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.DeclaredType]

    @Override
    public Class<DeclaredType> createNewSUT() {
        return DeclaredType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.DeclaredType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.DeclaredType]

}
