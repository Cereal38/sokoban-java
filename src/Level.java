
class Level {

  String name;
  char[][] grid;

  public int columns() {
    return this.grid.length;
  }

  public int rows() {
    if (this.columns() == 0) {
      return 0;
    }
    return this.grid[0].length;
  }

  public String name() {
    return this.name;
  }

  public boolean isEmpty(int column, int row) {
    return (grid[column][row] == ' ');
  }

  public boolean isWall(int column, int row) {
    return (grid[column][row] == '#');
  }

  public boolean isGoal(int column, int row) {
    return (grid[column][row] == '.' || grid[column][row] == '+' || grid[column][row] == '*');
  }

  public boolean isPlayer(int column, int row) {
    return (grid[column][row] == '@' || grid[column][row] == '+');
  }

  public boolean isBox(int column, int row) {
    return (grid[column][row] == '$' || grid[column][row] == '*');
  }

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

  public void addBox(int column, int row) {
    grid[column][row] = '$';
  }
}