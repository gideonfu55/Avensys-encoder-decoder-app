# Encoder and Decoder

Solution for an assessment which I did for the following question:

## Requirement

You are to write an encoder that takes in a plaintext and encode it to another obfuscated string. The logic of the encoding / decoding is given below:

## Logic

Choose any character in the reference table as the offset. The first character of the encoded message will be the offset character. Any character not in the reference table will mapped back to the same character.

For example, if the offset character is B, the entire table will shift by 1 element down (Refer to Shift Table #1). Thus, given the plaintext HELLO WORLD, it will be encoded as BGDKKN VNQKC.

Let’s take F as the offset character for another example. The entire table will shift 5 elements down (Refer to Shift Table #2). Given the same plaintext, the encoded message will be:
FC/GGJ RJMG.

To decode it, you need to take the first character for offset and match it backwards to get the original plaintext.

## Constraints

The solution must implement the following 2 methods:
public String encode (String plainText);
public String decode (String encodedText);

## Bonus

The solution should also demonstrate the concept of OOP.
