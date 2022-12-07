package segundaParte

var depo: Float = 0.0F
var ret: Float = 0.0F

fun main(){
    val cuenta1 = Cuenta("01-8547-9","Alberto Palma",5000.00F)
    do{
        println("""
            ---------- Menu ----------
            ¿Que desea hacer?
            1.- Depositar
            2.- Retirar
            3.- Salir
        """.trimIndent())
        val opc = readLine()!!.toInt()
        when (opc){
            1->{
                cuenta1.depoCuenta()
            }
            2->{
                cuenta1.retirarCuenta()
            }
        }
    }while(opc!=3)
}