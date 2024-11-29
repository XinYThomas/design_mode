package design.flyweight.forest;

import design.flyweight.trees.Tree;
import design.flyweight.trees.TreeFactory;
import design.flyweight.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();
    public void plantTree(int x, int y, String name, Color color, String otherTreDatae) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreDatae);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics g) {
        for (Tree tree : trees) {
            tree.draw(g);
        }
    }
}
