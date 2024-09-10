import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = sc.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = sc.nextInt();

    try {
      //chamando o método contendo a lógica de contagem
      contar(parametroUm, parametroDois);

    }catch (ParametrosInvalidosException e) {
      //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }

  }

  static void contar(Integer parametroUm, Integer parametroDois) throws ParametrosInvalidosException{

    if(parametroUm >= parametroDois){
      throw new ParametrosInvalidosException();
    }

    Integer contagem = parametroDois - parametroUm;

    for(int i= 1; i <= contagem; i++){
      System.out.println("Imprimindo o número " + i);
    }



  }

}
