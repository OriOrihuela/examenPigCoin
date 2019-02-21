# CLASE WALLET

***Esta clase representa una wallet o monedero donde el usuario/a visualiza los pigcoins que "posee" y desde donde los envia o recibe***.

## ATRIBUTOS
- ```PublicKey address``` es la **dirección pública** o **clave pública** de la wallet, que se usa para enviar y recibir pigcoins.

- ```PrivateKey sKey``` es la **clave privada** de la wallet. **Sólo es conocida por el propietario de la wallet**. Se usa para firmar 
los mensajes de las transacciones que se envían desde esta wallet, para que el blockchain pueda validar que son auténticas. 
No se envía nunca ni se hace pública.

- ```total_input``` el total de pigcoins que han sido recibidos en esta wallet, es decir, que han sido enviados a esta dirección pública 
desde el comienzo del *blockchain*.

- ```total_output``` el total de pigcoins que se han enviado desde esta wallet, es decir, que se han enviado desde esta 
dirección pública desde el comienzo del *blockchain*.

- ```balance``` son los pigcoins que "posee" este usuario. Son los pigcoins recibidos menos los enviados. No puede ser negativo.

- ```inputTransactions``` son las transacciones que tienen como destino esta dirección pública o wallet.

- ```outputTransactions``` son las transacciones que tiene como origen esta dirección pública o wallet (las transacciones que se 
han enviado desde esta).

## MÉTODOS 

*Es el propio usuario/a el que genera el par. No depende de ninguna autoridad externa.*

- ```generateKeyPair()``` genera el par clave privada - clave pública para la wallet utilizando la clase *GenSig*.

- ```setAddress(PublicKey pKey)``` establece la clave pública o dirección pública de la wallet.

- ```setSK(PrivateKey sKey)``` establece la clave privada de la wallet.

- ```getAddress()``` devuelve la dirección pública de la wallet.

- ```getSKey()``` devuelve la clave privada de la wallet.

- ```loadCoins(bChain)``` carga en la wallet el total de pigcoins recibidos y enviados desde esta wallet o dirección pública.

- ```loadInputTransactions(bChain)``` carga en la wallet las transacciones del *blockchain* que tienen como destino esta dirección 
pública.

- ```loadOutputTransactions(bChain)``` carga en la wallet las transacciones del *blockchain* que tienen como origen esta dirección 
pública.

- ```sendCoins(pKey_recipient, coins, message, bChain)``` envía la cantidad de pigcoins indicada a la dirección (clave pública) indicada, con un mensaje. Es decir,
intenta añadir al blockchain una nueva transacción.

- ```byte[] signTransaction(message)``` firma el mensaje que acompaña transacción. El *blockchain* verificará que esta firma es 
auténtica antes de aceptar la transacción y añadirla a la cadena de bloques.

- ```toString()``` devuelve la representación en String de un objeto de la clase ```Wallet```.

- ```collectCoins(pigcoins)``` recorre las transacciones recibidas y enviadas a la wallet para recolectar el número de pigcoins que se 
quieren enviar en la transacción. La lógica es la siguiente:

1. Primero descarta las transacciones que hemos recibido que ya se han utilizado para
enviar pigcoins en transacciones anteriores. Son las transacciones que ya se han
enviado desde tu wallet. Los pigcoins de una transacción recibida sólo pueden
utilizarse una vez. Les llamamos transacciones consumidas.

2. Si el total de pigcoins a enviar es igual a una transacción recibida que no ha sido
consumida, puedes utilizarla para enviar sus pigcoins.

3. Si el total de pigcoins a enviar es menor que una transacción recibida que no ha sido
consumida, genera dos transacciones (change address): una para el destinatario/a y otra
para ti. Ejemplo: si quieres enviar 8 pgc y sólo dispones de una transacción recibida de
10 pgc, enviarás dos transacciones: una de 8 pgc para el destinatario/a y 2 pgc para tí
mismo/a. A esto se la llama change address.

4. Si el total de pigcoins a enviar es mayor que una transacción recibida que no ha sido
consumida, puedes enviar sus pigcoins, pero necesitas encontrar otras transacciones
hasta completar el total de pigcoins a enviar.
