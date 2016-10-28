package org.j8unit.repository.javax.xml.validation;

import javax.xml.validation.TypeInfoProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeInfoProviderTest
implements org.j8unit.repository.javax.xml.validation.TypeInfoProviderTests<TypeInfoProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.validation.TypeInfoProvider]

    @Override
    public TypeInfoProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.validation.TypeInfoProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.validation.TypeInfoProvider]

}
