package design.flyweight.trees;

// 包含多棵树共享的状态

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeDate;

    public TreeType(String name, Color color, String otherTreeDate) {
        this.name = name;
        this.color = color;
        this.otherTreeDate = otherTreeDate;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.drawRect(x - 5, y - 10, 10, 10);
    }
}
