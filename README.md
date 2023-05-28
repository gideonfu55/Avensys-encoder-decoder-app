# Encoder and Decoder

This is a solution for an assessment which I did on the following question.

## Requirement

You are to write an encoder that takes in a plaintext and encode it to another obfuscated string.

## Logic

Choose any character in the reference table as the offset. The first character of the encoded message will be the offset character. Any character not in the reference table will mapped back to the same character.

For example, if the offset character is B, the entire table will shift by 1 element down (Refer to Shift Table #1). Thus, given the plaintext HELLO WORLD, it will be encoded as BGDKKN VNQKC.

![hello_world](https://github.com/gideonfu55/encoder-decoder-app/assets/94817218/cd9baeeb-e580-4670-b910-58959835d326")


Let’s take F as the offset character for another example. The entire table will shift 5 elements down (Refer to Shift Table #2). Given the same plaintext, the encoded message will be:
FC/GGJ RJMG.

![hello_world2](https://github.com/gideonfu55/encoder-decoder-app/assets/94817218/010790a3-542f-49cf-bc7b-055330223185")

To decode it, you need to take the first character for offset and match it backwards to get the original plaintext.

## Reference Table

![reference_table](https://github.com/gideonfu55/encoder-decoder-app/assets/94817218/7de48e00-3ef8-4907-afe8-45b04affb839)

## Constraints

The solution must implement the following 2 methods:

- public String encode (String plainText)

- public String decode (String encodedText)

## Bonus

The solution should also demonstrate the concept of OOP.
