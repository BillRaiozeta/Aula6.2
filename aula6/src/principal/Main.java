package principal;

import java.util.Scanner;

import Entindade.Livro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Livro harry = new Livro ();
               Scanner sc = new Scanner(System.in);
              
               System.out.println("Informe os dados do livro");
               System.out.println("Livro");
               harry.livro= sc.nextLine();
               System.out.println("Autor");
               harry.autor= sc.nextLine();
               System.out.println("Quantidade");
               harry.quantidade= sc.nextInt();
               System.out.println("Valor");
               harry.valor=sc.nextDouble();
               System.out.println(harry.toString());
               

               System.out.println("Informe a quantidade de livros emprestados");
               int quantidade = sc. nextInt();
               harry.emprestaLivro(quantidade);
               System.out.println("Dados atualizados: " + harry);
               
               
               System.out.println("Informe a quantidade de livros devolvidos");
               int quantidade1 = sc. nextInt();
               harry.devolveLivro(quantidade);
               System.out.println("Dados atualizados: " + harry);
               
               
              
            
               ;
               
               System.out.println(harry);
       
               
               sc.close();
	}

}
