import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by OovEver on 2017/6/28.
 */
 class TreeNode {
         int val;
         TreeNode left;
        TreeNode right;
         TreeNode(int x) { val = x; }
     }
public class LeetCode144 {
    class Command {
        String s;//go print
        TreeNode node;

        Command(String s, TreeNode node) {
            this.s = s;
            this.node = node;
        }


    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<Command> stack=new Stack<>();
        stack.push(new Command("go", root));
        while (!stack.empty()) {
            Command command = stack.peek();
            stack.pop();
            if (command.s == "print") {
                res.add(command.node.val);
            } else if(command.s=="go") {
                if (command.node.right!=null) {
                    stack.push(new Command("go", command.node.right));


                }
                if (command.node.left!=null) {
                    stack.push(new Command("go", command.node.left));
                }
                stack.push(new Command("print", command.node));
            }
        }
        return res;

    }
}
