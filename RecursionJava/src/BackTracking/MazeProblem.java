package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblem {
    public static void main(String[] args) {
        int res=MazeCount(3,3);
       ArrayList<String> ress=MazePathObstacle(3,3,"");
        for (String el:ress) {
            System.out.println(el);
        }
    }

    static int MazeCount(int row,int col){
        if(row==1 && col==1){

            return 1;
        }

        int left=0,right=0;
        if(row>0){
            left= MazeCount(row-1,col);
        }
        if(col>0){
            right= MazeCount(row,col-1);
        }
        return left+right;
    }

    static void Maze(int row,int col,String path){
        if(row==1 && col==1){
            System.out.println(path);
            return;
        }


        if(row>0){
            Maze(row-1,col,path+"D");
        }
        if(col>0){
            Maze(row,col-1,path+"R");
        }
    }

    static ArrayList<String> MazePath(int row, int col, String path) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> res = new ArrayList<>();

        if (row > 0) {
            res.addAll(MazePath(row - 1, col, path + "D"));
        }
        if (col > 0) {
            res.addAll(MazePath(row, col - 1, path + "R"));
        }

        return res;
    }

    static ArrayList<String> MazePathDiagonal(int row, int col, String path) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> res = new ArrayList<>();

        if (row > 1) {
            res.addAll(MazePathDiagonal(row - 1, col, path + "D"));
        }
        if (col > 1) {
            res.addAll(MazePathDiagonal(row, col - 1, path + "R"));
        }

        if (row > 1 && col>1) {
            res.addAll(MazePathDiagonal(row-1, col - 1, path + "X"));
        }

        return res;
    }

    static ArrayList<String> MazePathObstacle(int row, int col, String path) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        if (row == 2 && col == 2) {
            ArrayList<String> list = new ArrayList<>();
            //list.add(path);
            return list;
        }

        ArrayList<String> res = new ArrayList<>();

        if (row > 0 ) {
            res.addAll(MazePathObstacle(row - 1, col, path + "D"));
        }
        if (col > 0) {
            res.addAll(MazePathObstacle(row, col - 1, path + "R"));
        }

        return res;
    }

}
