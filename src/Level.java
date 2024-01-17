
class Level {

  String name;
  char[][] grid;

  public void setName(String name) {
    this.name = name;
  }

  public void emptyCell(int column, int row) {
    grid[column][row] = ' ';
  }

  public void addWall(int column, int row) {
    grid[column][row] = '#';
  }

  public void addPlayer(int column, int row) {
    grid[column][row] = '@';
  }

  public void addGoal(int column, int row) {
    grid[column][row] = '.';
  }

  public int columns() {
    return this.grid.length;
  }

  public int rows() {
    if (this.columns() == 0) {
      return 0;
    }
    return this.grid[0].length;
  }
}