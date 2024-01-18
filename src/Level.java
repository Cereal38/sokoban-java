
class Level {

  String name;
  char[][] grid;

  public int rows() {
    return this.grid.length;
  }

  public int columns() {
    if (this.rows() == 0) {
      return 0;
    }
    return this.grid[0].length;
  }

  public char[][] grid() {
    return this.grid;
  }

  public String name() {
    return this.name;
  }

  public boolean isEmpty(int row, int column) {
    return (grid[row][column] == ' ');
  }

  public boolean isWall(int row, int column) {
    return (grid[row][column] == '#');
  }

  public boolean isGoal(int row, int column) {
    char cell = grid[row][column];
    return (cell == '.' || cell == '+' || cell == '*');
  }

  public boolean isPlayer(int row, int column) {
    char cell = grid[row][column];
    return (cell == '@' || cell == '+');
  }

  public boolean isBox(int row, int column) {
    char cell = grid[row][column];
    return (cell == '$' || cell == '*');
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGrid(char[][] grid) {
    this.grid = grid;
  }

  public void emptyCell(int row, int column) {
    grid[row][column] = ' ';
  }

  public void addWall(int row, int column) {
    grid[row][column] = '#';
  }

  public void addPlayer(int row, int column) {
    grid[row][column] = '@';
  }

  public void addGoal(int row, int column) {
    grid[row][column] = '.';
  }

  public void addBox(int row, int column) {
    grid[row][column] = '$';
  }
}