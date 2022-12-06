val cantidadIngrediente = arrayOf(
    20.0,
    1.0,
    7.4,
    3.75,
    1.5,
    0.15,
    0.5,
    12.0
)

var nombrePrograma: String? = null

fun main() {

    println(nombrePrograma!!)
    nombrePrograma = "\n## Ingredientes y costo de pedidos de donas ##"

    print("\nTotal de donas a elaborar: ")
    val tot = readLine()!!.toInt()

    val c = if (tot < 100) {
        tot * 6.0
    } else {
        tot * 5.55
    }

    println(
        """
        ***********************************
        Ingredientes para $tot donas

        Harina       | ${Math.round(cantidadIngrediente[1] * tot)} gramos
        Levadura     | ${Math.round(cantidadIngrediente[2] * tot)} gramos
        Azucar       | ${Math.round(cantidadIngrediente[3] * tot)} gramos
        Leche        | ${Math.round(cantidadIngrediente[4] * tot)} mililitros
        Mantequilla  | ${Math.round(cantidadIngrediente[5] * tot)} gramos
        Huevo        | ${Math.round(cantidadIngrediente[6] * tot)} huevos
        Sal          | ${Math.round(cantidadIngrediente[7] * tot)} gramos
        Aceite       | ${Math.round(cantidadIngrediente[8] * tot)} mililitros
        ***********************************
        Total a cobrar: $${Math.round(c)}
        ***********************************
    """
    )

    main()

}