/* A simple Postorder traversal
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/
void Postorder(Node root) {
    if(root.left !=null){
        Postorder(root.left);
    }
    if(root.right!=null){
        Postorder(root.right);
    }
    System.out.print(root.data+" ");

}
/* A simple Preorder traversal
*/
void Preorder(Node root) {
    System.out.print(root.data+" ");
    if(root.left != null){
        Preorder(root.left);
    }
    if(root.right!=null){
        Preorder(root.right);
    }
    
}

//A simple Inorder traversal
void Inorder(Node root) {
    if(root.left!=null){
        Inorder(root.left);
    }
    System.out.print(root.data+" ");
    if(root.right!=null){
        Inorder(root.right);
    }
}
/*A simple algorithm to find the height of a tree
    3
   /   \
  5     2           height = 4 
 / \    /
1   4  6
      /
     7
*/
 int height(Node root)
    {
       int height = 1;
       int left = 0;
       int right = 0;
       if(root.left != null){
           left = height(root.left);
       }
       if(root.right != null){
           right = height(root.right);
       }
       return height+Math.max(left,right);
    }

// a simple  top_view example 
//(Note this does not cover the correct cases as defined byhttp://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/)
void top_view(Node root)
{
    if(root.left!=null){
        top_view(root.left);
    }
    if(root.left!=null || root.right!=null){
        System.out.print(root.data+" ");
    }
    if(root.right!=null){
        top_view(root.right);
    }
}
//