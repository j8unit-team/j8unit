package org.j8unit.maven.plugin.api;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import org.apache.maven.plugin.Mojo;

/**
 * Simple implementation of the {@link DiagnosticListener} interface with {@linkplain #report(Diagnostic) sending}
 * received {@linkplain Diagnostic diagnostics} into a {@link Mojo} {@linkplain Mojo#getLog() logger}.
 *
 * @param <S>
 *            the type of source objects used by diagnostics received by this listener
 */
public class MojoDiagnosticListener<S>
implements DiagnosticListener<S> {

    private final Mojo mojo;

    public MojoDiagnosticListener(final Mojo mojo) {
        this.mojo = mojo;
    }

    /**
     * Sends the received {@code diagnostic} into the {@link #mojo}'s {@linkplain Mojo#getLog() logger} using an
     * appropriate logging level.
     */
    @Override
    public void report(final Diagnostic<? extends S> diagnostic) {
        switch (diagnostic.getKind()) {
            case NOTE:
                this.mojo.getLog().info(diagnostic.toString());
                break;
            case ERROR:
                this.mojo.getLog().error(diagnostic.toString());
                break;
            default:
                this.mojo.getLog().warn(diagnostic.toString());
                break;
        }
    }

}
