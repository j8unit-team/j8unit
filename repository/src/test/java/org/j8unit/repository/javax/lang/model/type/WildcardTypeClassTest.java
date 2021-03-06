package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.WildcardType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WildcardType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.WildcardTypeClassTests}).
 */
@RunWith(J8Unit4.class)
public class WildcardTypeClassTest
implements WildcardTypeClassTests<WildcardType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.WildcardType]

    @Override
    public Class<WildcardType> createNewSUT() {
        return WildcardType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.WildcardType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.WildcardType]

}
