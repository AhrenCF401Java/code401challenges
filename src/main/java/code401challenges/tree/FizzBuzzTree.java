package code401challenges.tree;

public class FizzBuzzTree<E> {
    public static Tree<Object> fizzBuzzTree(Tree<Object> t){
        fb(t.root);
        return t;
    }

    public static void fb(Node<Object> cur){
        if(cur != null){
            fb(cur.left);
            fb(cur.right);
            if((Integer) cur.value % 15 == 0){
                cur.value = "fizzbuzz";
            }else if((Integer)cur.value % 3 == 0){
                cur.value = "fizz";
            }else if((Integer)cur.value % 5 == 0){
                cur.value = "buzz";
            }

        }
    }
}
