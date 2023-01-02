public class Main {

    public static class Node
    {
        String name;
        Node sibling, child;

        public Node(String name)
        {
            this.name = name;
            sibling = child;
            child = null;
        }
    }

    static public Node addSibling(Node node, String name)
    {
        if(node == null)
            return null;

        while(node.sibling != null)
            node = node.sibling;
        return(node.sibling = new Node(name));
    }

    static public Node addChild(Node node,String name)
    {
        if(node == null)
            return null;

        if(node.child != null)
            return(addSibling(node.child,name));
        else
            return(node.child = new Node(name));
    }

    static public void preorderTraversal(Node root)
    {
        if(root == null)
        {
            System.out.println("Дерево пустое! Нет корня!");
        }
        while(root != null)
        {
            System.out.print(root.name + " - ");
            if(root.child != null)
                preorderTraversal(root.child);
            root = root.sibling;
        }
    }

    public static void main(String args[])
    {
        System.out.println("Генеалогическое дерево с обходом: ");

        Node root = new Node("Андрей");
        Node node1 = addChild(root, "Саша");
        Node node2 = addChild(root,"Лена");
        Node node3 = addSibling(root,"Аня");
        Node node4 = addChild(node1,"Лёня");
        Node node5 = addSibling(root,"Костя");
        Node node6 = addChild(node2,"Алена");
        Node node7 = addChild(node3,"Света");
        Node node8 = addSibling(node4,"Наташа");


        preorderTraversal(root);


    }
}

      
