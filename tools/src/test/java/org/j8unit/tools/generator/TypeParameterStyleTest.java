package org.j8unit.tools.generator;

import static org.j8unit.tools.generator.TypeArgumentness.isRawGeneric;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TypeParameterStyleTest {

    @Test
    public void test_isRawGeneric() {
        assertTrue(isRawGeneric(java.beans.beancontext.BeanContext.class));
        assertTrue(isRawGeneric(java.beans.beancontext.BeanContextServices.class));
        assertTrue(isRawGeneric(java.beans.beancontext.BeanContextSupport.class));
        assertTrue(isRawGeneric(java.beans.beancontext.BeanContextServicesSupport.class));
        assertTrue(isRawGeneric(javax.swing.plaf.basic.BasicComboBoxRenderer.class));
        assertTrue(isRawGeneric(javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource.class));
        assertTrue(isRawGeneric(javax.xml.stream.XMLEventReader.class));
        assertTrue(isRawGeneric(javax.xml.stream.util.EventReaderDelegate.class));
    }

}
