package AVLTrees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntTree_tests {

    private IntTree newTree(int... values) {
        IntTree tree = new IntTree();
        for(int data : values) {
            tree.addValue(data);
        }
        return tree;
    }

    private IntTree newTreeAVL(int... values) {
        IntTree tree = new IntTree();
        for(int data : values) {
            tree.addValueAVL(data);
        }
        return tree;
    }

    @Test
    public void test_bstTree() {
        IntTree tree = newTree();
        String expected = 
        "[1]               \n" +
        "   \\              \n" +
        "   [2]            \n" +
        "      \\           \n" +
        "      [3]         \n" +
        "         \\        \n" +
        "         [4]      \n" +
        "            \\     \n" +
        "            [5]   \n" +
        "               \\  \n" +
        "               [6]\n" +
        "                  \n";
        String output = tree.toPrettyPrint();
        System.out.println(output);
        assertEquals(expected, output);
    }

    @Test
    public void test_AVLTree() {
        IntTree tree = newTree(4, 2, 10, 1, 3, 7, 11, 5, 9, 12);
        /*String expected = 
        "[1]               \n" +
        "   \\              \n" +
        "   [2]            \n" +
        "      \\           \n" +
        "      [3]         \n" +
        "         \\        \n" +
        "         [4]      \n" +
        "            \\     \n" +
        "            [5]   \n" +
        "               \\  \n" +
        "               [6]\n" +
        "                  \n";*/
        String output = tree.toPrettyPrint();
        System.out.println(output);
        tree.addValueAVL(8);
        String output2 = tree.toPrettyPrint();
        System.out.println(output2);
        //assertEquals(expected, output);
    }
}
