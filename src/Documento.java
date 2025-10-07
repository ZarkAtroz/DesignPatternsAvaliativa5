/**
 * A interface Prototype.
 * Declara um método de clonagem. Em Java, é comum usar a interface Cloneable
 * e sobrescrever o método clone() da classe Object.
 */
interface Documento extends Cloneable {
    Documento clonar();
    void personalizar(String cor, String fonte, String logo);
    void exibir();
}