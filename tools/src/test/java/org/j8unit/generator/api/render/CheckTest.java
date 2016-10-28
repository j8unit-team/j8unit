package org.j8unit.generator.api.render;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.lang.Character.UnicodeBlock;
import org.j8unit.generator.api.ImportMemory;
import org.junit.Test;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

public class CheckTest {

    @Test
    public void testName()
    throws Exception {
        final Class<UseParametersRunnerFactory> c = UseParametersRunnerFactory.class;
        final String simpleName = c.getSimpleName();
        assertEquals("UseParametersRunnerFactory", simpleName);

        final FancyOriginRenderer fr = new FancyOriginRenderer() {

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

        final String cName = fr.originCanonicalNameOf(c);
        assertEquals("UseParametersRunnerFactory", cName);
        final String bName = fr.originBasicNameOf(c);
        assertEquals("Parameterized.UseParametersRunnerFactory", bName);
        final String sName = fr.originSimpleNameOf(c);
        assertEquals("UseParametersRunnerFactory", sName);
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
