package org.j8unit.shapes;

import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.shapes.AbstractShape;

public abstract interface AbstractShapeTest<AS extends AbstractShape>
extends ObjectTests<AS>, ShapeTest<AS> {

}
