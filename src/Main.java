// Questão 5: Código
public class Main {
    public static void main(String[] args) {
        // 1. Obter um modelo de currículo a partir do gerenciador.
        // A fábrica retorna um CLONE, não o original.
        Documento curriculoClienteA = GerenciadorDeModelos.obterModelo("CV");

        if (curriculoClienteA != null) {
            // 2. Personalizar a cópia para um cliente específico.
            curriculoClienteA.personalizar("Verde", "Calibri", "Logo Cliente A");
            System.out.println("\nDocumento gerado para Cliente A:");
            curriculoClienteA.exibir();
        }

        // 3. Obter outro currículo e personalizá-lo para outro cliente.
        Documento curriculoClienteB = GerenciadorDeModelos.obterModelo("CV");
        if (curriculoClienteB != null) {
            curriculoClienteB.personalizar("Roxo", "Verdana", "Logo Cliente B");
            System.out.println("\nDocumento gerado para Cliente B:");
            curriculoClienteB.exibir();
        }

        // 4. Fazer o mesmo para uma proposta comercial
        Documento propostaClienteC = GerenciadorDeModelos.obterModelo("PROPOSTA");
        if (propostaClienteC != null) {
            propostaClienteC.personalizar("Preto", "Georgia", "Logo Cliente C");
            System.out.println("\nDocumento gerado para Cliente C:");
            propostaClienteC.exibir();
        }
    }
}