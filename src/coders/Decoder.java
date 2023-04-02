package coders;
public class Decoder extends CoderMain{

  public String decode(String encodedText) {
    char offset = encodedText.charAt(0);
    if (encodedText == null || encodedText.isEmpty()) return "There is no input.";
    if (REFERENCE_TABLE_LIST.indexOf(offset) == -1) return "The first character is not a valid offset.";

    this.setOffset(encodedText.charAt(0));

    StringBuilder output = new StringBuilder();
    for (char c : encodedText.toUpperCase().toCharArray()) {
      int referenceIndex = shiftTable(this.getOffset()).indexOf(c);
      if (c == ' ') {
        output.append(' ');
      } else {
        output.append(REFERENCE_TABLE_LIST.charAt(referenceIndex));
      }
    }

    return output.substring(1);
  }
}
