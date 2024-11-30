package design.command.commands;

// 将所选文字复制到剪切板

import design.command.editor.Editor;

public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textArea.getSelectedText();
        return true;
    }
}
