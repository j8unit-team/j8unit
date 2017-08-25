package org.j8unit.maven.plugin.genesis;

import static java.lang.String.format;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.Files.readAllBytes;
import static org.j8unit.generator.util.Resources.resolveResource;
import static org.j8unit.maven.plugin.genesis.GenesisRenderStyles.J8UNIT_TEMPLATE_NAME;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.nio.file.Path;
import org.junit.Test;

public class TestSourcesRendererTest {

    @Test
    public void checkTemplateIsShippedWithMavenPlugin()
    throws Exception {
        final Path templatePath = resolveResource(this, J8UNIT_TEMPLATE_NAME);
        assertNotNull(templatePath);
    }

    @Test
    public void checkTemplateFormat()
    throws Exception {
        final Path templatePath = resolveResource(this, J8UNIT_TEMPLATE_NAME);
        final String templateContent = new String(readAllBytes(templatePath), UTF_8);
        final String namespace = "org.foobar.xyz";
        final String classesUnderTest = "org.foobar.xyz.Foo.class, org.foobar.xyz.Bar.class, org.foobar.xyz.Foobar.class";
        final String targetSource = format(templateContent, namespace, classesUnderTest);
        assertTrue(targetSource.contains(namespace));
        assertTrue(targetSource.contains(classesUnderTest));
    }

}
