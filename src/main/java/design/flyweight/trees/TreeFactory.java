package design.flyweight.trees;

// 封装创建享元的复杂机制

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType treeType = treeTypes.get(name);
        if (treeType == null) {
            treeType = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, treeType);
        }
        return treeType;
    }
}
