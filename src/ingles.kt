class ingles:Narrador{
    override fun narrar(tipoEvento: String): String {
        when (tipoEvento){
            "bienvenida" -> {
                return """ A new game is about to start but first heroes need to be chosen.""".trimIndent()
            }
            "empezarJuego" -> {
                return """ A new game is about to start""".trimIndent()
            }
            "ocurrioUnKill" -> {
                return """ A death has occured""".trimIndent()
            }
            "ocurrieronDosOMasKills" -> {
                return """Two or more deaths have occured""".trimIndent()
            }
            "ocurrieronCincoKills" -> {
                return """A whole team is dead""".trimIndent()
            }
            "matanUnaTorre" -> {
                return """A tower has fallen""".trimIndent()
            }
            "direGana" -> {
                return  """Dire team won the game""".trimIndent()
            }
            "radiantGana" -> {
                return  """Radiant team won the game""".trimIndent()
            }
            else ->{
                return "Choose something else"
            }
        }
    }

}