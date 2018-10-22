class partido<T> (val narrador: Narrador){
    fun bienvenida(): String{
        return narración(narrador,"bienvenida")

    }
    fun empezarJuego(): String{
        return narración(narrador,"empezarJuego")

    }
    fun ocurrioUnKill(esRadiant: Boolean){
        return narración(narrador,"ocurrioUnKill")

    }
    fun ocurrieronDosOMasKills(esRadiant: Boolean){

    }
    fun ocurrieronCincoKills(esRadiant: Boolean){

    }
    fun matanUnaTorre(esRadiant: Boolean){

    }
    fun direGana(){
        return narración(narrador, "direGana")

    }
    fun radiantGana(){
        return narración( narrador, "radiantGana")

    }
    private fun narración(narrador: Narrador, tipoEvento: String): String{
        return narrador.narrar(tipoEvento)

    }
}