package cl.bootcamp.ejercicioindividual6

fun main(){

    var cuenta1 = CuentaBancaria("Cuenta de Juan", 50000.0)
    var cuenta2 = CuentaBancaria("Cuenta de maria",30000.0)
    var cuenta3 = CuentaBancaria("Cuenta de Ana",100000.0)

    cuenta1.deposito(20000.0)
    cuenta1.retiro(15000.0)
    cuenta1.retiro(60000.0)// este retiro es fallido
    cuenta1.deposito(10000.0)
    cuenta1.retiro(10000.0)

    cuenta2.deposito(5000.0)
    cuenta2.retiro(10000.0)
    cuenta2.deposito(15000.0)
    cuenta2.retiro(5000.0)
    cuenta2.retiro(5000.0)

    // Transacciones para cuenta3
    cuenta3.retiro(25000.0)
    cuenta3.deposito(50000.0)
    cuenta3.retiro(30000.0)
    cuenta3.retiro(15000.0)
    cuenta3.deposito(10000.0)

    cuenta1.mostrarHistorial()
    cuenta2.mostrarHistorial()
    cuenta3.mostrarHistorial()

}