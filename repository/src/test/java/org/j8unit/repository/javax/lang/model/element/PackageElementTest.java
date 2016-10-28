package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.PackageElement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PackageElementTest
implements org.j8unit.repository.javax.lang.model.element.PackageElementTests<PackageElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.PackageElement]

    @Override
    public PackageElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.element.PackageElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.PackageElement]

}
