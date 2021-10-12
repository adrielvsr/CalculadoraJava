import java.util.Scanner;

public class calc {

    static public void main(String[] args){

        Scanner scan=new Scanner(System.in);

        numero n1=new numero();
        numero n2=new numero();
        numero res=new numero();


        String opc="S";

        while(opc.equals("s") || opc.equals("S")){
        
        System.out.printf("%n%nCalculadora Simples");

        System.out.printf("%n%n");

        System.out.printf("Digite o valor 1: ");
        n1.setValor(scan.nextInt());

        System.out.printf("Digite o valor 2: ");
        n2.setValor(scan.nextInt());

        System.out.printf("Operações");
        System.out.printf("%n%n%n");
        System.out.printf("1 para adição");
        System.out.printf("%n");
        System.out.printf("2 para subtração");
        System.out.printf("%n");
        System.out.printf("3 para divisão");
        System.out.printf("%n");
        System.out.printf("4 para multiplicação");
        System.out.printf("%n%n");
        
        String operacao;

        System.out.printf("Digite a operação: ");
        
        operacao=scan.next();
             if (operacao.equals ( "1" )){
            res.setValor(n1.getValor()+n2.getValor());  
            System.out.printf("%n>>>>  A soma de %d com %d e igual a %d  <<<<",n1.getValor(),n2.getValor(),res.getValor());
             } else if (operacao.equals ( "2" )){
            res.setValor(n1.getValor()-n2.getValor());
            System.out.printf("%n>>>>  A subtração de %d com %d e igual a %d  <<<<",n1.getValor(),n2.getValor(),res.getValor());
              } else if(operacao.equals( "3" )){
            res.setValor(n1.getValor()/n2.getValor());
            System.out.printf("%n>>>>  A divisão de %d com %d e igual a %d <<<<",n1.getValor(),n2.getValor(),res.getValor());
             } else if(operacao.equals( "4" )){
            res.setValor(n1.getValor()*n2.getValor());
            System.out.printf("%n>>>>  A multiplicação de %d com %d e igual a %d  <<<<",n1.getValor(),n2.getValor(),res.getValor());
              } else {
            System.out.printf("Operação inválida");
        
     }

        

        
        System.out.printf("%n%nDeseja Realizar outra operação? %nS para sim e N para não: ");
        opc=scan.next();
        System.out.printf("%n%n%n");

        }
    }
    
    
}
