# CLASE BLOCKCHAIN

## ATRIBUTOS

- *blockChain* el blockchain lo componen las transacciones de pigcoins que han
realizado los propietarios de las wallets.

## MÉTODOS

- *addOrigin(transaction)* añade al blockchain una transacción que **crea moneda**. No
se trata de transacciones entre wallets. Es el sistema el que genera pigcoins y se los
envía a una wallet.

- *processTransactions(pKey_sender, pKey_recipient, consumedCoins, message
signedTransaction)* procesa las transacciones que las wallet envían. Añade las
transacciones al blockchain cuando se ha verificado que su firma es auténtica y que los
pigcoins que utiliza no se han gastado antes (double spend).

- *isConsumedCoinValid(consumedCoins)* verifica que los pigcoins que se intentan
enviar en la transacción no se han gastado antes, es decir, que provienen de una
transacción que no ha sido utilizada ya.

- *isSignatureValid(pKey_sender, message, signedTransaction)* verifica que la
firma de la transacción es válida, utilizando la clave pública de la wallet que envía los pigcoins.

- *createTransaction(pKey_sender, pKey_recipient, consumedCoins, message,
signedTransaction)* añade al blockchain una transacción cuando todo es correcto.

- *loadInputTransactions(PublicKey address)* carga en la wallet las transacciones
que tienen como destino esa dirección o clave pública.

- *loadOutputTransactions(PublicKey address)* carga en la wallet las transacciones
que tienen como origen esa dirección o clave pública.

*loadWallet(PublicKey address)* carga en la wallet los pigcoins envidos y recibidos
en esa dirección.

- *summarize()* visualiza el blockchain

- *summarize(index)* visualiza una transacción del blockchain situada en la posición index
