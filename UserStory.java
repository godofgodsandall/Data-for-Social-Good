public class UserStory{

private Game[] games;
/*
  * Reads the data from titlefile, scorefile, and
* genrefile to initialize the 1D array answers
*/
  public UserStory(String titlesFile, String scoreFile, String genreFile){
games= createGames(titlesFile, scoreFile, genreFile);
  }
/*
*this creates a game object using data from tiltle.txt, score.txt, and genre.txt
*/
public Game[] createGames(String titlesFile, String scoreFile, String genreFile){
String[] title = FileReader.toStringArray(titlesFile);
double[] score = FileReader.toDoubleArray(scoreFile);
String[] genre = FileReader.toStringArray(genreFile);
Game[] tempGames = new Game[title.length];

for (int i= 0; i < tempGames.length; i++){
  tempGames[i] = new Game(title[i], score[i], genre[i]);
}
return tempGames;
  }
 /*
 *This returns an array of all of the games with the same specified genre.
 */
public Game[] getGenreGame(String targetGenre) {
    Game[] genreGames = new Game[games.length];
    int count = 0;
    for (Game game : games) {
        if (game.getGenre().equals(targetGenre)) {
            genreGames[count++] = game;
        }
    }
    Game[] result = new Game[count];
    System.arraycopy(genreGames, 0, result, 0, count);
    return result;
}
/*
*This counts the number of times a the target genre shows up in the list
*/
 public int countGenre(String targetGenre) {
    int count = 0;

    for (Game response : games) {
     if (response.getGenre().equals(targetGenre)) {
        count++;
      }
    }

    return count;
  }

 
/*
*Returns a String containing the information of each game
*/
public String toString(){
  String result = "";
 
    for (Game game  : games) {
      result += game;
    }
    return result;
  }
}