package org.j8unit.generator.api.render;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.lang.Character.UnicodeBlock;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import org.j8unit.generator.api.ImportMemory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@SuppressWarnings("rawtypes")
public class CheckTest {

    private FancyOriginRenderer fr;

    @Before
    public void init() {
        this.fr = new FancyOriginRenderer() {

            private ImportMemory memory = new ImportMemory();

            @Override
            public void resetImportMemory() {
                this.memory = new ImportMemory();
            }

            @Override
            public ImportMemory getImportMemory() {
                return this.memory;
            }
        };
    }

    @Test
    public void testName()
    throws Exception {
        final Class<UseParametersRunnerFactory> c = UseParametersRunnerFactory.class;
        final String simpleName = c.getSimpleName();
        assertEquals("UseParametersRunnerFactory", simpleName);

        final String cName = this.fr.originCanonicalNameOf(c);
        assertEquals("UseParametersRunnerFactory", cName);
        final String bName = this.fr.originBasicNameOf(c);
        assertEquals("Parameterized.UseParametersRunnerFactory", bName);
        final String sName = this.fr.originSimpleNameOf(c);
        assertEquals("UseParametersRunnerFactory", sName);
    }

    @Test
    public void testName2()
    throws Exception {
        final Constructor<ArrayList> constructor = ArrayList.class.getConstructor(Collection.class);
        assertEquals("java.util.ArrayList", constructor.getName());
        final String javadocName = this.fr.javadocNameOf(constructor);
        assertEquals("java.util.ArrayList#ArrayList(java.util.Collection)", javadocName);
        assertEquals("", this.fr.renderImport("java.lang"));
    }

    @Test
    public void envelopedClassTest()
    throws Exception {
        final Class<UnicodeBlock> cu = Character.UnicodeBlock.class;
        final ImportMemory memory = new ImportMemory();
        assertTrue(memory.add(cu));
        assertEquals(format("import java.lang.Character.UnicodeBlock;%n"), memory.render("java.util"));
        assertEquals(format("import java.lang.Character.UnicodeBlock;%n"), memory.render("java.lang"));
    }

}
