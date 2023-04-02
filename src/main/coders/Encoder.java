package main.coders;
public class Encoder extends CoderMain {

  /**
   * Method name: encode()
   * 
   * @param plainText
   * @return String
   * 
   * Within function:
   * 1. To check that the input is not null or empty.
   * 2. Use StringBuilder to append the randomized offset as the first char of the encoded string.
   * 3. For each char in the plainText input, find original index of char and use it to find new char
   *    from shifted table based on offset distance.
   * 4. Append new char to StringBuilder.
   * 5. Return StringBuilder.toString().
   * 
   */
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
