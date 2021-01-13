import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class ListenerBasico extends gPL2ParserBaseListener {

    private Stack<String> s = new Stack<String>();
    private String arbol = "";

    @Override 
    public void enterEveryRule(ParserRuleContext ctx) { 
        s.push(gPL2Parser.ruleNames[ctx.getRuleIndex()]);
        for (int i=0; i<s.size();i++)
        {
            this.arbol=arbol+"->"+s.get(i);
        }
        arbol=arbol+"\n";
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        s.push(gPL2Lexer.VOCABULARY.getSymbolicName(node.getSymbol().getType()) + ":" + node.getText());
    }

    public String getArbol() {
        return this.arbol;
    }
}
