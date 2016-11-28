package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.NullType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NullType} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.lang.model.type.NullTypeClassTests}).
 */
@RunWith(J8Unit4.class)
public class NullTypeClassTest
implements NullTypeClassTests<NullType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.NullType]

    @Override
    public Class<NullType> createNewSUT() {
        return NullType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.NullType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.NullType]

}
