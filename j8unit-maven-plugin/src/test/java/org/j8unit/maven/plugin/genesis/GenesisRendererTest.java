package org.j8unit.maven.plugin.genesis;

import static java.lang.String.format;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.Files.readAllBytes;
import static java.util.ResourceBundle.getBundle;
import static org.j8unit.generator.util.Resources.resolveResource;
import static org.j8unit.maven.plugin.genesis.GenesisRenderStyles.J8UNIT_TEMPLATE_NAME;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.nio.file.Path;
import java.util.ResourceBundle;
import org.apache.maven.plugin.MojoExecution;
import org.apache.maven.plugin.MojoExecution.Source;
import org.j8unit.generator.util.Resources;
import org.j8unit.maven.plugin.Messages;
import org.j8unit.maven.plugin.Messages.Keys;
import org.junit.Test;

public class GenesisRendererTest {

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

    @Test
    public void testName()
    throws Exception {
        final Object[][] pairs = Resources.asResourcePairs(Messages.Keys.class);
        assertEquals(Keys.values().length, pairs.length);
    }

    public static final ResourceBundle MESSAGES = getBundle(Messages.class.getCanonicalName());

    @Test
    public void checkAllMojoExecutionSourceSkipMessages()
    throws Exception {
        for (final Source source : MojoExecution.Source.values()) {
            assertEquals("#toString() does not return the plain name anymore!", source.name(), source.toString());
            final String msg = MESSAGES.getString("SKIP_MOJO_" + source);
            assertNotNull("Missing the skip message for " + source, msg);
        }

    }

}
