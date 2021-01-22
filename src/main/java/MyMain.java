public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        if (board[row][col]==true){
            System.out.println("There was a hit!");
            return true;
        }
        System.out.println("You missed a boat!");
        return false;
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        board[row][col]=true;
        if (direction.equals("down")){
            for (int i=0; i<boatLength; i++){
                board[row+i][col]=true;
            }
        }
        if (direction.equals("right")){
            for (int i=0; i<boatLength; i++){
                board[row][col+i]=true;
            }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        boolean inOrder=true;
        for (int row=0; row<words.length; row++){
            for (int col=0; col<words[0].length-1; col++){
                if (words[row][col].length()>words[row][col+1].length()){
                    inOrder=false;
                }
                if (words[row][col].charAt(0)>words[row][col+1].charAt(0)){
                    inOrder=false;
                }
            }
        }
        return inOrder;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
