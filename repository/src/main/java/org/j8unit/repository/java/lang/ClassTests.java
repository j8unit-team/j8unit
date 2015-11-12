package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import javax.lang.model.SourceVersion;
import org.junit.Test;

public interface ClassTests<T>
extends ObjectTests<Class<T>> {

    @Test
    public default void checkValidJavaIdentifier() {
        final Class<T> sut = this.createNewSUT();
        assert sut != null;
        assumeFalse("Skip test case because non-primitive assumption failed.", sut.isPrimitive());
        assumeFalse("Skip test case because non-array assumption failed.", sut.isArray());
        final String name = sut.getName();
        assertNotNull(name);
        assertTrue(SourceVersion.isIdentifier(name));
    }

}
