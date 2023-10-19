fun main(args: Array<String>) {
    val inputString = readln()
    val store = mutableListOf<Char>()
    val shiftValue = 3
    for (char in inputString) {
        //char is ' '
        if (char.isWhitespace()) {
            store.add(char)
        } else {
            val ascii = char.code
            val decode = (ascii - 'A'.code + shiftValue) % 26 + 'A'.code
            val toCharValue = decode.toChar()
            store.add(toCharValue)
        }
    }
    val builder = stringBuilder(store)
    println("The original messsage is: $inputString")
    println("The encrypted message is: $builder")
}

fun stringBuilder(chars: List<Char>): String {
    return buildString {
        for (char in chars) {
            if (char.isWhitespace()) {
                append(' ')
            } else {
                append(char)
            }
        }
    }
}