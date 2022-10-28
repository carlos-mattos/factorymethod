public class ServicoRacao {

    public static IRacao obterServico(String marca) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName(marca);
            objeto = classe.getDeclaredConstructor().newInstance();

        } catch (Exception ex) {
            throw new IllegalArgumentException("marca inexistente");
        }

        if (!(objeto instanceof IRacao)) {
            throw new IllegalArgumentException("marca inválida");
        }

        return (IRacao) objeto;
    }

}
