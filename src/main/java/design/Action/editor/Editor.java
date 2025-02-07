package design.Action.editor;

import design.Action.commands.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {
    // 文本框
    public JTextArea textField;
    public String clipboard;
    // 历史操作
    private CommandHistory history = new CommandHistory();

    public void Init() {
        // 窗口
        JFrame frame = new JFrame("Text editor (type & use buttons, Luke!)");
        // 面板
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        textField = new JTextArea();
        // 是否自动换行
        textField.setLineWrap(true);
        // 面板添加文本框
        content.add(textField);
        // 按钮组件
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");

        Editor editor = this;
        // 复制
        ctrlC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyCommand(editor));
            }
        });
        // 剪切
        ctrlX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CutCommand(editor));
            }
        });
        // 粘贴
        ctrlV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new PasteCommand(editor));
            }
        });
        // 撤销
        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });

        // 按钮添加事件
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);

        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if(command.execute())
        {
            history.push(command);
        }
    }

    private void undo() {
        if(history.isEmpty()) return;

        Command command = history.pop();
        if(command != null) {
            command.undo();
        }
    }
}
