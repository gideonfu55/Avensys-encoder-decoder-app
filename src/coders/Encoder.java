package coders;
public class Encoder extends CoderMain {

  public String encode(String plainText) {
    if (plainText == null || plainText.isEmpty()) return "There is no input.";
    
    StringBuilder output = new StringBuilder().append(this.getOffset());
    for (char c : plainText.toUpperCase().toCharArray()) {
      int referenceIndex = REFERENCE_TABLE_LIST.indexOf(c);
      if (c == ' ') {
        output.append(' ');
      } else {
        output.append(this.getShiftedTable().charAt(referenceIndex));
      }
    }
    return output.toString();
  }

}
