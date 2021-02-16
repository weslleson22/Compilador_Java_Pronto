public class IsiComp{
	public static void main(String args[]){
		try{
			MeuLexer lexer = new MeuLexer(System.in);
			MeuParser parser = new MeuParser(lexer);

			System.out.println("Starting Compiling Process...");

			parser.prog();
			
			System.out.println("Compilation Finishted!");

		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
		}
	}
}