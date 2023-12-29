package BinarySearchTree;

// Mendefinisikan simpul atau node dalam pohon biner
class Node {
    int data;
    Node left, right;

    //Konstruktor Node untuk menciptakan sebuah node baru.
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Kelas BinarySearchTree menyediakan implementasi untuk Binary Search Tree.
 
public class BinarySearchTree {

    Node root;  // Mendeklarasikan node root dari BST

    // Menyisipkan suatu nilai ke dalam BST
    public Node insert(Node root, int data) {
        // Jika sub-pohon kosong, ciptakan node baru sebagai akar dari sub-pohon
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Rekursif menambahkan node berdasarkan perbandingan data
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        // Mengembalikan nilai root
        return root; 
    }

   
    // Metode untuk mencetak tree dengn terstruktur
    
    public void printTree(Node node, String indent, boolean last) {
        if (node != null) {
            System.out.println(indent + "+-- " + node.data);
            indent += last ? "    " : "|   ";
            printTree(node.right, indent, false);
            printTree(node.left, indent, true);
        }
    }

    //Metode main untuk menjalankan program

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();  // Membuat objek BST

    
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 10);
        bst.insert(bst.root, 35);
        bst.insert(bst.root, 65);
        bst.insert(bst.root, 80);

        // Mencetak struktur pohon dalam bentuk folder
        bst.printTree(bst.root, "", true);

    }
}