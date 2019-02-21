CLASE TRANSACTION

Una transacci�n es una transferencia de pigcoins entre dos wallets.

ATRIBUTOS

� hash es el identificador de la transacci�n en el Blockchain.
prev_hash es el identificador de la transacci�n previa donde se originaron los los
pigcoins que ahora pretendes gastar.
�

PublicKey pKey_sender es la direcci�n p�blica de la wallet desde la que se env�an
los pigcoins. Para nosotros es tambi�n la clave p�blica de la Wallet.
�

PublicKey pKey_recipient es la direcci�n p�blica de la wallet a la que se env�an los
pigcoins (el monedero que los recibe). Para nosotros es tambi�n la clave p�blica de la
Wallet.
�

� pigcoins es la cantidad de pigcoins que se env�an.
message es el mensaje que acompa�a a la transacci�n y que escribe el usuario/a que
env�a los pigcoins.
�

byte[] signature es el mensaje message firmado con la clave privada del usuario/a
que genera (env�a) la transacci�n.
�

M�TODOS

Esta clase no tiene l�gica, s�lo getters y setters . Si programas las historias de usuario
indicadas en App.java construir�s los getters y setters necesarios.

toString() devuelve la representaci�n en String de un objeto de la clase
Transaction .