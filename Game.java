public class Game{

private String title;
private double score;
private String genre;

/*
*Parameterized constructor fo game
*/
public Game(String title, double score, String genre){
  this.title=title;
  this.score=score;
  this.genre=genre;
}
/*
*no arguement Constructor for game
*/
public Game(){
  String title="no Title";
  double score=0.0;
  String genre="no Genre";
}

  /*
   * Returns the title of the game at the indicated index
   */
  public String getTitle() {
    return title;
  }

  /*
   * Returns the score at that index
   */
  public double getScore() {
    return score;
  }

  /*
   * Returns the genre of the game at that specific index
   */
  public String getGenre() {
    return genre;
  }
/*
*To String for the game
*/
public String toString(){
  return "Title: " + title +"\nScore: " + score + "\nGenre: "+ genre;
}
}