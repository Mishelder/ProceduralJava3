package BinaryTree;

import sun.reflect.generics.tree.Tree;

public class TreeMap {

    public TreeNode root;

    public TreeMap(){
        this.root =null;
    }

    public void addR(TreeNode root, int num){
        TreeNode newTreeNode = new TreeNode(num);
        if(this.root == null){
            this.root = newTreeNode;
            return;
        }

        if(num<root.data&&root.left==null){
            root.left = newTreeNode;
            return;
        }else if(num<root.data){
            addR(root.left,num);
            return;
        }

        if(num>root.data&&root.right==null){
            root.right = newTreeNode;
            return;
        }else if(num>root.data){
            addR(root.right,num);
            return;
        }
    }

    public void printR(TreeNode root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        printR(root.left);
        printR(root.right);
    }

    public int sizeR(TreeNode root){
        return (root==null)?0:1+sizeR(root.left)+sizeR(root.right);
    }

    public int heightR(TreeNode root){
        return root==null?0:1+Math.max(heightR(root.left), heightR(root.right));
    }

    public int sumR(TreeNode root){
        return root==null?0:root.data+sumR(root.left)+sumR(root.right);
    }

    public int maxR(TreeNode root){
        return root==null?0:Math.max(Math.max(maxR(root.right),maxR(root.left)),root.data);
    }


}
