package org.j8unit.repository.javax.imageio;

import javax.imageio.ImageTypeSpecifier;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageTypeSpecifierTest
implements org.j8unit.repository.javax.imageio.ImageTypeSpecifierTests<ImageTypeSpecifier> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.ImageTypeSpecifier]

    @Override
    public ImageTypeSpecifier createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.ImageTypeSpecifier], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.ImageTypeSpecifier]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.ImageTypeSpecifier]

}
