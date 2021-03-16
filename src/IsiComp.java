public class IsiComp{
	public static void main(String args[]){
		try{
			MeuLexer lexer = new MeuLexer(System.in);
			MeuParser parser = new MeuParser(lexer);

			System.out.println("Iniciando o Processo de Compilação...");

			
                        
			parser.prog();
                        System.out.println("");
                        System.out.println("return 0;");
                        System.out.println("}");
			System.out.println("Compilação concluída!");
			System.out.println();
                        

		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
		}
	}
}