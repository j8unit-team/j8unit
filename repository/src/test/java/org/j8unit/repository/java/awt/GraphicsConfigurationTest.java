package org.j8unit.repository.java.awt;

import java.awt.GraphicsConfiguration;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GraphicsConfigurationTest
implements org.j8unit.repository.java.awt.GraphicsConfigurationTests<GraphicsConfiguration> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GraphicsConfiguration]

    @Override
    public GraphicsConfiguration createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.GraphicsConfiguration], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.GraphicsConfiguration]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.GraphicsConfiguration]

}
