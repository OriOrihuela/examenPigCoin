CLASE TRANSACTION

Una transacción es una transferencia de pigcoins entre dos wallets.

ATRIBUTOS

• hash es el identificador de la transacción en el Blockchain.
prev_hash es el identificador de la transacción previa donde se originaron los los
pigcoins que ahora pretendes gastar.
•

PublicKey pKey_sender es la dirección pública de la wallet desde la que se envían
los pigcoins. Para nosotros es también la clave pública de la Wallet.
•

PublicKey pKey_recipient es la dirección pública de la wallet a la que se envían los
pigcoins (el monedero que los recibe). Para nosotros es también la clave pública de la
Wallet.
•

• pigcoins es la cantidad de pigcoins que se envían.
message es el mensaje que acompaña a la transacción y que escribe el usuario/a que
envía los pigcoins.
•

byte[] signature es el mensaje message firmado con la clave privada del usuario/a
que genera (envía) la transacción.
•

MÉTODOS

Esta clase no tiene lógica, sólo getters y setters . Si programas las historias de usuario
indicadas en App.java construirás los getters y setters necesarios.

toString() devuelve la representación en String de un objeto de la clase
Transaction .