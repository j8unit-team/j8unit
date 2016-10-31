package org.j8unit.repository.java.lang.instrument;

import java.lang.instrument.ClassDefinition;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassDefinitionClassTest
implements org.j8unit.repository.java.lang.instrument.ClassDefinitionClassTests<ClassDefinition> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.instrument.ClassDefinition]

    @Override
    public Class<ClassDefinition> createNewSUT() {
        return ClassDefinition.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.instrument.ClassDefinition#ClassDefinition(Class, byte[]) public
     * java.lang.instrument.ClassDefinition(java.lang.Class<?>,byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ClassDefinition_Class_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ClassDefinition sut = null; // = new ClassDefinition(Class, byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.instrument.ClassDefinition]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.instrument.ClassDefinition]

}
