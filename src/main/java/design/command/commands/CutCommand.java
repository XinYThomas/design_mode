package design.command.commands;

import design.command.editor.Editor;

public class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if(editor.textArea.getSelectedText().isEmpty()) return false;

        backup();
        String source = editor.textArea.getSelectedText();
        editor.clipboard = editor.textArea.getSelectedText();
        editor.textArea.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textArea.getSelectionStart());
        String end = source.substring(editor.textArea.getSelectionEnd());
        return start + end;
    }
}
