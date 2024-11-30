package design.command.commands;

// 抽象基础命令
import design.command.editor.Editor;

public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textArea.getText();

    }

    public void undo() {
        editor.textArea.setText(backup);
    }

    public abstract boolean execute();
}
