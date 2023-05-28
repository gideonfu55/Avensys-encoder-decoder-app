# Encoder and Decoder

This is a solution for an assessment which I did on the following question.

## Requirement

You are to write an encoder that takes in a plaintext and encode it to another obfuscated string.

## Logic

Choose any character in the reference table as the offset. The first character of the encoded message will be the offset character. Any character not in the reference table will mapped back to the same character.

For example, if the offset character is B, the entire table will shift by 1 element down (Refer to Shift Table #1). Thus, given the plaintext HELLO WORLD, it will be encoded as BGDKKN VNQKC.

<img width="284" alt="hello_world" src="https://github.com/gideonfu55/encoder-decoder-app/assets/94817218/23a5dec1-4cc2-45d2-9371-729f7e011a16">

Let’s take F as the offset character for another example. The entire table will shift 5 elements down (Refer to Shift Table #2). Given the same plaintext, the encoded message will be:
FC/GGJ RJMG.

<img width="285" alt="hello_world2" src="https://github.com/gideonfu55/encoder-decoder-app/assets/94817218/8b1eac16-776b-4e8b-aedd-48233e9d4e9b">

To decode it, you need to take the first character for offset and match it backwards to get the original plaintext.

## Reference Table

<img width="171" alt="reference_table" src="https://github.com/gideonfu55/encoder-decoder-app/assets/94817218/7de48e00-3ef8-4907-afe8-45b04affb839">

## Constraints

The solution must implement the following 2 methods:
public String encode (String plainText);
public String decode (String encodedText);

## Bonus

The solution should also demonstrate the concept of OOP.
