public class MinhaClasse {
    public static void main( String [] args) {
        // Contantes recebem a palavra final
        // String BR = "Brasil"
        final String BR = "Brasil";

        // Regras de variáveis

        /* 
         * Regras para nome de variáveis
         * Contem: 
         * - Letras
         * - _ (underline)
         * - $ (sifrão)
         * - numeros de 0 a 9
         * 
         * O que pode colocar no início de variável?
         * - Letras
         * - _ (underline)
         * - (jamais numeros)
         * 
         * Devem iniciar com a primeira letra minúscula.
         * Não pode conter espaços
         * Não pode utilizar palavras chaves
         * O nome deve ser único
         */


        System.out.println("Teste");

        String primeiroNome = "Alyson";
        String segundoNome = "Ronnan";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
