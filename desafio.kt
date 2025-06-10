enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val nome: String , val idade: Int) 

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        
        inscritos += usuario
        
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    
    var user1 = Usuario("Jefferson" , 33)
    var user2 = Usuario("Guilherme" , 27)
    var user3 = Usuario("Fernanda" , 19)
    
    val html = ConteudoEducacional("html" , 2)
    val css = ConteudoEducacional("css" , 3)
    
    val frontEnd = Formacao("Front-end" , listOf (html,css))
    
    println(frontEnd)
    
   
    
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
