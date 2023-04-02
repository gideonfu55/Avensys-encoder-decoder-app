package coders;
public class CoderMain {

  protected static final String REFERENCE_TABLE_LIST = "ABCDEFGHIJKLMNOPQRSTUVWYXZ0123456789()*+,-./";

  private char offset;
  private String shiftedTable;

  // Constructor builds Encoder object using:
  // - a.) a randomized offset, and
  // - b.) a new shiftedTable based on the random offset.
  public CoderMain() {
    this.offset = REFERENCE_TABLE_LIST.charAt((int)(Math.random() * REFERENCE_TABLE_LIST.length()));
    this.shiftedTable = shiftTable(this.offset);
  }

  // Getters:
  public char getOffset() {
    return this.offset;
  }

  public String getShiftedTable() {
    return this.shiftedTable;
  }

  // Setters (not all required):
  public void setOffset(char offset) {
    this.offset = offset;
  }

  // Methods:

  // Get a new table by shifting all characters based on the selected offset, according to distance of the offset from its original index:
  public String shiftTable(char offset) {
    StringBuilder shiftedTable = new StringBuilder();
    int referenceIndex = REFERENCE_TABLE_LIST.indexOf(offset);

    if (referenceIndex == -1) return REFERENCE_TABLE_LIST;

    for (int i = 0; i < REFERENCE_TABLE_LIST.length(); i++) {
      if (i < referenceIndex) {
        shiftedTable.append(REFERENCE_TABLE_LIST.charAt(REFERENCE_TABLE_LIST.length() - referenceIndex + i));
      } else {
        shiftedTable.append(REFERENCE_TABLE_LIST.charAt(i - referenceIndex));
      }
    }

    return shiftedTable.toString();
  }

  // toString:
  @Override
  public String toString() {
    return "{" +
      " offset='" + getOffset() + "'" +
      ", shiftedTable='" + getShiftedTable() + "'" +
      " }";
  }

}
