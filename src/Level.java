
class Level {

  String name;
  char[][] grid;

  public void setName(String name) {
    this.name = name;
  }

  public void videCase(int column, int row) {
    grid[column][row] = ' ';
  }
}