package com.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("hello", 1);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Integer hello = map.get("hello");
        boolean hello1 = map.containsKey("hello");
        boolean hello2 = map.containsValue("hello");
    }

}

 class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 class Solution {
     public boolean HasSubtree(TreeNode root1,TreeNode root2) {
         if (root2== null){
             return false;
         }
         return juidge1(root1, root2);
     }

     public static boolean  juidge1(TreeNode root1,TreeNode root2){
         if (root1 == null){
             return false;
         }

         if (juidge(root1, root2)){
             return true;
         }

         return juidge1(root1.right,root2) ||  juidge1(root1.left,root2);
     }
     public static boolean juidge(TreeNode root1,TreeNode root2){
         if (root1 == null && root2 == null){
             return true;
         }

         if (root1 == null && root2 != null){
             return false;
         }

         if (root1 != null && root2 == null){
             return true;
         }

         if (root1.val != root2.val){
             return false;
         }
         return juidge(root1.left, root2.left) && juidge(root1.right, root2.right);
     }
}

 class Solution1 {

    // 走的方向：向右、向下、向左、向上
    private final int[] dx = {0, 1, 0, -1};
    private final int[] dy = {1, 0, -1, 0};

    public ArrayList<Integer> printMatrix(int[][] matrix) {

        int n = matrix.length, m = matrix[0].length;
        boolean[][] vis = new boolean[n][m];
        ArrayList<Integer> list = new ArrayList<>();

        int x = 0, y = 0, dir = 0;
        while (x >= 0 && x < n && y >= 0 && y < m && !vis[x][y]) {
            list.add(matrix[x][y]);
            vis[x][y] = true;

            // 试着继续向dir的方向走
            while (x + dx[dir] >= 0 && x + dx[dir] < n && y + dy[dir] >= 0 && y + dy[dir] < m && !vis[x + dx[dir]][y + dy[dir]]) {
                x += dx[dir];
                y += dy[dir];
                list.add(matrix[x][y]);
                vis[x][y] = true;
            }
            // 走不动了换方向
            dir = (dir + 1) % 4;
            x += dx[dir];
            y += dy[dir];
        }
        return list;
    }
}