package de.informaticum.shapes;

import de.informaticum.j8junit.repository.java.lang.ObjectTests;

public abstract interface AbstractShapeTest<AS extends AbstractShape>
extends ObjectTests<AS>, ShapeTest<AS> {

}
