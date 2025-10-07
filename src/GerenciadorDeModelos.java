import java.util.HashMap;
import java.util.Map;
/**
 * Um "Gerenciador de Protótipos" ou "Registro".
 * Armazena os protótipos prontos para serem clonados.
 */
class GerenciadorDeModelos {
    private static Map<String, Documento> registroDeModelos = new HashMap<>();

    // Carrega os modelos iniciais que servirão de protótipo
    static {
        registroDeModelos.put("CV", new Curriculo());
        registroDeModelos.put("PROPOSTA", new PropostaComercial());
    }

    public static Documento obterModelo(String chave) {
        Documento modelo = registroDeModelos.get(chave);
        return (modelo != null) ? modelo.clonar() : null;
    }
}