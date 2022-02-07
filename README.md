# Brainfuck

[中文README](README_CN.md)

The brainfuck language implemented by simple java code.

Here is the introduction of this funny language(Copied from [Wikipedia](https://wikipedia.org/wiki/Brainfuck))

| Character | Meaning                                                      |
| --------- | ------------------------------------------------------------ |
| `>`       | Increment the data pointer (to point to the next cell to the right). |
| `<`       | Decrement the data pointer (to point to the next cell to the left). |
| `+`       | Increment (increase by one) the byte at the data pointer.    |
| `-`       | Decrement (decrease by one) the byte at the data pointer.    |
| `.`       | Output the byte at the data pointer(ASCII).                  |
| `,`       | Accept one byte of input, storing its value in the byte at the data pointer(ASCII). |
| `[`       | If the byte at the data pointer is zero, then instead of moving the instruction pointer forward to the next command, jump it *forward* to the command after the *matching* `]` command. |
| `]`       | If the byte at the data pointer is nonzero, then instead of moving the instruction pointer forward to the next command, jump it *back* to the command after the *matching* `[` command. |



## Examples

### Hello World!

The following program prints "Hello World!" and a newline to the screen:

```brainfuck
++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.
```

### Conditional Instruction

The following program will converts input characters to upper case:

```brainfuck
,----------[----------------------.,----------]
```

Please go to [Wikipedia](https://wikipedia.org/wiki/Brainfuck) to see more examples.