package org.j8unit.maven.plugin;

import static java.nio.file.Files.createDirectories;
import static java.util.ResourceBundle.getBundle;
import static org.apache.maven.plugins.annotations.LifecyclePhase.GENERATE_TEST_SOURCES;
import static org.j8unit.maven.plugin.Messages.Keys.ADD_SOURCE_ROOT;
import static org.j8unit.maven.plugin.Messages.Keys.GENERATE_SOURCE_CODE;
import static org.j8unit.maven.plugin.Messages.Keys.OMIT_SOURCE_ROOT;
import static org.j8unit.maven.plugin.Messages.Keys.SOURCE_ROOT;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecution;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.j8unit.maven.plugin.api.ComfortMojo;
import org.j8unit.maven.plugin.api.CompileClasspathMojo;
import org.j8unit.maven.plugin.api.LoggingMojo;
import org.j8unit.maven.plugin.genesis.GenesisRenderStyles;

@Mojo(name = "genesis", defaultPhase = GENERATE_TEST_SOURCES) // , requiresDependencyResolution =
                                                              // ResolutionScope.COMPILE_PLUS_RUNTIME)
public class GenesisMojo
extends AbstractMojo
implements ComfortMojo, CompileClasspathMojo, LoggingMojo {

    private static final ResourceBundle MESSAGES = getBundle(Messages.class.getCanonicalName());

    @Override
    public String message(final CharSequence key) {
        return MESSAGES.getString(key.toString());
    }

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    private MavenProject project;

    @Parameter(defaultValue = "${mojo}", required = true, readonly = true)
    private MojoExecution mojo;

    @Override
    public MojoExecution getMojoExecution() {
        return this.mojo;
    }

    @Parameter(property = "j8unit.genesis.skip", defaultValue = "false", required = true)
    private boolean skip;

    @Override
    public boolean skip() {
        return this.skip;
    }

    @Parameter(defaultValue = "${project.compileClasspathElements}", required = true, readonly = true)
    private List<String> compileClasspathElements;

    @Override
    public List<String> getCompileClasspathElements() {
        return this.compileClasspathElements;
    }

    @Parameter(defaultValue = "${project.build.directory}/generated-test-sources/j8unit", required = true)
    private File sourceDirectory;

    @Parameter(defaultValue = "true", required = true)
    private boolean addSourceDirectory;

    @Parameter(defaultValue = "PACKAGE", required = true)
    private GenesisRenderStyles style;

    @Component
    private PluginDescriptor pluginDescriptor;

    @Override
    public void executeMojo()
    throws MojoFailureException, IOException {
        this.info(this.message(SOURCE_ROOT), this.sourceDirectory);
        createDirectories(this.sourceDirectory.toPath());
        if (this.addSourceDirectory) {
            this.info(this.message(ADD_SOURCE_ROOT), this.sourceDirectory);
            this.project.addTestCompileSourceRoot(this.sourceDirectory.getAbsolutePath());
        } else {
            this.info(this.message(OMIT_SOURCE_ROOT), this.sourceDirectory);
        }
        for (final Entry<Package, List<Class<?>>> entry : this.getCompileClasspathClasses().entrySet()) {
            final Package pakkage = entry.getKey();
            final List<Class<?>> classes = entry.getValue();
            this.info(this.message(GENERATE_SOURCE_CODE), pakkage, classes);
            this.style.render(this.sourceDirectory, pakkage, classes);
        }
        // try {
        // final ClassRealm realm = this.pluginDescriptor.getClassRealm();
        // final Set<Artifact> artifacts = this.project.getArtifacts();
        // System.out.println("UUU#1: " + artifacts);
        // for (final Artifact artifact : artifacts) {
        // System.out.println("UUU#1: " + artifact);
        // final URL u = artifact.getFile().toURI().toURL();
        // realm.addURL(u);
        // }
        // // final List<Dependency> dependencies = this.project.getCompileDependencies();
        // // System.out.println("UUU#2: " + dependencies);
        // // for (final Dependency dependency : dependencies) {
        // // System.out.println("UUU#2: " + dependency);
        // // final URL url = new File(dependency.getSystemPath()).toURI().toURL();
        // // realm.addURL(url);
        // // }
        // map(this.project.getRuntimeClasspathElements(), File::new).stream().peek(url -> System.out.format("XXX:
        // %s%n", url)).map(File::toURI)
        // .map(doIt(URI::toURL)).peek(url -> System.out.format("YYY: %s%n", url))
        // .forEach(realm::addURL);
        // // realm.addURL(new File(this.project.getCompileClasspathElements()).toURI().toURL());
        // final Class<?> clazz = Class.forName("org.apache.commons.codec.digest.HmacUtils");
        // this.info("Class: " + clazz.getName());
        // } catch (final ClassNotFoundException | DependencyResolutionRequiredException e) {
        // throw new RuntimeException(e);
        // }
    }

}
