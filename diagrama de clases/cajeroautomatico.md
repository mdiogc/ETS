<div align="justify">

## Diagrama de clases de un cajero automático
En este diagrama, podemos identificar las siguientes clases:

1. **Cliente**: Representa a un usuario que interactúa con el cajero automático.

2. **Cuenta Bancaria**: Representa la cuenta del cliente en el banco.

3. **Cajero Automático**: El dispositivo físico que permite a los clientes realizar transacciones.

4. **Transacción**: Clase que maneja las operaciones financieras, como retiros, depósitos y transferencias.


```
+---------------------+          +---------------------+
|      Cliente        |          |   Cuenta Bancaria   |
+---------------------+          +---------------------+
| - nombre            |          | - númeroCuenta       |
| - identificación    |          | - saldo              |
+---------------------+          +---------------------+
| + realizarRetiro()  |          | + consultarSaldo()  |
| + realizarDepósito()|          | + realizarTransferencia()|
+---------------------+          +---------------------+
           |                               |
           |                               |
           v                               v
+---------------------+          +---------------------+
|  Cajero Automático  |          |    Transacción      |
+---------------------+          +---------------------+
| - ubicación         |          | - tipoTransacción    |
| - modelo            |          | - monto              |
+---------------------+          +---------------------+
| + realizarOperación()|         | + registrarTransacción()|
+---------------------+          +---------------------+
```



</div>