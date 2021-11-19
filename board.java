
package deadwood;

public class Board{

  //Board is a graph
  public Board(){}

  // creates an edge between adjacent locations on the board
  public void addPath(String source, String destination){}

  // returns array of adjacent locations
  public String[] getNeighbors(String name){}

  //converts locations into user readable strings
  public String toString(){}

  //takes in number of players and distributes scene cards and shot counters
  public static void setUp(){}

  //rotates turn order queue
  public static void endTurn(){}


  //sends player to Trailers, restores shot counters, places face-down scene card
  //on each set
  public static void endDay(){}

  //calculates player scores
  public static String endGame(){}

  //takes in player stats and returns an int of player score
  public static int calculateScore(int rank, int dollars, int credits){}
}
