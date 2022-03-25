/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javai;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Javai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // METODOS DOS EXERCICIOS
        
        //um();
        //dois();
        //tres();
        //quatro();
        cinco();
    }
    public static void extenso(String a, int b){
		// O valor do parametro 'a' é a coluna, o 'b' é a linha  ( eu posso ter invertido linha com coluna )
		// por isso, se 'a' for '5' e 'b' for '2' o valor retornado será "cinquenta"
        String[][] unidade = {
            {"dez","zero", "", "", ""}, // 0
            {"onze","um", "", "cento", "mil"}, // 1
            {"doze", "dois", "vinte", "duzentos", "dois mil"}, // 2
            {"treze", "três", "trinta", "trezentos", "três mil"}, // 3
            {"quatorze", "quatro", "quarenta", "quatrocentos", "quatro mil"}, // 4
            {"quinze", "cinco", "cinquenta", "quinhentos", "cinco mil"}, // 5
            {"dezesseis", "seis", "sessenta", "seiscentos", "seis mil"}, // 6
            {"dezesete", "sete", "setenta", "setecentos", "sete mil"}, // 7
            {"dezoito", "oito", "oitenta", "oitocentos", "oito mil"}, // 8
            {"dezenove", "nove", "noventa", "novecentos", "nove mil"} // 9
            //   0         1         2          3             4
        };
		// Converto o 'a' ( que veio como String ), para inteiro. e passo ele como primeiro parametro da matriz 'unidade',
		// o b já está em inteiro então só passo ele.
        System.out.print(unidade[ Integer.parseInt((a)) ][b]); 
    }
    public static void um(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero");
        String num = leitor.nextLine();
        leitor.close();
        
        // Definindo variaveis
        String cen = "",
                dez = "",
                uni = "",
                mii = ""; 

        uni += num.charAt(num.length() - 1); // Pega o valor da Unidade

        if(num.length() > 3){ // Verifica se existem mais de 3 casas, ou seja, se é um milenio
            mii += num.charAt( num.length() - 4 ); // Pega o valor do milenio
            if(num.charAt( num.length() - 4 ) != '0'){ // Verifica se for zero, caso seje, não o escreve na tela
                extenso(mii, 4);
                System.out.print(" ");

            }
        }
        if(num.length() > 2){ // Verifica se existem mais de 2 casas, ou seja, se é uma centena
            cen += num.charAt( num.length() - 3 ); // Pega o valor da centena
            if(num.charAt( num.length() - 3 ) != '0'){ // Verifica se for zero, caso seje, não o escreve na tela
                extenso(cen, 3);
                if(num.charAt( num.length() - 2) != '0')
                System.out.print(" e "); // Aqui ele digita o "e" dos numeros, é melhor deixar nessas horas pra não dar erro

            }
        }
        if(num.length() > 1){ // Verifica se a dezena existe
            dez += num.charAt( num.length() - 2); // Pega o valor da dezena
            if(num.charAt( num.length() - 2) != '0') { // Verifica se for zero, caso seje, não o escreve na tela
                if(num.charAt( num.length() - 2) == '1') // Faz a casa dos 10, [onze,doze,treze...]
                    extenso(uni, 0);
                else{ // Senão... As demais dezenas
    
                    extenso(dez, 2);
                    if(num.charAt( num.length() - 1) != '0')
                    System.out.print(" e ");
                }
            }
        }
        try { // Este tenta executar mesmo existindo uma dezena
            if(num.charAt( num.length() - 2) != '1') // Verifica se já existe 
            extenso(uni, 1);
        } catch (Exception e) { // se a dezena não existir ele executa o número normalmente 
            extenso(uni, 1);
        }
    }
    
    
    public static void dois(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int num = leitor.nextInt();
        int result = num;
        int i = 1;
        while(num > 0){
            System.out.println("Digite outro valor");
            num = leitor.nextInt();
            
            if(num > 0){
                result += num;
                i++;
            }      
        }
        System.out.println("A media foi: " + (result / i));
    }
    
    public static void tres(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = leitor.nextInt();
        int i = 0;
        int result = 0;
        while(i <= n){
            result += i;
            i++;
        }
        System.out.println(result);
    }
    public static void quatro(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o horário de entrada");
        int horas = leitor.nextInt();
        for(int h = 0; h < 6; h++){
            horas++;
            if(horas > 23) horas = 0;
        }
        System.out.println(horas >= 12 ? horas + " PM" : horas + " AM");
        
    }
    
    public static void cinco() {
        float[] premios = {500, 400, 300, 200, 100};
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite quantos minutos extras:");
        int HorasExtras = leitor.nextInt();
        System.out.println("Digite quantos minutos faltados:");
        int FaltaHoras = leitor.nextInt();
        // HorasExtras - ((2/3) * FaltaHoras);
        int result = HorasExtras - FaltaHoras * 2 / 3;
        System.out.println ("Horas Extras: " + ToHour(HorasExtras));
        System.out.println ("Horas Falta: " + ToHour(FaltaHoras));
        System.out.print ("Premio : R$");
        
        if(result > 2400) System.out.print (premios[0]);
        else if(result > 1801) System.out.print (premios[1]);
        else if(result > 1201) System.out.print (premios[2]);
        else if(result > 600) System.out.print (premios[3]);
        else System.out.print (premios[4]);
        
        
    }
    public static float ToHour(float min) {
        float result = 0;
        
        result = min / 60;
        return result;
        
    }
}
   