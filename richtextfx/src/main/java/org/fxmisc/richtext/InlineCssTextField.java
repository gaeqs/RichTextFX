package org.fxmisc.richtext;

import javafx.beans.NamedArg;
import org.fxmisc.richtext.model.SimpleEditableStyledDocument;

import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;

/**
 * A TextField that uses inline CSS, i.e. <code>setStyle(String)</code>, to define the styles of text segments.
 * <p>Use CSS Style Class ".styled-text-field" for styling the control.
 * @author Jurgen
 */
public class InlineCssTextField extends StyledTextField<String,String>
{
    public InlineCssTextField() {
        super( "", TextFlow::setStyle, "", TextExt::setStyle, new SimpleEditableStyledDocument<>("", "") );
    }

    public InlineCssTextField(GenericStyledAreaBehaviorParameters behaviorParameters) {
        super( "", TextFlow::setStyle, "", TextExt::setStyle,
                new SimpleEditableStyledDocument<>("", ""), behaviorParameters);
    }

    public InlineCssTextField( String text ) {
        this(); replaceText( text );
        getUndoManager().forgetHistory();
        getUndoManager().mark();
    }

    public InlineCssTextField( String text, GenericStyledAreaBehaviorParameters behaviorParameters ) {
        this(behaviorParameters);
        replaceText( text );
        getUndoManager().forgetHistory();
        getUndoManager().mark();
    }

    @Override
    protected void changeAlignment( TextAlignment txtAlign ) {
        setParagraphStyle( 0, "-fx-text-alignment: "+ txtAlign );
    }
}
