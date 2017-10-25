package org.j8unit.maven.plugin;

import static java.lang.String.format;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.Files.walk;
import static java.time.Instant.ofEpochMilli;
import static java.time.ZoneId.systemDefault;
import static java.time.ZonedDateTime.ofInstant;
import static java.util.Collections.singleton;
import static java.util.Locale.GERMANY;
import static java.util.ResourceBundle.getBundle;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.StreamSupport.stream;
import static javax.tools.JavaFileObject.Kind.CLASS;
import static javax.tools.JavaFileObject.Kind.SOURCE;
import static javax.tools.StandardLocation.locationFor;
import static javax.tools.ToolProvider.getSystemJavaCompiler;
import static org.apache.maven.plugins.annotations.LifecyclePhase.VALIDATE;
import static org.apache.maven.plugins.annotations.ResolutionScope.COMPILE_PLUS_RUNTIME;
import static org.j8unit.maven.plugin.Messages.Keys.GENERATE_SOURCE_CODE;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.stream.Stream;
import javax.tools.DiagnosticListener;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager.Location;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.j8unit.maven.plugin.api.CompileClasspathMojo;
import org.j8unit.maven.plugin.api.LoggingMojo;
import org.sonatype.plexus.build.incremental.BuildContext;

/**
 * Executes some recognition of the current Maven project.
 */
