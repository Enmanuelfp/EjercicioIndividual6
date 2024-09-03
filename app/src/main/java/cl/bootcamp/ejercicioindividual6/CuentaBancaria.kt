package cl.bootcamp.ejercicioindividual6

class CuentaBancaria(
    var nombreCuenta:String,
    var saldoDisponible:Double)
{

    private var historialTransacciones : MutableList<String> = mutableListOf()

    fun deposito(monto:Double){
        saldoDisponible += monto;
        historialTransacciones.add("Deposito de $monto realizado")
    }

    fun retiro(monto: Double){
        if (monto > saldoDisponible){
            println("No tienes monto suficiente para realizar este retiro")
            historialTransacciones.add("Retiro fallido, saldo insuficiente")
        } else{
            saldoDisponible -=monto
            historialTransacciones.add("Retiro exitoso por $monto")
        }
    }

    fun mostrarSaldo(){
        println("Su saldo disponible es: $saldoDisponible")
        historialTransacciones
    }

    fun mostrarHistorial(){
        println("Historial de transacciones: $nombreCuenta")
        println("---------------------------")
        historialTransacciones.forEach{println(it)}
    }


}