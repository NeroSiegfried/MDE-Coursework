package uk.ac.kcl.in.nerosiegfried.chessdsl.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.*;

public class ChessDSLScopeProvider extends AbstractDeclarativeScopeProvider {

    public IScope scope_MovePair_color1(MovePair context, org.eclipse.emf.ecore.EReference reference) {
        Game game = EcoreUtil2.getContainerOfType(context, Game.class);
        List<PlayerOrColor> candidates = new ArrayList<>();

        // Create an ephemeral candidate for "White"
        PlayerOrColor whiteEphemeral = ChessDSLFactory.eINSTANCE.createPlayerOrColor();
        whiteEphemeral.setColor(Color.WHITE);
        candidates.add(whiteEphemeral);

        // Add one candidate for each white player
        for (Player p : game.getPlayers()) {
            if (p.getColor() == Color.WHITE) {
                PlayerOrColor poc = ChessDSLFactory.eINSTANCE.createPlayerOrColor();
                poc.setPlayer(p);
                candidates.add(poc);
            }
        }
        return Scopes.scopeFor(candidates);
    }
}
