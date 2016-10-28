package org.j8unit.repository.java.awt;

import java.awt.Image;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageTest
implements org.j8unit.repository.java.awt.ImageTests<Image> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Image]

    @Override
    public Image createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Image], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Image]

}
