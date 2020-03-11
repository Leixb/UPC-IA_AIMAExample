package IA.ProbIA5;

import java.util.Arrays;

/**
 * Created by bejar on 17/01/17.
 */
public class ProbIA5Board {
    /* Class independent from AIMA classes
       - It has to implement the state of the problem and its operators
     *

    /* State data structure
    vector with the parity of the coins (we can assume 0 = heads, 1 = tails
    */

    private int [] board;
    private static int [] solution;

    /* Constructor */
    public ProbIA5Board(int []init, int[] goal) {

        board = new int[init.length];
        solution = new int[init.length];

        for (int i = 0; i< init.length; i++) {
            board[i] = init[i];
            solution[i] = goal[i];
        }

    }

    /* vvvvv TO COMPLETE vvvvv */
    public void flip_it(int i){
        // flip the coins i and i + 1
        int ni = (i+1)%board.length; // if (i+1 == board.length) ni = 0;

        int tmp = board[i];

        board[i] = board[ni];
        board[ni] = tmp;
    }

    /* Heuristic function */
    public double heuristic(){
        // compute the number of coins out of place respect to solution
        int diff = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != solution[i]) ++diff;
        }
        return 0;
    }

    /* Goal test */
    public boolean is_goal(){
        // compute if board = solution
        return Arrays.equals(board, solution);
    }

    /* auxiliary functions */

    // Some functions will be needed for creating a copy of the state

    public int[] getBoard() {
        return board.clone(); //return board.clone();
    }

    public int size() {
        return board.length;
    }

    // Constructora sin goal (es static con la primera ya vale)
    public ProbIA5Board(int []init) {
        board = new int[init.length];

        for (int i = 0; i< init.length; i++) {
            board[i] = init[i];
        }
    }

    /* ^^^^^ TO COMPLETE ^^^^^ */

}
