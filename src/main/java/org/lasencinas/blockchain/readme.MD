CLASE BLOCKCHAIN

ATRIBUTOS

blockChain el blockchain lo componen las transacciones de pigcoins que han
realizado los propietarios de las wallets.
�

M�TODOS

addOrigin(transaction) a�ade al blockchain una transacci�n que crea moneda. No
se trata de transacciones entre wallets. Es el sistema el que genera pigcoins y se los
env�a a una wallet.
�

processTransactions(pKey_sender, pKey_recipient, consumedCoins, message
signedTransaction) procesa las transacciones que las wallet env�an. A�ade las
transacciones al blockchain cuando se ha verificado que su firma es aut�ntica y que los
pigcoins que utiliza no se han gastado antes (double spend).
�

isConsumedCoinValid(consumedCoins) verifica que los pigcoins que se intentan
enviar en la transacci�n no se han gastado antes, es decir, que provienen de una
transacci�n que no ha sido utilizada ya.
�

isSignatureValid(pKey_sender, message, signedTransaction) verifica que la
firma de la transacci�n es v�lida, utilizando la clave p�blica de la wallet que env�a los
�

pigcoins.
createTransaction(pKey_sender, pKey_recipient, consumedCoins, message,
signedTransaction) a�ade al blockchain una transacci�n cuando todo es correcto.
�

loadInputTransactions(PublicKey address) carga en la wallet las transacciones
que tienen como destino esa direcci�n o clave p�blica.
�

loadOutputTransactions(PublicKey address) carga en la wallet las transacciones
que tienen como origen esa direcci�n o clave p�blica.
�

loadWallet(PublicKey address) carga en la wallet los pigcoins envidos y recibidos
en esa direcci�n.
�

� summarize() visualiza el blockchain
summarize(index) visualiza una transacci�n del blockchain situada en la posici�n
index