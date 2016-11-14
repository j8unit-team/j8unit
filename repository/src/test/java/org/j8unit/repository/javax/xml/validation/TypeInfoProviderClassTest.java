package org.j8unit.repository.javax.xml.validation;

import javax.xml.validation.TypeInfoProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TypeInfoProvider} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.validation.TypeInfoProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class TypeInfoProviderClassTest
implements TypeInfoProviderClassTests<TypeInfoProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.validation.TypeInfoProvider]

    @Override
    public Class<TypeInfoProvider> createNewSUT() {
        return TypeInfoProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.validation.TypeInfoProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.validation.TypeInfoProvider]

}
