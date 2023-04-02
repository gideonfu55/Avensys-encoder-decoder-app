package coders;
public class Decoder extends CoderMain{

  /**
   * Method name: decode()
   * 
   * @param encodedText
   * @return String
   * 
   *  Within function:
   *  1. To check that the encoded text input is not null or empty, and that the offset based on
   *     first char is valid.
   *  2. Set offset char for Decoder object if it's valid.
   *  3. For each char in the encoded text input, look for the original reference index based on
   *     reversal of offset. 
   *  4. Append each char in (3) to StringBuilder.
   *  5. Return StringBuilder.toString().
   * 
   */
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