// https://maven.apache.org/plugin-developers/index.html
// https://maven.apache.org/guides/plugin/guide-java-plugin-development.html
// https://maven.apache.org/developers/mojo-api-specification.html
// https://maven.apache.org/plugin-tools/maven-plugin-tools-annotations/index.html
@Mojo(name = "recognise", defaultPhase = VALIDATE, requiresDependencyResolution = COMPILE_PLUS_RUNTIME)
public class RecognitionMojo
extends AbstractMojo
implements CompileClasspathMojo, LoggingMojo {

    // https://wiki.eclipse.org/M2E_compatible_maven_plugins#BuildContext_code_snippets
    @Component
    private BuildContext buildContext;

    // https://maven.apache.org/plugin-tools/maven-plugin-annotations/apidocs/org/apache/maven/plugins/annotations/Parameter.html
    // https://maven.apache.org/ref/3.5.0/maven-core/apidocs/org/apache/maven/plugin/PluginParameterExpressionEvaluator.html
    @Parameter(property = "session", required = true, readonly = true)
    private MavenSession session;

    @Parameter(property = "project", required = true, readonly = true)
    private MavenProject project;

    @Parameter(defaultValue = "${project.build.testSourceDirectory}", required = true, readonly = true)
    private String data;

    @Parameter(property = "j8unit.recognise.skip", defaultValue = "false")
    private boolean skip;

    @Parameter(name = "message", property = "j8unit.recognise.message", defaultValue = "This is an example system-out (default) message, made by j8unit:recognise.")
    private String display;

    public String getMessage() {
        return this.display;
    }

    public void setMessage(final String display) {
        this.display = display;
    }

    private static final ResourceBundle MESSAGES = getBundle(Messages.class.getCanonicalName());

    @Override
    public String message(final CharSequence key) {
        return MESSAGES.getString(key.toString());
    }

    @Parameter(property = "project.compileSourceRoots", required = true, readonly = true)
    private List<String> compileSourceRoots;

    private static final Location CURRENT_PROJECT_SOURCES = locationFor("CURRENT_PROJECT_SOURCES");

    @Parameter(property = "project.testCompileSourceRoots", required = true, readonly = true)
    private List<String> testCompileSourceRoots;

    private static final Location CURRENT_PROJECT_TEST_SOURCES = locationFor("CURRENT_PROJECT_TEST_SOURCES");

    @Parameter(property = "project.compileClasspathElements", required = true, readonly = true)
    private List<String> compileClasspathElements;

    @Override
    public List<String> getCompileClasspathElements() {
        return this.compileClasspathElements;
    }

    private static final Location CURRENT_PROJECT_CLASSES = locationFor("CURRENT_PROJECT_CLASSES");

    @Parameter(property = "project.testClasspathElements", required = true, readonly = true)
    private List<String> testClasspathElements;

    private static final Location CURRENT_PROJECT_TEST_CLASSES = locationFor("CURRENT_PROJECT_TEST_CLASSES");

    @Override
    public void execute()
    throws MojoExecutionException, MojoFailureException {
        if (this.skip) {
            this.getLog().info("Recognition is skipped.");
        } else {
            this.getLog().info(format("Hi, I'd like to say \"%s\"", this.display));
            this.getLog().info(format("Data is \"%s\"", this.data.getClass()));
            this.getLog().info(format("Data is \"%s\"", this.data));
            this.getLog().info(format("The current Maven session is: %s", this.session));
            this.getLog().info(format("The current Maven project is: %s", this.project));
            try {
                final JavaCompiler compiler = this.getJavaCompiler();
                final StandardJavaFileManager manager = this.getJavaFileManager(compiler);
            } catch (final IOException any) {
                throw new MojoExecutionException(any.toString(), any);
            }
        }

        try {
            for (final Entry<Package, List<Class<?>>> entry : this.getCompileClasspathClasses().entrySet()) {
                final Package pakkage = entry.getKey();
                final List<Class<?>> classes = entry.getValue();
                this.info(this.message(GENERATE_SOURCE_CODE), pakkage, classes);
            }
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private final JavaCompiler getJavaCompiler()
    throws MojoExecutionException {
        final JavaCompiler compiler = getSystemJavaCompiler();
        if (compiler == null) {
            throw new MojoExecutionException("You need to run build with JDK or have tools.jar on the classpath. If this occures during Eclipse build, make sure you run Eclipse under JDK as well.");
        }
        return compiler;
    }

    private final StandardJavaFileManager getJavaFileManager(final JavaCompiler compiler)
    throws IOException {
        final DiagnosticListener<JavaFileObject> dl = diagnostic -> this.getLog().warn(format("An error occured: %s!", diagnostic));
        final StandardJavaFileManager manager = compiler.getStandardFileManager(dl, GERMANY, UTF_8);
        // Source files
        final Set<File> sourceFolders = this.compileSourceRoots.stream().map(File::new).collect(toSet());
        this.getLog().info(format("Source folders are: %s", sourceFolders));
        for (final File folder : sourceFolders) {
            if (folder.exists()) {
                final long number = walk(folder.toPath()).filter(Files::isRegularFile).count();
                this.getLog().info(format("Source folder %s contains %d files.", folder, number));
            } else {
                this.getLog().info(format("Source folder %s does not (yet) exist.", folder));
            }
        }
        manager.setLocation(CURRENT_PROJECT_SOURCES, sourceFolders);
        final Iterable<JavaFileObject> customSources = manager.list(CURRENT_PROJECT_SOURCES, "", singleton(SOURCE), true);
        customSources.forEach(this::infoSourceFile);
        final Stream<String> sourcesNames = stream(customSources.spliterator(), false).map(file -> manager.inferBinaryName(CURRENT_PROJECT_SOURCES, file));
        sourcesNames.forEach(this::infoSourceFile);
        // Test source files
        final Set<File> testSourceFolders = this.testCompileSourceRoots.stream().map(File::new).collect(toSet());
        this.getLog().info(format("Test source folders are: %s", testSourceFolders));
        for (final File folder : testSourceFolders) {
            if (folder.exists()) {
                final long number = walk(folder.toPath()).filter(Files::isRegularFile).count();
                this.getLog().info(format("Test source folder %s contains %d files.", folder, number));
            } else {
                this.getLog().info(format("Test source folder %s does not (yet) exist.", folder));
            }
        }
        manager.setLocation(CURRENT_PROJECT_TEST_SOURCES, testSourceFolders);
        final Iterable<JavaFileObject> customTestSources = manager.list(CURRENT_PROJECT_TEST_SOURCES, "", singleton(SOURCE), true);
        customTestSources.forEach(this::infoSourceFile);
        final Stream<String> testSourcesNames = stream(customTestSources.spliterator(),
                                                       false).map(file -> manager.inferBinaryName(CURRENT_PROJECT_SOURCES, file));
        testSourcesNames.forEach(this::infoSourceFile);
        // Target files
        final Set<File> classFolders = this.compileClasspathElements.stream().map(File::new).collect(toSet());
        this.getLog().info(format("Class folders are: %s", classFolders));
        for (final File folder : classFolders) {
            if (folder.exists()) {
                final long number = walk(folder.toPath()).filter(Files::isRegularFile).count();
                this.getLog().info(format("Class folder %s contains %d files.", folder, number));
            } else {
                this.getLog().info(format("Class folder %s does not (yet) exist.", folder));
            }
        }
        manager.setLocation(CURRENT_PROJECT_CLASSES, classFolders);
        final Iterable<JavaFileObject> customClasses = manager.list(CURRENT_PROJECT_CLASSES, "", singleton(CLASS), true);
        customClasses.forEach(this::infoClassFile);
        final Stream<String> classesNames = stream(customClasses.spliterator(), false).map(file -> manager.inferBinaryName(CURRENT_PROJECT_CLASSES, file));
        classesNames.forEach(this::infoClassFile);
        // Target test files
        final Set<File> testClassFolders = this.testClasspathElements.stream().map(File::new).collect(toSet());
        this.getLog().info(format("Test class folders are: %s", testClassFolders));
        for (final File folder : testClassFolders) {
            if (folder.exists()) {
                final long number = walk(folder.toPath()).filter(Files::isRegularFile).count();
                this.getLog().info(format("Test class folder %s contains %d files.", folder, number));
            } else {
                this.getLog().info(format("Test class folder %s does not (yet) exist.", folder));
            }
        }
        manager.setLocation(CURRENT_PROJECT_TEST_CLASSES, testClassFolders);
        final Iterable<JavaFileObject> customTestClasses = manager.list(CURRENT_PROJECT_CLASSES, "", singleton(CLASS), true);
        customTestClasses.forEach(this::infoClassFile);
        final Stream<String> testClassesNames = stream(customTestClasses.spliterator(),
                                                       false).map(file -> manager.inferBinaryName(CURRENT_PROJECT_CLASSES, file));
        testClassesNames.forEach(this::infoClassFile);
        // return
        return manager;
    }

    private void infoSourceFile(final JavaFileObject jfo) {
        this.getLog().info(format("Source file is: %s", jfo));
        // http://stackoverflow.com/questions/7487460/java-convert-long-to-date/20646345#20646345
        this.getLog().info(format("Source file's last modification was: %s", ofInstant(ofEpochMilli(jfo.getLastModified()), systemDefault())));
        // https://wiki.eclipse.org/M2E_compatible_maven_plugins#BuildContext_code_snippets
        final File file = new File(jfo.toUri());
        this.getLog().info(format("Source file was modified since previous build: %s", this.buildContext.hasDelta(file)));
    }

    private void infoSourceFile(final String name) {
        this.getLog().info(format("Source file's binary name is: %s", name));
    }

    private void infoClassFile(final JavaFileObject jfo) {
        this.getLog().info(format("Class file is: %s", jfo));
    }

    private void infoClassFile(final String name) {
        this.getLog().info(format("Class file's binary name is: %s", name));
    }

}
