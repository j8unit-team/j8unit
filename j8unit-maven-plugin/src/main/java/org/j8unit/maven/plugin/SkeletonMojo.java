package org.j8unit.maven.plugin;

import static java.nio.file.Files.createDirectories;
import static java.util.ResourceBundle.getBundle;
import static org.apache.maven.plugins.annotations.LifecyclePhase.GENERATE_TEST_SOURCES;
import static org.j8unit.generator.J8UnitRepositoryGenerators.INSTANCE_TESTS;
import static org.j8unit.generator.api.RepositoryPackageInfo.J8UNIT_REPOSITORY_PACKAGE_INFO;
import static org.j8unit.maven.plugin.Messages.Keys.ADD_SOURCE_ROOT;
import static org.j8unit.maven.plugin.Messages.Keys.OMIT_SOURCE_ROOT;
import static org.j8unit.maven.plugin.Messages.Keys.SOURCE_ROOT;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileManager.Location;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecution;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.j8unit.generator.api.GeneratorSetup;
import org.j8unit.maven.plugin.api.ComfortMojo;
import org.j8unit.maven.plugin.api.CompileClasspathMojo;
import org.j8unit.maven.plugin.api.LoggingMojo;

@Mojo(name = "skeleton", defaultPhase = GENERATE_TEST_SOURCES)
public class SkeletonMojo
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

    @Parameter(property = "j8unit.skeleton.skip", defaultValue = "true", required = true)
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

    @Parameter(defaultValue = "${project.build.testSourceDirectory}", required = true)
    private File sourceDirectory;

    @Parameter(defaultValue = "true", required = true)
    private boolean addSourceDirectory;

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
        final Entry<Location, JavaFileManager> where = this.getCompileClasspathJavaFileManager();
        final GeneratorSetup setup = GeneratorSetup.forLocation(where.getKey(), where.getValue()) //
                                                   .asSubPackageOf("") //
                                                   .intoTargetFolder(this.sourceDirectory.getPath()) //
                                                   .doTestClassNamingWith("", false, "Tests") //
                                                   .doTestConstructorNamingWith("create_", false, "") //
                                                   .doTestMethodNamingWith("test_", false, "") //
                                                   .overwriteExistingFiles() //
                                                   .build();
        final GeneratorSetup complementarySetup = GeneratorSetup.similarTo(setup) //
                                                                .doTestClassNamingWith("", false, "ClassTests") //
                                                                .build();
        setup.exploreOriginPackages().forEach(p -> J8UNIT_REPOSITORY_PACKAGE_INFO.generatePackageInfoFile(p, setup, setup));
        setup.exploreOriginTypes().forEach(t -> INSTANCE_TESTS.generateSourceFile(t, setup, setup, complementarySetup));
    }

}
