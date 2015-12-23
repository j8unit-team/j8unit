package org.j8unit.repository.javax.management;

import org.j8unit.repository.JavaBug;
import org.j8unit.runners.J8Unit4;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeValueExpTest
implements org.j8unit.repository.javax.management.AttributeValueExpTests<javax.management.AttributeValueExp> {

    @Override
    public javax.management.AttributeValueExp createNewSUT() {
        return new javax.management.AttributeValueExp();
    }

    /**
     * {@code new AttributeValueExp().toString()} returns {@code null} illegally.
     *
     * {@code new AttributeValueExp(null).toString()} returns {@code null} illegally.
     */
    @Override
    @Test
    @Category(JavaBug.class)
    public void toStringMustReturnNotNull() {
        org.j8unit.repository.javax.management.AttributeValueExpTests.super.toStringMustReturnNotNull();
    }

}
