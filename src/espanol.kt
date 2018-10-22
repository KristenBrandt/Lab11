class espanol:Narrador{
    override fun narrar(tipoEvento: String): String {
        when (tipoEvento){
            "bienvenida" -> {
                return """ Un nuevo juego esta apunto de empezar pero primero hay que escoger personajes""".trimIndent()
            }
            "empezarJuego" -> {
                return """ El juego ya va a empezar""".trimIndent()
            }
            "ocurrioUnKill" -> {
                return """ Ha ocurrido una muerte""".trimIndent()
            }
            "ocurrieronDosOMasKills" -> {
                return """Han ocurrido dos o mas muertes""".trimIndent()
            }
            "ocurrieronCincoKills" -> {
                return """Todo un equipo esta muerto""".trimIndent()
            }
            "matanUnaTorre" -> {
                return """Una torre ha caido""".trimIndent()
            }
            "direGana" -> {
                return  """Dire team gano la partida""".trimIndent()
            }
            "radiantGana" -> {
                return  """Radiant team gano la partida""".trimIndent()
            }
            else ->{
                return "Elija algo más"
            }
        }
    }

}