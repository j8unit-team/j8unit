package org.j8unit.repository.java.awt.image;

import java.awt.image.SampleModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SampleModelTest
implements org.j8unit.repository.java.awt.image.SampleModelTests<SampleModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.SampleModel]

    @Override
    public SampleModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.SampleModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.SampleModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.SampleModel]

}
