import bst.BST;

public class BSTTimeDriver {

    public static void main(String[] args) throws Exception {

        // i. empty BST and test getHeight (should be -1)
        long start, end;

        start = System.currentTimeMillis();
        BST myBST = new BST();
        int hEmpty = myBST.getHeight();
        end = System.currentTimeMillis();
        
      System.out.println("Empty tree height (should be 1): " + hEmpty);
      System.out.println(" empty height check (ms): " + (end - start));

        // ii. Add 1000 elements 
        // long chain with many distinct values,
      
      
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            // come back***
        	myBST.putItem(i / 2); 
        }
        ends= System.currentTimeMillis();
        System.out.println(" insert 1000 elements (ms): " + (end - start));

        	int heightBefore = myBST.getHeight();
        System.out.println("Height before balancing (should be -500): " + heightBefore);

        // Choose an item at bottom of 500
        int bottomItem = 499;

        // iii. Perform 10000 searches for an items at bottom
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
        	//for (int i = 0; i < ; i++)
            myBST.getItem(bottomItem);
        }
        end = System.currentTimeMillis();
        System.out.println(" 1000 searches (unbalanced) (ms): " + (end - start));

        // iv.slitBalance and  height
        //call splitBalance
       start = System.currentTimeMillis();
        myBST.splitBalance();
        
        end = System.currentTimeMillis();
        System.out.println(" splitBalance (ms): " + (end - start));

        int heightAfter = myBST.getHeight();
        System.out.println("Height after balancing: " + heightAfter);

        // v. Repeat 
        //
        
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            myBST.getItem(bottomItem);
        }
        end = System.currentTimeMillis();
        System.out.println(" 10000 searches (balanced (ms): " + (end - start));
    }
}