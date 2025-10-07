/**
 * ConcretePrototype A: Modelo de Currículo.
 */
class Curriculo implements Documento {
    private String cor;
    private String fonte;
    private String logo;
    private String conteudo; // Conteúdo estrutural do currículo

    public Curriculo() {
        // Simula o carregamento de uma estrutura complexa
        this.conteudo = "Estrutura Padrão de Currículo: [Dados Pessoais], [Experiência], [Educação]";
        this.cor = "Azul Padrão";
        this.fonte = "Arial";
        this.logo = "Sem Logo";
    }

    @Override
    public void personalizar(String cor, String fonte, String logo) {
        this.cor = cor;
        this.fonte = fonte;
        this.logo = logo;
    }

    @Override
    public Documento clonar() {
        System.out.println("Clonando modelo de Currículo...");
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            // Isso não deveria acontecer, já que implementamos Cloneable
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void exibir() {
        System.out.println("--- CURRÍCULO ---");
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Cor: " + cor + ", Fonte: " + fonte + ", Logo: " + logo);
        System.out.println("-----------------");
    }
}