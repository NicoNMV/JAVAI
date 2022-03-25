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
public class javaidenovo {
    
    public static void main(){
        Scanner leitor = new Scanner(System.in);
        int HorasExt = leitor.nextInt();
        int FaltaHora = leitor.nextInt();
        int result = (HorasExt) -(2/3 * (FaltaHora));
        System.out.println(ToHour(result));
    }
    public static float ToHour(int min){
        return min * 60;
    }
}
