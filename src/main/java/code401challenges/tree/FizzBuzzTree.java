package code401challenges.tree;

public class FizzBuzzTree {
    protected Tree fizzBuzzTree(Tree t){
        fb(t.root);
        return t;
    }

    protected void fb(Node cur){
        if(cur != null){
            fb(cur.left);
            fb(cur.right);
            if(cur.value % 15 == 0){
                cur.value = "fizzbuzz";
            }else if(cur.value % 3 == 0){
                cur.value = "fizz";
            }else if(cur.value % 5 == 0){
                cur.value = "buzz";
            }

        }
    }
}
