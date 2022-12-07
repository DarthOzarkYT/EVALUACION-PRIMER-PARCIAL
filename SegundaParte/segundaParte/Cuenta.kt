package segundaParte

class Cuenta(var clabeCuenta: String, var titularCuenta: String, var saldoCuenta: Float) {
    fun depoCuenta(){
        try{
            print("Ingresa la cantidad a depositar: ")
            depo= readLine()!!.toFloat()
        }catch(e: Exception){
            println("Monto incorrecto")
            main()
        }
        saldoCuenta += depo
        println("""
            -------------- Recibo --------------
            Clabe: $clabeCuenta - Titular: $titularCuenta
            
            Accion: Deposito dinero
            Deposito: $depo
            Saldo anterior: ${saldoCuenta-depo}
            Nuevo Saldo: $saldoCuenta 
        """.trimIndent())
    }

    fun retirarCuenta(){
        try{
            print("Ingresa la cantidad a retirar: ")
            ret = readLine()!!.toFloat()
        }catch (e: NumberFormatException){
            println("Monto incorrecto")
            main()
        }
        if(ret>saldoCuenta){
            println("El monto a retirar $ret no puede ser mayor que $saldoCuenta")
            println("No se pudo realizar la acción solicitada")
            main()
        }else{
            saldoCuenta -= ret
            println("""
            -------------- Recibo --------------
            Clabe: $clabeCuenta - Titular: $titularCuenta
            
            Accion: Retiro dinero
            Monto: $ret
            Saldo anterior: ${saldoCuenta+ret}
            Nuevo Saldo: $saldoCuenta 
        """.trimIndent())
        }
    }
}