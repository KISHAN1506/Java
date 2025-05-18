public class file {
    public static void main(String[] args) {
        // C Operator Precedence and Associativity Table

// Precedence  | Operator(s)                              | Description                             | Associativity
// -----------------------------------------------------------------------------------------------------------------
// 14          | () [] . ->                                 | Function call, Array subscript,        | Left-to-Right
//             |                                            | Structure/Union member access          |
// 13          | ! ~ - ++ -- & * (type) sizeof              | Logical NOT, Bitwise NOT, Unary minus, | Right-to-Left
//             |                                            | Increment, Decrement, Address-of,      |
//             |                                            | Indirection, Cast, Sizeof              |
// 12          | * / %                                      | Multiplication, Division, Modulus      | Left-to-Right
// 11          | + -                                        | Addition, Subtraction                  | Left-to-Right
// 10          | << >>                                      | Left shift, Right shift                | Left-to-Right
// 8           | < <= > >=                                  | Relational operators                   | Left-to-Right
// 8           | == !=                                      | Equality operators                     | Left-to-Right
// 7           | &                                          | Bitwise AND                            | Left-to-Right
// 6           | ^                                          | Bitwise XOR                            | Left-to-Right
// 5           | |                                          | Bitwise OR                             | Left-to-Right
// 4           | &&                                         | Logical AND                            | Left-to-Right
// 3           | ||                                         | Logical OR                             | Left-to-Right
// 2           | ?:                                         | Conditional operator                   | Right-to-Left
// 1           | = += -= *= /= %= <<= >>= &= ^= |=          | Assignment operators                   | Right-to-Left
// 0           | ,                                          | Comma operator                         | Left-to-Right
    }
}