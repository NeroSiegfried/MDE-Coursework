/*
 * generated by Xtext 2.38.0
 */
package uk.ac.kcl.inf.nerosiegfried.chessdsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uk.ac.kcl.inf.nerosiegfried.chessdsl.ui.internal.ChessdslActivator;

public class ChessDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ChessdslActivator.getInstance().getInjector("uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL");
	}

}
