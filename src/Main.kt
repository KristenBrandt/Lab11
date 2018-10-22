fun pickNarrator(): String{
    return """
        Bienvenido a narrador de eventos de Dota 2
        Ingrese el numero de narrador que desee:
        1. Narrador en ingles
        2. Narrador en español
        """.trimIndent()
}

fun main(args: Array<String>) {
    var leng : String
    println(pickNarrator())
    leng = readLine()!!

}