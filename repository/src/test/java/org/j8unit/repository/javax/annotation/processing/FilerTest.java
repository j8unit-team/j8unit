package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Filer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilerTest
implements org.j8unit.repository.javax.annotation.processing.FilerTests<Filer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.Filer]

    @Override
    public Filer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.processing.Filer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.Filer]

}
