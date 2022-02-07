# Brainfuck

[English README](README_EN.md)

由Java简单代码实现的Brainfuck语言

这是一个神奇的编程语言(以下拷贝自[Wikipedia](https://zh.wikipedia.org/wiki/Brainfuck))

| 字符 | 含义                                                         |
| ---- | ------------------------------------------------------------ |
| `>`  | 指针加一                                                     |
| `<`  | 指针减一                                                     |
| `+`  | 指针指向的字节的值加一                                       |
| `-`  | 指针指向的字节的值减一                                       |
| `.`  | 输出指针指向的单元内容（ASCII码）                            |
| `,`  | 输入内容到指针指向的单元（ASCII码）                          |
| `[`  | 如果指针指向的单元值为零，向后跳转到对应的`]`指令的次一指令处 |
| `]`  | 如果指针指向的单元值不为零，向前跳转到对应的`[`指令的次一指令处 |



## 例子

### Hello World!

以下代码可打印出Hello World：

```brainfuck
++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.
```

### 条件指令

这个程序会把从键盘读来的小写字符转换成大写

```brainfuck
,----------[----------------------.,----------]
```

更多的例子请见[Wikipedia](https://zh.wikipedia.org/wiki/Brainfuck)或[百度百科](https://baike.baidu.com/item/Brainfuck/1152785)