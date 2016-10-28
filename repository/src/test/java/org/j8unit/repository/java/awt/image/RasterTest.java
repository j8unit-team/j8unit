package org.j8unit.repository.java.awt.image;

import java.awt.image.Raster;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RasterTest
implements org.j8unit.repository.java.awt.image.RasterTests<Raster> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.Raster]

    @Override
    public Raster createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.Raster], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.Raster]

}
