/**
 * ConcretePrototype B: Modelo de Proposta Comercial.
 */
class PropostaComercial implements Documento {
    private String cor;
    private String fonte;
    private String logo;
    private String conteudo;

    public PropostaComercial() {
        this.conteudo = "Estrutura Padrão de Proposta: [Introdução], [Solução], [Preços], [Termos]";
        this.cor = "Cinza Corporativo";
        this.fonte = "Times New Roman";
        this.logo = "Logo Padrão";
    }

    @Override
    public void personalizar(String cor, String fonte, String logo) {
        this.cor = cor;
        this.fonte = fonte;
        this.logo = logo;
    }

    @Override
    public Documento clonar() {
        System.out.println("Clonando modelo de Proposta Comercial...");
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void exibir() {
        System.out.println("--- PROPOSTA COMERCIAL ---");
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Cor: " + cor + ", Fonte: " + fonte + ", Logo: " + logo);
        System.out.println("------------------------");
    }
}