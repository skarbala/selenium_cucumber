package enumerators;

public enum BananaTableColumn {
  PRICE_FOR_ONE_BANANA(1),
  NUMBER_OF_BANANAS(2),
  PRICE_BEFORE_DISCOUNT(3),
  DISCOUNT(4),
  TOTAL_PRICE(5);

  private int rowIndex;

  private BananaTableColumn(int rowIndex) {
    this.rowIndex = rowIndex;
  }

  public int getRowIndex() {
    return rowIndex;
  }
}