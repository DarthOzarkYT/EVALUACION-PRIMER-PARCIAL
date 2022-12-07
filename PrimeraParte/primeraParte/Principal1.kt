package primeraParte

import kotlin.math.roundToInt

val cantidadIngrediente = arrayOf(20.0, 1.0, 7.5, 3.75, 1.5, 0.15, 0.5, 12.0)
var nombrePrograma: String = ""

fun main() {
    println(nombrePrograma)
    nombrePrograma = "\n## Ingredientes y costo de pedidos de donas ##"

    try{
        print("Total de donas a elaborar: ")
        val tot = readLine()!!.toInt()
        if(tot >= 20){
            val c = if (tot < 100) {
                tot * 6.0
            } else {
                tot * 5.55
            }

            println(
                """
        ***********************************
        Ingredientes para $tot donas
        Harina       | ${(cantidadIngrediente[0] * tot).roundToInt()} gramos
        Levadura     | ${(cantidadIngrediente[1] * tot).roundToInt()} gramos
        Azucar       | ${(cantidadIngrediente[2] * tot).roundToInt()} gramos
        Leche        | ${(cantidadIngrediente[3] * tot).roundToInt()} mililitros
        Mantequilla  | ${(cantidadIngrediente[4] * tot).roundToInt()} gramos
        Huevo        | ${(cantidadIngrediente[5] * tot).roundToInt()} huevos
        Sal          | ${(cantidadIngrediente[6] * tot).roundToInt()} gramos
        Aceite       | ${(cantidadIngrediente[7] * tot).roundToInt()} mililitros
        ***********************************
        Total a cobrar: $${c.roundToInt()}
        ***********************************
    """
            )
        }else{
            println("El pedido debe ser mínimo 20 donas")
        }
    }catch(e: Exception){
        println("Se deben ingresar un numero entero, intenta nuevamente")
    }
    main()
}